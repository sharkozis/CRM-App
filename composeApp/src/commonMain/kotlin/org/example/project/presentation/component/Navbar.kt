package org.example.project.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icHome
import com.composables.icMessage
import com.composables.icUser
import com.composables.icWallet
import org.example.project.presentation.theme.GradientMain
import org.example.project.presentation.theme.grayTextColor

@Composable
fun Navbar(
    currentTab: NavbarTab = NavbarTab.Campaigns,
    onTabSelected: (NavbarTab) -> Unit = {},
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableStateOf(currentTab) }

    val tabs = listOf(
        Triple(NavbarTab.Campaigns, icHome, "Campaigns"),
        Triple(NavbarTab.Wallet, icWallet, "Wallet"),
        Triple(NavbarTab.Chat, icMessage, "Chat"),
        Triple(NavbarTab.Profile, icUser, "Profile"),
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {

        // Blur + translucent background layer
        Box(
            modifier = Modifier
                .matchParentSize()
                .graphicsLayer {
                    compositingStrategy = CompositingStrategy.Offscreen
                }
                .background(Color.White)
                .blur(100.dp)
        )

        // Foreground navbar content (NOT blurred)
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabs.forEach { (tab, icon, label) ->
                NavbarTabItem(
                    icon = icon,
                    label = label,
                    isSelected = selectedTab == tab,
                    onClick = {
                        selectedTab = tab
                        onTabSelected(tab)
                    }
                )
            }
        }
    }
}

@Composable
private fun NavbarTabItem(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        // Icon — gradient when selected, gray when not
        Image(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier
                .size(24.dp)
                // CompositingStrategy.Offscreen is required for BlendMode.SrcIn to work correctly
                .graphicsLayer { compositingStrategy = CompositingStrategy.Offscreen }
                .then(
                    if (isSelected) {
                        Modifier.drawWithCache {
                            onDrawWithContent {
                                drawContent()
                                drawRect(
                                    brush = GradientMain,
                                    blendMode = BlendMode.SrcIn
                                )
                            }
                        }
                    } else {
                        // Gray tint for non-selected
                        Modifier.drawWithCache {
                            onDrawWithContent {
                                drawContent()
                                drawRect(
                                    color = grayTextColor,
                                    blendMode = BlendMode.SrcIn
                                )
                            }
                        }
                    }
                )
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Text — gradient when selected, gray when not
        if (isSelected) {
            Text(
                text = label,
                style = TextStyle(
                    brush = GradientMain,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        } else {
            Text(
                text = label,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = grayTextColor
            )
        }
    }
}

enum class NavbarTab {
    Campaigns,
    Wallet,
    Chat,
    Profile
}
