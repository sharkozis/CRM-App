package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_ProfileRideshareImg
import org.jetbrains.compose.resources.painterResource
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.components.UploadImageCard
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel

@Composable
fun RideShareModal(
    viewModel: ProfileViewModel,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    var profilePhotoUri by remember { mutableStateOf(viewModel.rideshareProfilePhotoUri) }

    ProfileModal(
        title = "Rideshare Profile Photo",
        primaryButtonText = "Save Change",
        secondaryButtonText = "Reset",
        onPrimaryClick = {
            viewModel.updateRideshareProfilePhoto(profilePhotoUri)
            viewModel.onRideshareProfilePhotoSaveClick()
            onDismiss()
        },
        onSecondaryClick = {
            profilePhotoUri = viewModel.rideshareProfilePhotoUri
        },
        onDismiss = onDismiss,
        modifier = modifier
    ) {
        UploadImageCard(title = "Profile image") {
            Image(
                painter = painterResource(Res.drawable.ic_ProfileRideshareImg),
                contentDescription = "Rideshare profile image",
                modifier = Modifier
                    .fillMaxWidth(0.82f)
                    .align(Alignment.Start)
                    .aspectRatio(4f / 4f)
                    .clip(RoundedCornerShape(10.dp))
            )
        }
    }
}
