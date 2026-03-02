package org.example.project.presentation.screen.wallet

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.Brush
import com.composables.icAction
import com.composables.icCalendarTic
import com.composables.icDownArrow
import com.composables.icRightArrowMaroon
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_nexus
import org.example.project.presentation.screen.wallet.composables.TransactionHistoryList
import org.example.project.presentation.theme.DiffWhiteBg
import org.example.project.presentation.theme.GradientMain
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.MuteColor
import org.example.project.presentation.theme.PageSecondaryBg
import org.example.project.presentation.theme.PinkPrimary
import org.example.project.presentation.theme.SuccessActive
import org.example.project.presentation.theme.WhiteBg
import org.example.project.presentation.theme.grayTextColor
import org.example.project.presentation.theme.maroonTextColor
import org.example.project.presentation.theme.yellowTextColor
import org.jetbrains.compose.resources.painterResource


@Composable
fun WalletScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    0.0f to Color.White,
                    0.3f to PinkPrimary.copy(alpha = 0.9f)
                )
            )
    ) {
        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 25.dp),

            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Wallet",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MainTextCol
            )
            Box {
                Icon(
                    imageVector = icAction,
                    contentDescription = "Notifications",
                    tint = MainTextCol,
                    modifier = Modifier.size(18.dp)
                )
                // Notification Badge Dot
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(GradientMain)
                        .align(Alignment.TopEnd)
                        .padding(2.dp)
                )
            }
        }

        // Main Content Area with White Background and Rounded Corners
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp))
                .background(Color.White)
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {
            // --- Income Summary ---
            Card(
                modifier = Modifier.fillMaxWidth()
                    .border(1.dp, MuteColor, RoundedCornerShape(14.dp)),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = PageSecondaryBg),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "INCOME SUMMARY",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol,
                            letterSpacing = 0.5.sp
                        )
                        AllTimeDropdown()
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Inner white card
                    Card(
                        modifier = Modifier.fillMaxWidth()
                            .border(1.dp, MuteColor,RoundedCornerShape(12.dp)),
//                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
//                        border = CardDefaults.outlinedCardBorder()
                    ) {
                        Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 25.dp)) {
                            SummaryRow(label = "Lifetime Earnings:", value = "$450.00", valueColor = MainTextCol)
                            Spacer(modifier = Modifier.height(14.dp))
                            SummaryRow(label = "Upcoming Payouts:", value = "$200.00", valueColor = MainTextCol)
                            Spacer(modifier = Modifier.height(14.dp))
                            SummaryRow(
                                label = "Banking:",
                                value = "[Stripe Connected]",
                                valueColor = SuccessActive
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // --- Upcoming Payments ---
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "UPCOMING PAYMENTS",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { /* Handle click */ }
                ) {
                    Text(
                        text = "All Previous Campaigns",
                        fontSize = 11.sp,
                        color = maroonTextColor,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = icRightArrowMaroon,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = maroonTextColor
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Campaign Card
            Card(
                modifier = Modifier.fillMaxWidth()
                    .border(1.dp, MuteColor, RoundedCornerShape(14.dp)),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = WhiteBg),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .background(DiffWhiteBg, RoundedCornerShape(10.dp))
                            .padding(horizontal = 10.dp),

                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.ic_nexus),
                            contentDescription = "Campaign image",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(8.dp)),
                            contentScale = ContentScale.FillWidth
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "OLYNBEE",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = MainTextCol
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Dec 1 - Feb 7",
                                    fontSize = 10.sp,
                                    color = grayTextColor
                                )
                                Text(
                                    text = "  •  ",
                                    fontSize = 10.sp,
                                    color = grayTextColor
                                )
                                Text(
                                    text = "$600.00",
                                    fontSize = 10.sp,
                                    color = grayTextColor
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // Payment History inside Campaign Card
                    Text(
                        text = "PAYMENT HISTORY",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = MainTextCol,
//                        letterSpacing = 0.5.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    PaymentHistoryRow(date = "Dec 15", amount = "$150.00", status = "Paid", statusColor = SuccessActive)
                    Spacer(modifier = Modifier.height(8.dp))
                    PaymentHistoryRow(date = "Jan 15", amount = "$150.00", status = "Due", statusColor = yellowTextColor)

                }

            }
            Spacer(modifier = Modifier.height(32.dp))

            // --- Transaction History ---
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(
//                    text = "TRANSACTION HISTORY",
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = MainTextCol
//                )
//                AllDropdown()
//            }

            Spacer(modifier = Modifier.height(12.dp))

            TransactionHistoryList()
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
        Text(text = value, fontSize = 15.sp, fontWeight = FontWeight.Medium, color = valueColor)
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
            color = grayTextColor
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
private fun AllDropdown() {
    var expanded by remember { mutableStateOf(false) }
    Box {
        Card(
            onClick = { expanded = true },
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            border = CardDefaults.outlinedCardBorder()
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "All", fontSize = 14.sp, color = MainTextCol)
                Spacer(modifier = Modifier.width(6.dp))
                Text(text = "▾", fontSize = 12.sp, color = grayTextColor)
            }
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("All") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("This week") }, onClick = { expanded = false })
        }
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
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "All time", fontSize = 12.sp, color = MainTextCol, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    imageVector = icDownArrow,
                    contentDescription = null,
                    modifier = Modifier.size(12.dp)
                )
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

@Preview(showBackground = true)
@Composable
private fun WalletScreenPreview() {
    WalletScreen()
}