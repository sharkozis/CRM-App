package org.example.project.presentation.screen.wallet.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_nexus
import org.example.project.presentation.theme.*
import org.jetbrains.compose.resources.painterResource

@Composable
fun PaymentTrackerCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
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
                        .size(80.dp)
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
        }
    }
}
