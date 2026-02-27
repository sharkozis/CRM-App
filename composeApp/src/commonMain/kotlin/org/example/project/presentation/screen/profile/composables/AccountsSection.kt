package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.composables.icProfileLanguage
import com.composables.icProfileCar
import com.composables.icProfileNotification
import com.composables.icProfileUser
import org.example.project.presentation.screen.profile.components.GroupSection
import org.example.project.presentation.screen.profile.components.GroupSectionItem
import org.example.project.presentation.theme.PinkPrimary

@Composable
fun AccountsSection(
    modifier: Modifier = Modifier,
    onItemClick: (String) -> Unit = {}
) {
    var notificationsEnabled by remember { mutableStateOf(false) }

    val accountItems = listOf(
        GroupSectionItem(
            title = "Personal information",
            icon = icProfileUser,
            onClick = { onItemClick("personal_info") }
        ),
        GroupSectionItem(
            title = "Change Language",
            icon = icProfileLanguage,
            onClick = { onItemClick("language") }
        ),
        GroupSectionItem(
            title = "Turn on Notifications",
            icon = icProfileNotification,
            trailingContent = {
                Switch(
                    checked = notificationsEnabled,
                    onCheckedChange = { notificationsEnabled = it },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = PinkPrimary,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color(0xFFE0E0E0),
                        uncheckedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier.size(width = 44.dp, height = 24.dp)
                )
            },
            onClick = { notificationsEnabled = !notificationsEnabled }
        ),
        GroupSectionItem(
            title = "Vehicle Information",
            icon = icProfileCar,
            onClick = { onItemClick("vehicle_info") }
        ),
        GroupSectionItem(
            title = "Driving Information",
            icon = icProfileCar,
            onClick = { onItemClick("driving_info") }
        )
    )

    GroupSection(
        title = "Accounts",
        items = accountItems,
        modifier = modifier
    )
}
