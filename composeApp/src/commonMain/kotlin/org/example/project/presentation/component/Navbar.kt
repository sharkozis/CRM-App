package org.example.project.presentation.component

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.scale
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
    val tabs = listOf(
        Triple(NavbarTab.Campaigns, icHome, "Campaigns"),
        Triple(NavbarTab.Wallet, icWallet, "Wallet"),
        Triple(NavbarTab.Chat, icMessage, "Chat"),
        Triple(NavbarTab.Referral, icMessage, "Referral"),
        Triple(NavbarTab.Profile, icUser, "Profile"),
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(72.dp)
            .background(Color.White)
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        tabs.forEach { (tab, icon, label) ->
            NavbarTabItem(
                icon = icon,
                label = label,
                isSelected = currentTab == tab,
                onClick = { onTabSelected(tab) }
            )
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
    // Scale: spring bounce on selection (Android M3 style)
    val iconScale by animateFloatAsState(
        targetValue = if (isSelected) 1.15f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "iconScale"
    )

    // Label alpha: fade in smoothly when selected
    val labelAlpha by animateFloatAsState(
        targetValue = if (isSelected) 1f else 0.55f,
        animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing),
        label = "labelAlpha"
    )

    // Indicator pill width: expands when selected
    val indicatorWidth by animateDpAsState(
        targetValue = if (isSelected) 32.dp else 0.dp,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing),
        label = "indicatorWidth"
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null, // suppress ripple; animation is the feedback
                onClick = onClick
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        // Animated indicator pill above icon (Material 3 NavigationBar style)
        Box(
            modifier = Modifier
                .width(indicatorWidth)
                .height(3.dp)
                .clip(RoundedCornerShape(50))
                .then(
                    if (isSelected) {
                        Modifier.drawWithCache {
                            onDrawWithContent {
                                drawContent()
                                drawRect(brush = GradientMain)
                            }
                        }
                    } else Modifier.background(Color.Transparent)
                )
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Icon with spring scale + gradient/gray tint
        Image(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier
                .size(24.dp)
                .scale(iconScale)
                .graphicsLayer { compositingStrategy = CompositingStrategy.Offscreen }
                .then(
                    if (isSelected) {
                        Modifier.drawWithCache {
                            onDrawWithContent {
                                drawContent()
                                drawRect(brush = GradientMain, blendMode = BlendMode.SrcIn)
                            }
                        }
                    } else {
                        Modifier.drawWithCache {
                            onDrawWithContent {
                                drawContent()
                                drawRect(color = grayTextColor, blendMode = BlendMode.SrcIn)
                            }
                        }
                    }
                )
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Label with fade animation
        if (isSelected) {
            Text(
                text = label,
                style = TextStyle(
                    brush = GradientMain,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.graphicsLayer { alpha = labelAlpha }
            )
        } else {
            Text(
                text = label,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = grayTextColor.copy(alpha = labelAlpha),
            )
        }
    }
}

enum class NavbarTab {
    Campaigns,
    Wallet,
    Chat,
    Profile,
    Referral
}