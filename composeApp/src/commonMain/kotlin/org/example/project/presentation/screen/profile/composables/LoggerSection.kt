package org.example.project.presentation.screen.profile.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.composables.icProfileLogin
import org.example.project.presentation.screen.profile.components.GroupSection
import org.example.project.presentation.screen.profile.components.GroupSectionItem
import org.example.project.presentation.theme.errorTextColor  // Adjust import if needed

@Composable
fun LoggerSection(
    modifier: Modifier = Modifier,
    onLogoutClick: () -> Unit = {}
) {
    val logoutItem = GroupSectionItem(
        title = "Log out",
        icon = icProfileLogin,
        titleColor = errorTextColor,  // Apply error text color
        onClick = onLogoutClick
    )

    GroupSection(
        title = "",  // No section title
        items = listOf(logoutItem),
        modifier = modifier
    )
}