package org.example.project.presentation.screen.campaign

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.*
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.theme.*
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.presentation.resources.icCpu



@Composable
fun UpcomingCampaignScreen(
    onBackClicked: () -> Unit = {},
    onParticipateClicked: () -> Unit = {},
    onIgnoreClicked: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    var selectedTab by remember { mutableStateOf("Upcoming") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(PageSecondaryBg)
            .verticalScroll(scrollState)
            .padding(bottom = 24.dp)
    ) {
            Spacer(modifier = Modifier.height(32.dp))

            // Top Bar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                IconButton(
                    onClick = onBackClicked,
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Image(
                        imageVector = icMenu,
                        contentDescription = "Menu",
                        modifier = Modifier.size(24.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .shadow(elevation = 2.dp, shape = RoundedCornerShape(50.dp))
                        .background(Color.White, RoundedCornerShape(50.dp))
                        .padding(horizontal = 16.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .clip(CircleShape)
                            .background(SuccessActive)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Online",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = MainTextCol
                    )
                }

                Image(
                    imageVector = icAction,
                    contentDescription = "Notification",
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .size(24.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // System Status Card
            SystemStatusCard(modifier = Modifier.padding(horizontal = 24.dp))

            Spacer(modifier = Modifier.height(24.dp))

            // Tabs and Content Detail Section Stack
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                // Background White Surface (Starts halfway behind tabs)
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .padding(top = 24.dp)
                        .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                        .background(Color.White)
                )

                // Foreground Content
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Tab Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .clip(RoundedCornerShape(50.dp))
                            .border(1.dp, MuteColor, RoundedCornerShape(50.dp))
                            .background(PageSecondaryBg)
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val tabs = listOf("Active", "Past", "Upcoming")
                        tabs.forEach { tab ->
                            val isSelected = selectedTab == tab
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(40.dp)
                                    .clip(RoundedCornerShape(50.dp))
                                    .then(
                                        if (isSelected) Modifier
                                            .shadow(elevation = 1.dp, shape = RoundedCornerShape(50.dp))
                                            .background(Color.White)
                                        else Modifier
                                    )
                                    .clickable { selectedTab = tab },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = tab,
                                    fontSize = 14.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                    color = if (isSelected) MainTextCol else grayTextColor
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Current Offers Section
                    Column(modifier = Modifier.padding(horizontal = 24.dp)) {
                        Text(
                            text = "CURRENT OFFERS",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Morder Offer Card
                        OfferCard()

                        Spacer(modifier = Modifier.height(16.dp))
                        
                        HorizontalDivider(color = MuteColor.copy(alpha = 0.5f), thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))

                        // Requirements
                        SectionHeader(title = "REQUIREMENTS")
                        RequirementItem(icon = icMedal, text = "Full Time Commitment")
                        RequirementItem(icon = icWatch, text = "40 hrs+ / week")

                        Spacer(modifier = Modifier.height(8.dp))
                        HorizontalDivider(color = MuteColor.copy(alpha = 0.5f), thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))


                        // Payment
                        SectionHeader(title = "PAYMENT")
                        PaymentItem(text = "$320 Total ( 160$ monthly payments )")

                        Spacer(modifier = Modifier.height(8.dp))
                        HorizontalDivider(color = MuteColor.copy(alpha = 0.5f), thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))

                        // Installation
                        SectionHeader(title = "INSTALLATION")
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                            DateTimeItem(modifier = Modifier.weight(1.3f), text = "Friday, February 1", isDate = true)
                            DateTimeItem(modifier = Modifier.weight(1f), text = "10:00 AM", isDate = false)
                        }
                        
                        Spacer(modifier = Modifier.height(12.dp))


                        LocationItem(text = "Garage Location")

                        Spacer(modifier = Modifier.height(32.dp))

                        // Action Buttons
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            PrimaryButton(
                                title = "Participate",
                                onClick = onParticipateClicked,
                                modifier = Modifier.weight(1f),
                                containerColor = SuccessActive
                            )

                            OutlinedButton(
                                onClick = onIgnoreClicked,
                                modifier = Modifier
                                    .weight(1f)
                                    .height(52.dp),
                                shape = RoundedCornerShape(50.dp),
                                border = BorderStroke(1.dp, MuteColor),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = AlertTextCol)
                            ) {
                                Text(
                                    text = "Ignore",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                        
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
    }
}

@Preview
@Composable
fun SystemStatusCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    imageVector = icSystem,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "SYSTEM STATUS:",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            StatusRow(
                icon = icGps,
                label = "Location:",
                status = "Online",
                hasSwitch = true
            )

            Spacer(modifier = Modifier.height(12.dp))

            StatusRow(
                icon = icCpu,
                label = "Device",
                subLabel = "IOT-8839201",
                status = "Connected",
                hasSwitch = false
            )
        }
    }
}

