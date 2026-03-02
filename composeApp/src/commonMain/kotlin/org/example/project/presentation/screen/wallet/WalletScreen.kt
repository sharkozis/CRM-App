package org.example.project.presentation.screen.wallet

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icAction
import com.composables.icCalendarTic
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_nexus
import org.jetbrains.compose.resources.painterResource
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PageSecondaryBg
import org.example.project.presentation.theme.grayTextColor
import org.example.project.presentation.theme.maroonTextColor
import org.example.project.presentation.theme.yellowTextColor

@Composable
fun WalletScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(PageSecondaryBg)
            .verticalScroll(scrollState)
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Wallet",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = MainTextCol
            )
            Icon(
                imageVector = icAction,
                contentDescription = "Notifications",
                tint = maroonTextColor,
                modifier = Modifier.size(28.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Main White Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
        ) {
            Column(modifier = Modifier.padding(vertical = 16.dp)) {

                // --- Income Summary ---
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "INCOME SUMMARY",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol,
                            letterSpacing = 0.5.sp
                        )
                        AllTimeDropdown()
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Inner card
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFAFAFA)),
                        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                        border = CardDefaults.outlinedCardBorder()
                    ) {
                        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                            SummaryRow(label = "Lifetime Earnings:", value = "$450.00", valueColor = MainTextCol)
                            Spacer(modifier = Modifier.height(10.dp))
                            SummaryRow(label = "Upcoming Payouts:", value = "$200.00", valueColor = MainTextCol)
                            Spacer(modifier = Modifier.height(10.dp))
                            SummaryRow(
                                label = "Banking:",
                                value = "[Stripe Connected]",
                                valueColor = Color(0xFF2E7D32)
                            )
                        }
                    }
                }

                DashedDivider(Modifier.padding(vertical = 16.dp, horizontal = 16.dp))

                // --- Upcoming Payments ---
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Upcoming Payments",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "All Previous Campaigns",
                                fontSize = 11.sp,
                                color = maroonTextColor,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = " >",
                                fontSize = 11.sp,
                                color = maroonTextColor,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Campaign Card
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFAFAFA)),
                        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                        border = CardDefaults.outlinedCardBorder()
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(Res.drawable.ic_nexus),
                                contentDescription = "Campaign image",
                                modifier = Modifier
                                    .size(64.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "OLYNBEE",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MainTextCol
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = "Dec 1 - Feb 7",
                                        fontSize = 12.sp,
                                        color = grayTextColor
                                    )
                                    Text(
                                        text = "  •  ",
                                        fontSize = 12.sp,
                                        color = grayTextColor
                                    )
                                    Text(
                                        text = "$600.00",
                                        fontSize = 12.sp,
                                        color = grayTextColor
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Payment History
                    Text(
                        text = "PAYMENT HISTORY",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MainTextCol,
                        letterSpacing = 0.5.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    PaymentHistoryRow(date = "Dec 15", amount = "$150.00", status = "Paid", statusColor = Color(0xFF2E7D32))
                    Spacer(modifier = Modifier.height(8.dp))
                    PaymentHistoryRow(date = "Jan 15", amount = "$150.00", status = "Due", statusColor = yellowTextColor)

                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@Composable
private fun SummaryRow(label: String, value: String, valueColor: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = label, fontSize = 13.sp, color = grayTextColor)
        Text(text = value, fontSize = 13.sp, fontWeight = FontWeight.Medium, color = valueColor)
    }
}

@Composable
private fun PaymentHistoryRow(date: String, amount: String, status: String, statusColor: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icCalendarTic,
            contentDescription = null,
            tint = maroonTextColor,
            modifier = Modifier.size(22.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "$date: $amount",
            fontSize = 13.sp,
            color = MainTextCol
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = "($status)",
            fontSize = 13.sp,
            color = statusColor,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun AllTimeDropdown() {
    var expanded by remember { mutableStateOf(false) }
    Box {
        Card(
            onClick = { expanded = true },
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            border = CardDefaults.outlinedCardBorder()
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "All time", fontSize = 12.sp, color = grayTextColor)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "▾", fontSize = 11.sp, color = grayTextColor)
            }
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("All time") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("This month") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Last month") }, onClick = { expanded = false })
        }
    }
}

@Composable
fun DashedDivider(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(1.dp)
    ) {
        drawLine(
            color = Color(0xFFE0E0E0),
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f),
            strokeWidth = 2f
        )
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletScreen()
}