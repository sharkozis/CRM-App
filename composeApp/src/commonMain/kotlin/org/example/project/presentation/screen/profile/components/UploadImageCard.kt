package org.example.project.presentation.screen.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icProfileExport
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.MuteColor
import org.example.project.presentation.theme.grayTextColor

/**
 * Reusable card component used across upload-type modals (License, Car Photo, Rideshare).
 * Shows a dynamic title, a fixed subtitle, a round export icon button, and a content slot.
 *
 * @param title       The card heading, e.g. "License image", "Car image", "Profile image"
 * @param onExport    Called when the export icon button is tapped
 * @param modifier    Optional modifier for the outer card Box
 * @param content     The content to display below the header (image, etc.)
 */
@Composable
fun UploadImageCard(
    title: String,
    onExport: () -> Unit = {},
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .border(1.dp, MuteColor, RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            // Header: title + subtitle on the left, round export button on the right
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = MainTextCol
                    )
                    Text(
                        text = "Upload in .jpg, .png file format, min. size of 160px x 160px",
                        fontSize = 12.sp,
                        color = grayTextColor,
                        modifier = Modifier.padding(top = 2.dp)
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Round export button pinned to the right
                IconButton(
                    onClick = onExport,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(1.dp, MuteColor, CircleShape)
                        .background(Color.White)
                ) {
                    Icon(
                        imageVector = icProfileExport,
                        contentDescription = "Export",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Dynamic content slot (image, etc.)
            content()
        }
    }
}