@Composable
fun StatusRow(
    icon: ImageVector,
    label: String,
    subLabel: String? = null,
    status: String,
    hasSwitch: Boolean
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, BorderPink, RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(imageVector = icon, contentDescription = null, modifier = Modifier.size(20.dp))
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = label, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = MainTextCol)
            if (subLabel != null) {
                Text(text = subLabel, fontSize = 10.sp, color = grayTextColor)
            }
        }
        
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(imageVector = icMark, contentDescription = null, modifier = Modifier.size(16.dp))
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = status, fontSize = 14.sp, color = grayTextColor)
            
            if (hasSwitch) {
                Spacer(modifier = Modifier.width(8.dp))
                Switch(
                    checked = true,
                    onCheckedChange = {},
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = PinkPrimary,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = MuteColor
                    )
                )
            }
        }
    }
}

@Composable
fun OfferCard() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = PageSecondaryBg.copy(alpha = 0.5f)),
        border = BorderStroke(1.dp, MuteColor.copy(alpha = 0.3f))
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                // Using icAlert as a placeholder for the yellow exclamation icon
                Image(imageVector = icYellowAlert, contentDescription = null, modifier = Modifier.size(24.dp))
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Morder", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = MainTextCol)
                Spacer(modifier = Modifier.height(4.dp))
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = Color.White,
                    border = BorderStroke(1.dp, MuteColor.copy(alpha = 0.5f))
                ) {
                    Text(
                        text = "morder.co",
                        fontSize = 10.sp,
                        color = grayTextColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                    )
                }
            }
            
            Text(text = "400$", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MainTextCol)
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = MainTextCol,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun RequirementItem(icon: ImageVector?, text: String) {
    Row(
        modifier = Modifier
            .padding(vertical = 4.dp)
            .fillMaxWidth()
            .border(1.dp, MuteColor.copy(alpha = 0.5f), RoundedCornerShape(14.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (icon != null) {
            Image(imageVector = icon, contentDescription = null, modifier = Modifier.size(20.dp))
        } else {
            Box(modifier = Modifier.size(20.dp).background(Color.Gray.copy(alpha = 0.2f), CircleShape))
        }
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight.Medium, color = MainTextCol)
    }
}

@Composable
fun PaymentItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, MuteColor.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(imageVector = icDollar, contentDescription = null, modifier = Modifier.size(18.dp))
        }
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = MainTextCol)
    }
}

@Composable
fun DateTimeItem(modifier: Modifier = Modifier, text: String, isDate: Boolean) {
    Row(
        modifier = modifier
            .border(1.dp, MuteColor.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = if (isDate) icCalendar else icClock,
            contentDescription = null,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text, fontSize = 12.sp, fontWeight = FontWeight.Medium, color = MainTextCol)
    }
}

@Preview
@Composable
fun LocationItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, MuteColor.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(imageVector = icGps, contentDescription = null, modifier = Modifier.size(20.dp))
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight.Medium, color = MainTextCol, modifier = Modifier.weight(1f))
        Image(
            imageVector = icEye,
            contentDescription = null,
            modifier = Modifier.size(16.dp).graphicsLayer { rotationZ = 180f }
        )
    }
}



@Preview
@Composable
fun UpcomingCampaignScreenPreview() {
    AppTheme {
        UpcomingCampaignScreen()
    }
}
