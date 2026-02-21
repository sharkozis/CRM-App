package org.example.project.presentation.screen.campaign.activeCampaign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.*
import org.example.project.presentation.theme.*

@Composable
fun ActiveCampaignScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PageSecondaryBg)
            .padding(horizontal = 24.dp)
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        // Top Bar
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Menu Icon (Left)
            Box(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .clip(RoundedCornerShape(12.dp))
                    // .background(PinkPrimary.copy(alpha = 0.4f))
                    .padding(horizontal = 18.dp, vertical = 4.dp), // Increased X, reduced Y
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = icMenu,
                    contentDescription = "Menu",
                    modifier = Modifier.size(24.dp)
                )
            }

            // Online Indicator Pill (Center)
            Row(
                modifier = Modifier
                    .align(Alignment.Center)
                    .shadow(elevation = 2.dp, shape = RoundedCornerShape(50.dp))
                    .background(Color.White, RoundedCornerShape(50.dp))
                    .padding(horizontal = 20.dp, vertical = 10.dp), // Slightly reduced Y padding for compactness
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(12.dp) // Adjusted dot size to match design
                        .clip(CircleShape)
                        .background(SuccessActive)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Online",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = MainTextCol
                )
            }

            // Notification Icon (Right)
            Image(
                imageVector = icAction,
                contentDescription = "Notification",
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .size(28.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Main Card Container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(14.dp),
                    clip = false
                )
                .background(Color.White, RoundedCornerShape(14.dp))
//                .padding(24.dp)
                .padding(start = 14.dp, top = 24.dp, end = 10.dp, bottom = 10.dp)
        ) {
            Column {
                // Header: SYSTEM STATUS
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        imageVector = icSystem,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "SYSTEM STATUS:",
                        fontSize = 18.sp,
//                        fontWeight = FontWeight.Bold,
                        color = MainTextCol
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Location Status Row
                StatusItem(
                    icon = icGps,
                    label = "Location:",
                    statusLabel = "Online",
                    showSwitch = true
                )

                Spacer(modifier = Modifier.height(10.dp))

                // Device Status Row
                StatusItem(
                    icon = icCpu,
                    label = "Device",
                    subtext = "IOT-8839201",
                    statusLabel = "Connected",
                    showSwitch = false
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Campaign Tabs Section
        var selectedTab by remember { mutableStateOf("Active") }
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(50.dp))
                .border(1.dp, grayTextColor, RoundedCornerShape(50.dp))
                .background(PageSecondaryBg)
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val tabs = listOf("Active", "Past", "Upcoming")
            tabs.forEach { tab ->
                val isSelected = selectedTab == tab
                val interactionSource = remember { MutableInteractionSource() }
                
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .then(
                            if (isSelected) Modifier
                                .shadow(elevation = 2.dp, shape = RoundedCornerShape(50.dp))
                                .background(Color.White)
                            else Modifier
                        )
                        .clickable(
                            interactionSource = interactionSource,
                            indication = null
                        ) { selectedTab = tab },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                         text = if (isSelected) tab.uppercase() else tab,
                         fontSize = 16.sp,
                         fontWeight = FontWeight.Medium,
                        color = if (isSelected) MainTextCol else grayTextColor
                    )
                }
            }
        }
    }
}

@Composable
fun StatusItem(
    icon: ImageVector,
    label: String,
    statusLabel: String,
    subtext: String? = null,
    showSwitch: Boolean = false
) {
    var checked by remember { mutableStateOf(true) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, BorderPink, RoundedCornerShape(14.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            Image(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(6.dp)) // Reduced gap
            Column {
                Text(
                    text = label,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MainTextCol,
                    lineHeight = 16.sp
                )
                // Removed Spacer or extra gap logic, using minimal spacing
                if (subtext != null) {
                    Text(
                        text = subtext,
                        fontSize = 8.sp,
                        color = grayTextColor,
                        lineHeight = 8.sp
                    )
                }
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            // Status Icon (Checkmark)
            Image(
                imageVector = icMark,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            
            Spacer(modifier = Modifier.width(6.dp)) // Reduced gap
            
            Text(
                text = statusLabel,
                fontSize = 18.sp,
                color = MainTextCol // Already set but ensuring consistency
            )

            if (showSwitch) {
                Spacer(modifier = Modifier.width(12.dp))
                Switch(
                    checked = checked,
                    onCheckedChange = { checked = it },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = PinkPrimary,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.LightGray,
                        checkedBorderColor = Color.Transparent,
                        uncheckedBorderColor = Color.Transparent
                    )
                )
            }
        }
    }
}
