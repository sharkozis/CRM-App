package org.example.project.presentation.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_avatar
import org.example.project.presentation.component.IconButton
import org.example.project.presentation.screen.profile.composables.*
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PinkPrimary
import org.jetbrains.compose.resources.painterResource

@Preview
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel = remember { ProfileViewModel() }
) {
    val scrollState = rememberScrollState()

    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(top = 16.dp)
                .verticalScroll(scrollState)
        ) {
            // Title
            Text(
                text = "Profile",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = MainTextCol,
                modifier = Modifier.padding(horizontal = 10.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Gradient Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(
                        brush = Brush.verticalGradient(
                            0.0f to PinkPrimary.copy(alpha = 0.8f),
                            0.1f to Color.White
                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Avatar
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(4.dp, Color.White, CircleShape)
                            .background(Color.White)
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.ic_avatar),
                            contentDescription = "Avatar",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // User Info
                    Text(
                        text = viewModel.fullName,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MainTextCol
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    UserInfoText(value = "+1 ${viewModel.phoneNumber}")
                    Spacer(modifier = Modifier.height(20.dp))

                    // Edit Button (Vehicle Info Display)
                    IconButton(
                        title = "Honda Civic",
                        onClick = { /* Handle edit */ }
                    )
                    Spacer(modifier = Modifier.height(40.dp))

                    AccountsSection(
                        onItemClick = { type ->
                            when (type) {
                                "personal_info" -> viewModel.showModal()
                                "vehicle_info" -> viewModel.showVehicleModal()
                                "driving_info" -> viewModel.showDrivingModal()
                                // Handle other types if needed
                            }
                        }
                    )

                    Spacer(modifier = Modifier.height(40.dp))
                    LocationSection()
                    Spacer(modifier = Modifier.height(40.dp))

                    // DocumentSection with click handling for all items
                    DocumentSection { type ->
                        when (type) {
                            "license_photo" -> viewModel.showLicenseModal()
                            "car_photo" -> viewModel.showCarPhotoModal()
                            "rideshare_profile_photo" -> viewModel.showRideshareProfilePhotoModal()
                            // Handle other document types if needed
                        }
                    }

                    LoggerSection { }
                    Spacer(modifier = Modifier.height(40.dp))
                }
            }
        }

        // Personal Modal Overlay
        androidx.compose.animation.AnimatedVisibility(
            visible = viewModel.isModalVisible,
            enter = androidx.compose.animation.slideInVertically(
                initialOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(400)
            ),
            exit = androidx.compose.animation.slideOutVertically(
                targetOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(300)
            )
        ) {
            PersonalModal(
                viewModel = viewModel,
                onDismiss = { viewModel.hideModal() },
                modifier = Modifier.fillMaxSize()
            )
        }

        // Driving Modal Overlay
        androidx.compose.animation.AnimatedVisibility(
            visible = viewModel.isDrivingModalVisible,
            enter = androidx.compose.animation.slideInVertically(
                initialOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(400)
            ),
            exit = androidx.compose.animation.slideOutVertically(
                targetOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(300)
            )
        ) {
            DrivingModal(
                viewModel = viewModel,
                onDismiss = { viewModel.hideDrivingModal() },
                modifier = Modifier.fillMaxSize()
            )
        }

        // Vehicle Modal Overlay
        androidx.compose.animation.AnimatedVisibility(
            visible = viewModel.isVehicleModalVisible,
            enter = androidx.compose.animation.slideInVertically(
                initialOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(400)
            ),
            exit = androidx.compose.animation.slideOutVertically(
                targetOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(300)
            )
        ) {
            VehicleModal(
                viewModel = viewModel,
                onDismiss = { viewModel.hideVehicleModal() },
                modifier = Modifier.fillMaxSize()
            )
        }

        // License Modal Overlay
        androidx.compose.animation.AnimatedVisibility(
            visible = viewModel.isLicenseModalVisible,
            enter = androidx.compose.animation.slideInVertically(
                initialOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(400)
            ),
            exit = androidx.compose.animation.slideOutVertically(
                targetOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(300)
            )
        ) {
            LicenseModal(
                viewModel = viewModel,
                onDismiss = { viewModel.hideLicenseModal() },
                modifier = Modifier.fillMaxSize()
            )
        }

        // Car Photo Modal Overlay
        androidx.compose.animation.AnimatedVisibility(
            visible = viewModel.isCarPhotoModalVisible,
            enter = androidx.compose.animation.slideInVertically(
                initialOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(400)
            ),
            exit = androidx.compose.animation.slideOutVertically(
                targetOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(300)
            )
        ) {
            CarPhotoModal(
                viewModel = viewModel,
                onDismiss = { viewModel.hideCarPhotoModal() },
                modifier = Modifier.fillMaxSize()
            )
        }

        // RideShare Modal Overlay
        androidx.compose.animation.AnimatedVisibility(
            visible = viewModel.isRideshareProfilePhotoModalVisible,
            enter = androidx.compose.animation.slideInVertically(
                initialOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(400)
            ),
            exit = androidx.compose.animation.slideOutVertically(
                targetOffsetY = { it },
                animationSpec = androidx.compose.animation.core.tween(300)
            )
        ) {
            RideShareModal(
                viewModel = viewModel,
                onDismiss = { viewModel.hideRideshareProfilePhotoModal() },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
private fun UserInfoText(
    label: String? = null,
    value: String
) {
    val displayText = if (!label.isNullOrBlank()) {
        "$label: $value"
    } else {
        value
    }

    Text(
        text = displayText,
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        color = Color(0xFF666666),
        modifier = Modifier.padding(vertical = 2.dp)
    )
}