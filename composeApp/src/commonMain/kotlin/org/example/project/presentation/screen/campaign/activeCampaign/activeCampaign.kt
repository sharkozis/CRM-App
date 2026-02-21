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
import kotlinproject.composeapp.generated.resources.Res
import org.example.project.presentation.theme.*
import kotlinproject.composeapp.generated.resources.ic_nexus
import org.example.project.presentation.component.PrimaryButton
import org.jetbrains.compose.resources.painterResource

@Composable
fun ActiveCampaignScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PageSecondaryBg)
            // .padding(horizontal = 24.dp) // Removed padding from root to allow 100% width backgrounds
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        // Top Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp) // Applied padding individually
        ) {
            // ... (Top Bar content remains same)
            // Menu Icon (Left)
            Box(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .clip(RoundedCornerShape(12.dp))
                    .padding(horizontal = 18.dp, vertical = 4.dp),
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
                    .padding(horizontal = 20.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(12.dp)
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

        // Main Card Container (SYSTEM STATUS)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp) // Applied padding individually
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(14.dp),
                    clip = false
                )
                .background(Color.White, RoundedCornerShape(14.dp))
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

        // Campaign Tabs and Detail Section Stack
        var selectedTab by remember { mutableStateOf("Active") }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            // Background White Surface (Starts halfway behind tabs)
            Box(
                modifier = Modifier
                    .fillMaxSize() // Fills 100% width because parent Box is fillMaxWidth and root padding is removed
                    .padding(top = 28.dp)
                    .clip(RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp))
                    .background(Color.White)
            )

            // Foreground Content
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Campaign Tabs Row (85% Width)
                Row(
                    modifier = Modifier
                        .fillMaxWidth(0.85f) // Restricted to 85% width
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

                // Detail Content inside White Surface
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp) // Padded to align with top sections
                        .padding(top = 20.dp)
                ) {
                    Text(
                        text = "ACTIVE CAMPAIGN",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MainTextCol,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    // Nested Bordered Box for Details
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, DiffWhiteBg, RoundedCornerShape(24.dp))
                            .padding(16.dp)
                    ) {
                        Column {
                            // Campaign Info Row (MORDER)
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(PageSecondaryBg.copy(alpha = 0.5f))
                                    .padding(12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column {
                                    Text(
                                        text = "MORDER",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = MainTextCol
                                    )
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Text(
                                            text = "Timeline: Feb 1 - April 1",
                                            fontSize = 14.sp,
                                            color = grayTextColor
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Box(
                                                modifier = Modifier
                                                    .size(10.dp)
                                                    .border(2.dp, SuccessActive, CircleShape)
                                            )
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Text(
                                                text = "67%",
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.SemiBold,
                                                color = SuccessActive
                                            )
                                        }
                                    }
                                }

                                Image(
                                    painter = painterResource(Res.drawable.ic_nexus),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                            }

                            Spacer(modifier = Modifier.height(20.dp))

                            // Payment Tracker Section
                            Text(
                                text = "PAYMENT TRACKER",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = grayTextColor
                            )

                            Row(
                                verticalAlignment = Alignment.Bottom,
                                modifier = Modifier.padding(vertical = 8.dp)
                            ) {
                                Text(
                                    text = "$300",
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MainTextCol
                                )
                                Text(
                                    text = "/$600",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = grayTextColor,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                )
                            }

                            // Segmented Progress Bar
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 12.dp),
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                val totalSegments = 30
                                val filledSegments = (totalSegments * 0.67).toInt()

                                repeat(totalSegments) { index ->
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(20.dp)
                                            .clip(RoundedCornerShape(2.dp))
                                            .background(if (index < filledSegments) SuccessActive else MuteColor)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Action Buttons Group
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(16.dp)
                            ) {
                                PrimaryButton(
                                    title = "View Wallet",
                                    onClick = { },
                                    modifier = Modifier.weight(1f),
                                    containerColor = PinkPrimary.copy(alpha = 0.8f)
                                )

                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .height(52.dp)
                                        .border(1.dp, MuteColor, RoundedCornerShape(50.dp))
                                        .clickable { },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "View Contract",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = MainTextCol
                                    )
                                }
                            }
                        }
                    }
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
