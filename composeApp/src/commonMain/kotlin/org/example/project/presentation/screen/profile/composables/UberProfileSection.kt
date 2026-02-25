package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icRightarrow
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.maroonTextColor

@Composable
fun UberProfileSection(
    modifier: Modifier = Modifier,
    onUploadClick: () -> Unit = {},
    onSlotClick: () -> Unit = {}
) {
    Column(modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(12.dp))
                .border(1.dp, Color(0xFFF1F1F1), RoundedCornerShape(12.dp))
        ) {
            // Header: Uber Profile Photo + Upload >
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Uber Profile Photo",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier.clickable { onUploadClick() }
                ) {
                    Text(
                        text = "Upload",
                        fontSize = 16.sp,
                        color = maroonTextColor
                    )
                    Image(
                        imageVector = icRightarrow,
                        contentDescription = null,
                        modifier = Modifier.size(12.dp)
                    )
                }
            }

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = Color(0xFFF1F1F1)
            )

            // Full-width dashed slot
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .height(140.dp) // Height to match the aspect ratio of the design
                    .drawBehind {
                        drawRoundRect(
                            color = Color(0xFFE5E5E5),
                            style = Stroke(
                                width = 1.dp.toPx(),
                                pathEffect = PathEffect.dashPathEffect(
                                    floatArrayOf(10f, 10f), 0f
                                )
                            ),
                            cornerRadius = CornerRadius(12.dp.toPx())
                        )
                    }
                    .clickable { onSlotClick() }
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                // Inner rounded box
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.6f) // Centered relative box
                        .fillMaxHeight(0.5f)
                        .background(Color(0xFFFFFFFF), RoundedCornerShape(12.dp))
                        .border(1.dp, Color(0xFFF8F8F8), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Take Photo Or Upload",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Normal,
                        color = MainTextCol
                    )
                }
            }
        }
    }
}
