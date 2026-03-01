package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_ProfileLicense
import org.jetbrains.compose.resources.painterResource
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.components.UploadImageCard
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel

@Composable
fun LicenseModal(
    viewModel: ProfileViewModel,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    var licenseImageUri by remember { mutableStateOf(viewModel.licenseImageUri) }

    ProfileModal(
        title = "License Photo",
        primaryButtonText = "Save Change",
        secondaryButtonText = "Reset",
        onPrimaryClick = {
            viewModel.updateLicenseImage(licenseImageUri)
            viewModel.onLicenseSaveClick()
            onDismiss()
        },
        onSecondaryClick = {
            licenseImageUri = viewModel.licenseImageUri
        },
        onDismiss = onDismiss,
        modifier = modifier
    ) {
        UploadImageCard(title = "License image") {
            Image(
                painter = painterResource(Res.drawable.ic_ProfileLicense),
                contentDescription = "License image placeholder",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(80f / 56f)
            )
        }
    }
}