package org.example.project.presentation.screen.profile.composables


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icCopyicon
import org.example.project.presentation.component.IconButton
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.actionTextPurple

@Composable
fun LocationSection(
    modifier: Modifier = Modifier,
    deviceId: String = "#IOT-8839201"
) {
    Column(modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
        Text(
            text = "Device",
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


            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = Color(0xFFF1F1F1)
            )

            // Device ID Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Device ID: ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = MainTextCol
                    )
                    Text(
                        text = deviceId,
                        fontSize = 16.sp,
                        color = actionTextPurple,
                        textDecoration = TextDecoration.Underline
                    )
                }
                IconButton(
                    title = "Copy",
                    icon = icCopyicon,
                    onClick = { /* Handle copy */ }
                )
            }
        }
    }
}