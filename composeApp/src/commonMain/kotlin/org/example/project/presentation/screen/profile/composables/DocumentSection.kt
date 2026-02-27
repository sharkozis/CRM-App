package org.example.project.presentation.screen.profile.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.composables.icProfileCarStar
import com.composables.icProfileDocument
import com.composables.icProfileSubtitle
import com.composables.icProfileUser
import org.example.project.presentation.screen.profile.components.GroupSection
import org.example.project.presentation.screen.profile.components.GroupSectionItem

@Composable
fun DocumentSection(
    modifier: Modifier = Modifier,
    onItemClick: (String) -> Unit = {}
) {
    val documentItems = listOf(
        GroupSectionItem(
            title = "License Photo",
            icon = icProfileSubtitle,
            onClick = { onItemClick("license_photo") }
        ),
        GroupSectionItem(
            title = "Car Photo",
            icon = icProfileCarStar,
            onClick = { onItemClick("car_photo") }
        ),
        GroupSectionItem(
            title = "Rideshare Profile Photo",
            icon = icProfileUser,  // Reuse user icon for profile photo
            onClick = { onItemClick("rideshare_profile_photo") }
        ),
        GroupSectionItem(
            title = "Terms and Policy",
            icon = icProfileDocument,  // Language icon for terms
            onClick = { onItemClick("terms_policy") }
        )
    )

    GroupSection(
        title = "Supporting Documents",
        items = documentItems,
        modifier = modifier
    )
}