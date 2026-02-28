package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icProfileExport
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_ProfileRideshareImg
import kotlinproject.composeapp.generated.resources.ic_ProfileCarImg
import org.jetbrains.compose.resources.painterResource
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.MuteColor
import org.example.project.presentation.theme.grayTextColor

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
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Card containing the upload section
            Box(
                modifier = Modifier
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
                    // Header row: title + export button
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "Profile image",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = MainTextCol
                            )
                            Text(
                                text = "Upload in .jpg, .png file format, min. size of 160px \n x 160px",
                                fontSize = 12.sp,
                                color = grayTextColor,
                                modifier = Modifier.padding(top = 2.dp)
                            )
                        }

                        // Round export button in top-right corner
                        IconButton(
                            onClick = { /* handle export */ },
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .border(1.dp, MuteColor, CircleShape)
                                .background(Color.White)
                        ) {
                            Icon(
                                imageVector = icProfileExport,
                                contentDescription = "Export profile photo",
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Rideshare profile image — left-aligned, large but not full width
                    Image(
                        painter = painterResource(Res.drawable.ic_ProfileRideshareImg),
                        contentDescription = "Rideshare profile image",
                        modifier = Modifier
                            .fillMaxWidth(0.82f)
                            .align(Alignment.Start)
                            .aspectRatio(3f / 4f)
                            .clip(RoundedCornerShape(10.dp))
                    )
                }
            }
        }
    }
}

