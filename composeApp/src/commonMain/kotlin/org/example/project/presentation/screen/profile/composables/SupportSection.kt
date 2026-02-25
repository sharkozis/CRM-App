package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icRightarrow
import org.example.project.presentation.component.IconButton
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.maroonTextColor

@Preview
@Composable
fun SupportSection(
    modifier: Modifier = Modifier,
    onUploadClick: () -> Unit = {},
    onTakePhotoOrUploadClick: () -> Unit = {}
) {
    Column(modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
        Text(
            text = "Support",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MainTextCol
        )

        Spacer(modifier = Modifier.height(12.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(12.dp))
                .border(1.dp, Color(0xFFF1F1F1), RoundedCornerShape(12.dp))
        ) {
            // LICENSE Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "LICENSE",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
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

            // Dashed Upload Area
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .drawBehind {
                        drawRoundRect(
                            color = Color(0xFFCCCCCC),
                            style = Stroke(
                                width = 2.dp.toPx(),
                                pathEffect = PathEffect.dashPathEffect(
                                    floatArrayOf(12f, 8f), 0f
                                )
                            ),
                            cornerRadius = CornerRadius(12.dp.toPx())
                        )
                    }
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .height(52.dp),
//                        .background(
//                            color = Color(0xFFF4F4F6),
//                            shape = RoundedCornerShape(50)
//                        )
//                        .border(
//                            1.dp,
//                            Color(0xFFE5E5EA),
//                            RoundedCornerShape(50)
//                        ),
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        title = "Take Photo Or Upload",
                        icon = null,
                        onClick = onTakePhotoOrUploadClick
                    )
                }
            }
        }
    }
}