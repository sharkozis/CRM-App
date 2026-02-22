package org.example.project.presentation.components.navbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icHome
import com.composables.icWallet
import com.composables.icMessage
import com.composables.icUser
import org.example.project.presentation.theme.PageSecondaryBg
import org.example.project.presentation.theme.grayTextColor

@Composable
fun Navbar(
    currentTab: NavbarTab = NavbarTab.Campaigns,
    onTabSelected: (NavbarTab) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.95f),
                        Color.White.copy(alpha = 0.90f)
                    )
                )
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavbarTabItem(
                icon = icHome,
                label = "Campaigns",
                isSelected = currentTab == NavbarTab.Campaigns,
                onClick = { onTabSelected(NavbarTab.Campaigns) }
            )
            NavbarTabItem(
                icon = icWallet,
                label = "Wallet",
                isSelected = currentTab == NavbarTab.Wallet,
                onClick = { onTabSelected(NavbarTab.Wallet) }
            )
            NavbarTabItem(
                icon = icMessage,
                label = "Chat",
                isSelected = currentTab == NavbarTab.Chat,
                onClick = { onTabSelected(NavbarTab.Chat) }
            )
            NavbarTabItem(
                icon = icUser,
                label = "Profile",
                isSelected = currentTab == NavbarTab.Profile,
                onClick = { onTabSelected(NavbarTab.Profile) }
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(
                    if (isSelected) PageSecondaryBg.copy(alpha = 0.12f)
                    else Color.Transparent
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = icon,
                contentDescription = label,
                modifier = Modifier.size(22.dp)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal,
            color = if (isSelected) PageSecondaryBg else grayTextColor
        )
    }
}

enum class NavbarTab {
    Campaigns,
    Wallet,
    Chat,
    Profile
}
