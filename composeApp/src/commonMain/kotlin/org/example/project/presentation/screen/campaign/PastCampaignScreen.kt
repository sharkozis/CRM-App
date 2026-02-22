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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.*
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_nexus
import org.example.project.presentation.resources.icDoc
import org.example.project.presentation.theme.*
import org.jetbrains.compose.resources.painterResource

@Composable
fun PastCampaignScreen(
    onBackClicked: () -> Unit = {},
) {
    val scrollState = rememberScrollState()
    var selectedTab by remember { mutableStateOf("Past") }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(PageSecondaryBg)
                .verticalScroll(scrollState)
                .padding(paddingValues)
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

                // Notification Icon (Right)
                Image(
                    imageVector = icAction,
                    contentDescription = "Notification",
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .size(28.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // System Status Card
            SystemStatusCard(modifier = Modifier.padding(horizontal = 24.dp))

            Spacer(modifier = Modifier.height(24.dp))

            // Tabs and Content Detail Section Stack
            Box(modifier = Modifier.fillMaxWidth()) {
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

                    // Content
                    Column(modifier = Modifier.padding(horizontal = 24.dp)) {

                        // PAST CAMPAIGNS header
                        Text(
                            text = "PAST CAMPAIGNS",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // 5 campaign accordion items — each has independent expand state
                        val campaigns = listOf(
                            CampaignData("OLYNBEE",  "Dec 1 - Feb 7",  "$600.00"),
                            CampaignData("NEXUS CO", "Jan 5 - Mar 5",  "$480.00"),
                            CampaignData("VORTEX",   "Feb 10 - Apr 10","$320.00"),
                            CampaignData("ZENITH",   "Mar 1 - May 1",  "$560.00"),
                            CampaignData("AURELIA",  "Apr 3 - Jun 3",  "$400.00")
                        )
                        val expandedStates = remember { campaigns.map { mutableStateOf(false) } }

                        campaigns.forEachIndexed { index, campaign ->
                            CampaignAccordionItem(
                                campaign = campaign,
                                isExpanded = expandedStates[index].value,
                                onToggle = { expandedStates[index].value = !expandedStates[index].value }
                            )
                            if (index < campaigns.lastIndex) {
                                Spacer(modifier = Modifier.height(12.dp))
                            }
                        }

                        Spacer(modifier = Modifier.height(32.dp))
                    }

                }
            }
        }
    }
}

// ─── Data model ───────────────────────────────────────────────────────────────

data class CampaignData(
    val name: String,
    val period: String,
    val earned: String
)

// ─── Accordion Item ───────────────────────────────────────────────────────────

@Composable
fun CampaignAccordionItem(
    campaign: CampaignData,
    isExpanded: Boolean,
    onToggle: () -> Unit
) {
    val chevronRotation by animateFloatAsState(
        targetValue = if (isExpanded) 180f else 0f,
        label = "chevron_${campaign.name}"
    )

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, MuteColor.copy(alpha = 0.35f)),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            // ── Header row (always visible) ─────────────────
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = PageSecondaryBg),
                border = BorderStroke(1.dp, MuteColor.copy(alpha = 0.3f)),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Ad thumbnail
                    Image(
                        painter = painterResource(Res.drawable.ic_nexus),
                        contentDescription = "Campaign thumbnail",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(width = 80.dp, height = 64.dp)
                            .clip(RoundedCornerShape(10.dp))
                    )

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = campaign.name,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = campaign.period, fontSize = 12.sp, color = grayTextColor)
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(
                                modifier = Modifier
                                    .size(4.dp)
                                    .clip(CircleShape)
                                    .background(grayTextColor)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(text = "${campaign.earned} Earned", fontSize = 12.sp, color = grayTextColor)
                        }
                    }

                    // Animated chevron
                    Image(
                        imageVector = icDownArrow,
                        contentDescription = if (isExpanded) "Collapse" else "Expand",
                        modifier = Modifier
                            .size(18.dp)
                            .graphicsLayer { rotationZ = chevronRotation }
                            .clickable(onClick = onToggle)
                    )
                }
            }

            // ── Expandable content ─────────────────────────
            if (isExpanded) {
                HorizontalDivider(
                    color = MuteColor.copy(alpha = 0.4f),
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                Text(
                    text = "FILES",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol
                )

                Spacer(modifier = Modifier.height(12.dp))

                FileItem(
                    fileIcon = icPdf,
                    fileName = "Contract.pdf",
                    fileSize = "12.2 MB",
                    fileDate = "Mon, 12 may 2025"
                )

                Spacer(modifier = Modifier.height(10.dp))

                FileItem(
                    fileIcon = icDoc,
                    fileName = "Fulfillment_Proof_History.doc",
                    fileSize = "12.2 MB",
                    fileDate = "Mon, 12 may 2025"
                )

                HorizontalDivider(
                    color = MuteColor.copy(alpha = 0.4f),
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                Text(
                    text = "PAYMENT HISTORY",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol
                )

                Spacer(modifier = Modifier.height(12.dp))

                PaymentHistoryItem(date = "Dec 15", amount = "$150.00", isPaid = true)
                Spacer(modifier = Modifier.height(12.dp))
                PaymentHistoryItem(date = "Jan 15", amount = "$150.00", isPaid = true)

                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}


// ─── File Item ────────────────────────────────────────────────────────────────

@Composable
fun FileItem(fileIcon: ImageVector, fileName: String, fileSize: String, fileDate: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .border(1.dp, MuteColor.copy(alpha = 0.3f), RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // File icon from resources
        Image(
            imageVector = fileIcon,
            contentDescription = null,
            modifier = Modifier.size(44.dp)
        )

        Spacer(modifier = Modifier.width(14.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = fileName,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = MainTextCol
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = fileSize, fontSize = 12.sp, color = grayTextColor)
                Spacer(modifier = Modifier.width(6.dp))
                Box(
                    modifier = Modifier
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(grayTextColor)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(text = fileDate, fontSize = 12.sp, color = grayTextColor)
            }
        }

        // Download button
        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(1.dp, MuteColor.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            Image(
                imageVector = icDownload,
                contentDescription = "Download",
                modifier = Modifier.size(18.dp)
            )
        }
    }
}

// ─── Payment History Item ─────────────────────────────────────────────────────

@Composable
fun PaymentHistoryItem(date: String, amount: String, isPaid: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Calendar tick icon — no background
        Image(
            imageVector = icCalendarTic,
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )

        Spacer(modifier = Modifier.width(14.dp))

        // Date label
        Text(
            text = "$date:",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = MainTextCol
        )

        Spacer(modifier = Modifier.width(6.dp))

        // Amount + (Paid) inline
        Text(
            text = amount,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = MainTextCol
        )

        Spacer(modifier = Modifier.width(6.dp))

        Text(
            text = if (isPaid) "(Paid)" else "(Pending)",
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium,
            color = if (isPaid) SuccessActive else AlertTextCol
        )
    }
}

// ─── Preview ──────────────────────────────────────────────────────────────────

@Preview
@Composable
fun PastCampaignScreenPreview() {
    AppTheme {
        PastCampaignScreen()
    }
}
