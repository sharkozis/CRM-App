package org.example.project.presentation.screen.wallet.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.theme.grayTextColor

@Composable
fun TransactionHistoryList(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "TRANSACTION HISTORY",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B0E2F)
            )

            Box(
                modifier = Modifier
                    .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(20.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "All",
                        fontSize = 12.sp,
                        color = Color(0xFF1B0E2F)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Box(modifier = Modifier.size(12.dp).background(Color.Gray))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        TransactionItem(
            name = "John D.",
            type = "Referral",
            date = "Feb 15",
            appName = "Oringina",
            amount = "$10.00",
            iconText = "%"
        )
        Spacer(modifier = Modifier.height(12.dp))
        TransactionItem(
            name = "Morder Payout",
            type = "Oringina",
            date = "Feb 10",
            appName = "Oringina",
            amount = "$300.00",
            iconText = "M"
        )
    }
}

@Composable
private fun TransactionItem(
    name: String,
    type: String,
    date: String,
    appName: String,
    amount: String,
    iconText: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Circular Icon
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .border(1.dp, Color(0xFFFDEBF3), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = iconText,
                    color = Color(0xFFD77CA4),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B0E2F)
                )
                Row {
                    Text(
                        text = type,
                        fontSize = 12.sp,
                        color = grayTextColor
                    )
                    Text(
                        text = " • $date",
                        fontSize = 12.sp,
                        color = grayTextColor
                    )
                }
            }

            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = appName,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF7B264B)
                )
                Text(
                    text = amount,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD77CA4)
                )
            }
        }
    }
}
