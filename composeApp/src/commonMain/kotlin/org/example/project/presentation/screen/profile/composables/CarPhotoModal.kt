package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_ProfileCarImg
import org.jetbrains.compose.resources.painterResource
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.components.UploadImageCard
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel

@Composable
fun CarPhotoModal(
    viewModel: ProfileViewModel,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    var carPhotoUri by remember { mutableStateOf(viewModel.carPhotoUri) }

    ProfileModal(
        title = "Car Photo",
        primaryButtonText = "Save Change",
        secondaryButtonText = "Reset",
        onPrimaryClick = {
            viewModel.updateCarPhoto(carPhotoUri)
            viewModel.onCarPhotoSaveClick()
            onDismiss()
        },
        onSecondaryClick = {
            carPhotoUri = viewModel.carPhotoUri
        },
        onDismiss = onDismiss,
        modifier = modifier
    ) {
        UploadImageCard(title = "Car image") {
            Image(
                painter = painterResource(Res.drawable.ic_ProfileCarImg),
                contentDescription = "Car image placeholder",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(80f / 56f)
            )
        }
    }
}