package org.example.project.presentation.screen.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icRightarrow
import org.example.project.presentation.theme.MainTextCol

data class GroupSectionItem(
    val title: String,
    val icon: ImageVector,
    val onClick: () -> Unit = {},
    val trailingContent: @Composable (() -> Unit)? = null
)

@Composable
fun GroupSection(
    modifier: Modifier = Modifier,
    title: String,
    items: List<GroupSectionItem>
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Section Title
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MainTextCol,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        // Items Container
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = Color(0xFFEEEEEE),
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
        ) {
            items.forEachIndexed { index, item ->
                GroupRow(
                    item = item,
                    showDivider = index < items.size - 1
                )
            }
        }
    }
}

@Composable
private fun GroupRow(
    item: GroupSectionItem,
    showDivider: Boolean
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { item.onClick() }
                .padding(horizontal = 16.dp, vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Left Group: Icon and Title
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    imageVector = item.icon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = item.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = MainTextCol
                )
            }

            // Right Group: Custom Content or Arrow
            if (item.trailingContent != null) {
                item.trailingContent.invoke()
            } else {
                Icon(
                    imageVector = icRightarrow,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = Color.Black
                )
            }
        }

        if (showDivider) {
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 1.dp),
                thickness = 1.dp,
                color = Color(0xFFEEEEEE)
            )
        }
    }
}
