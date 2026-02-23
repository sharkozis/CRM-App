package org.example.project.presentation.screen.wallet.composables

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icDownArrow
import org.example.project.presentation.theme.PageSecondaryBg
import org.example.project.presentation.theme.grayTextColor

@Composable
fun IncomeSummaryCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        IncomeSummaryContent()
    }
}

@Composable
fun IncomeSummaryContent() {
    Column(
        modifier = Modifier.padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .background(PageSecondaryBg, shape = RoundedCornerShape(14.dp))
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Column {
                Text(
                    text = "INCOME SUMMARY",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B0E2F)
                )
                Text(
                    text = "All time",
                    fontSize = 12.sp,
                    color = grayTextColor
                )
            }

            Box(
                modifier = Modifier
                    .background(Color.White, RoundedCornerShape(20.dp))
                    .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(20.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "All time",
                        fontSize = 12.sp,
                        color = Color(0xFF1B0E2F)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Image(
                        imageVector = icDownArrow,
                        contentDescription = null,
                        modifier = Modifier.size(12.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        IncomeRow(label = "Lifetime Earnings:", value = "$450.00")
        Spacer(modifier = Modifier.height(12.dp))
        IncomeRow(label = "Upcoming Payouts:", value = "$200.00")
        Spacer(modifier = Modifier.height(12.dp))
        IncomeRow(
            label = "Banking:",
            value = "[Stripe Connected]",
            valueColor = Color(0xFF3B9865)
        )
    }
}

@Composable
private fun IncomeRow(
    label: String,
    value: String,
    valueColor: Color = Color(0xFF1B0E2F)
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            color = grayTextColor
        )
        Text(
            text = value,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = valueColor
        )
    }
}
