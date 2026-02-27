package org.example.project.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.theme.GradientMain
import org.example.project.presentation.theme.GradientSub
import org.example.project.presentation.theme.actionTextPurple

@Composable
fun GradientPrimaryButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val shape = RoundedCornerShape(15.dp)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp)
            .clip(shape)
            .border(
                width = 1.dp,
                brush = GradientSub,
                shape = shape
            )
            .background(
                brush = if (enabled) GradientMain
                else GradientMain.also { /* handled via alpha below */ },
                alpha = if (enabled) 1f else 0.5f
            )
            .clickable(enabled = enabled, onClick = onClick)
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White.copy(alpha = if (enabled) 1f else 0.7f)
        )
    }
}