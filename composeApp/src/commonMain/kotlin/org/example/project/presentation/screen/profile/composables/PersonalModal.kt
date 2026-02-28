package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icDownArrow
import com.composables.icPen
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_avatar
import kotlinproject.composeapp.generated.resources.ic_eng
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PinkPrimary
import org.example.project.presentation.theme.grayTextColor
import org.jetbrains.compose.resources.painterResource

@Composable
fun PersonalModal(
    viewModel: ProfileViewModel,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit = {}
) {
    ProfileModal(
        title = "Personal information",
        primaryButtonText = "Save Changes",
        secondaryButtonText = "Reset",
        onPrimaryClick = { viewModel.onSaveClick() },
        onSecondaryClick = { viewModel.onResetClick() },
        onDismiss = onDismiss,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Profile Image Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color(0xFFE0E0E0),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    // Left: Avatar
                    Image(
                        painter = painterResource(Res.drawable.ic_avatar),
                        contentDescription = "Profile Image",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    // Center: Text info
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Profile image",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MainTextCol
                        )
                        Text(
                            text = "Upload in .jpg, .png file format,\nmin. size of 160px x 160px",
                            fontSize = 12.sp,
                            color = grayTextColor,
                            lineHeight = 16.sp
                        )
                    }

                    // Right: Edit Button
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .border(1.dp, Color(0xFFE0E0E0), CircleShape)
                            .clip(CircleShape)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            imageVector = icPen,
                            contentDescription = "Edit Profile Image",
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }

            // Full Name Field
            Column {
                Text(
                    text = "Full name",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = MainTextCol
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = viewModel.fullName,
                    onValueChange = { viewModel.updateFullName(it) },
                    placeholder = {
                        Text(
                            text = "Enter your full name",
                            color = Color(0xFFBBBBBB),
                            fontSize = 14.sp
                        )
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = PinkPrimary,
                        unfocusedBorderColor = Color(0xFFE0E0E0),
                        cursorColor = PinkPrimary
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }

            // Email Field
            Column {
                Text(
                    text = "Email",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = MainTextCol
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = viewModel.email,
                    onValueChange = { viewModel.updateEmail(it) },
                    placeholder = {
                        Text(
                            text = "Enter your email",
                            color = Color(0xFFBBBBBB),
                            fontSize = 14.sp
                        )
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = PinkPrimary,
                        unfocusedBorderColor = Color(0xFFE0E0E0),
                        cursorColor = PinkPrimary
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }

            // Phone Number Field
            Column {
                Text(
                    text = "Phone number",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = MainTextCol
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = viewModel.phoneNumber,
                    onValueChange = { viewModel.updatePhoneNumber(it) },
                    placeholder = {
                        Text(
                            text = "Enter your phone number",
                            color = Color(0xFFBBBBBB),
                            fontSize = 14.sp
                        )
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = PinkPrimary,
                        unfocusedBorderColor = Color(0xFFE0E0E0),
                        cursorColor = PinkPrimary
                    ),
                    singleLine = true,
                    leadingIcon = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 12.dp, end = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(Res.drawable.ic_eng),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "+1",
                                fontSize = 14.sp,
                                color = MainTextCol
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Image(
                                imageVector = icDownArrow,
                                contentDescription = null,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Box(
                                modifier = Modifier
                                    .height(24.dp)
                                    .width(1.dp)
                                    .background(Color(0xFFE0E0E0))
                            )
                        }
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
