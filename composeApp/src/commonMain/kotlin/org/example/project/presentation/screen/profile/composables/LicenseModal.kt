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
import kotlinproject.composeapp.generated.resources.ic_ProfileLicense
//import kotlinproject.composeapp.generated.resources.ic_creationImg
import org.jetbrains.compose.resources.painterResource
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.MuteColor
import org.example.project.presentation.theme.grayTextColor


@Composable
fun LicenseModal(
    viewModel: ProfileViewModel,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    // State for license image (placeholder)
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
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Card containing the license image section
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
                                text = "License image",
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
                                contentDescription = "Export license",
                                modifier = Modifier.size(20.dp),
//                                tint = MainTextCol
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // License image box
                    Image(
                        painter = painterResource(Res.drawable.ic_ProfileLicense),
                        contentDescription = "License image placeholder",
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(80f / 56f)
                    )
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(160.dp)
//                            .clip(RoundedCornerShape(10.dp)),
////                            .background(MuteColor.copy(alpha = 0.12f)),
////                            .border(1.dp, Color(0xFFDDD8E8), RoundedCornerShape(10.dp)),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Image(
//                            painter = painterResource(Res.drawable.ic_ProfileLicense),
//                            contentDescription = "License image placeholder",
//                            modifier = Modifier
//                                .fillMaxWidth(0.7f)
//                                .aspectRatio(80f / 56f)
//                        )
//                    }
                }
            }
        }
    }
}