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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icDownArrow
import com.composables.icPen
import org.example.project.presentation.component.IconButton
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PinkPrimary

@Composable
fun PreferenceSection(
    modifier: Modifier = Modifier,
    city: String = "Morrow",
    weeklyHours: String = "40+ Hours"
) {
    Column(modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
        Text(
            text = "PREFERENCES",
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
            // City Row
            PreferenceRow(
                label = "City",
                value = city,
                icon = {
                    Image(
                        imageVector = icDownArrow,
                        contentDescription = null,
                        modifier = Modifier.size(12.dp)
                    )
                }
            )

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = Color(0xFFF1F1F1)
            )

            // Weekly Hours Row
            PreferenceRow(
                label = "Weekly Hours",
                value = weeklyHours,
                icon = {
                    IconButton(
                        title = "Edit",
                        icon = icPen,
                        onClick = { /* Handle edit */ }
                    )
                }
            )
        }
    }
}

@Composable
private fun PreferenceRow(
    label: String,
    value: String,
    icon: @Composable () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "$label: ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = MainTextCol
            )
            Text(
                text = value,
                fontSize = 16.sp,
                color = PinkPrimary
            )
        }
        icon()
    }
}
