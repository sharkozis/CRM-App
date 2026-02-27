// File: org/example/project/presentation/screen/signup/SignupScreen.kt
package org.example.project.presentation.screen.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icDownArrow
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_eng
import kotlinproject.composeapp.generated.resources.ic_es
import org.example.project.presentation.component.CircularIconButton
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.theme.DeepMaroon
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PinkPrimary
import org.example.project.presentation.theme.grayTextColor
import org.example.project.presentation.theme.MuteColor
import org.jetbrains.compose.resources.painterResource

@Composable
fun SignupScreen(
    onBackClick: () -> Unit = {},
    onCancelClick: () -> Unit = {},
    onNextClick: () -> Unit = {}
) {
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var otpCode by remember { mutableStateOf("") }
    var platform by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var drivingArea by remember { mutableStateOf("") }
    var drivingHours by remember { mutableStateOf("") }
    var vehicleModel by remember { mutableStateOf("") }
    var vehicleYear by remember { mutableStateOf("") }
    var vehicleColor by remember { mutableStateOf("") }
    
    var selectedLanguage by remember { mutableStateOf("Spa") }
    var currentStep by remember { mutableStateOf(0) }

    val stepData = listOf(
        StepInfo("Welcome to Empty", "Please enter your phone number to access your account.", "Continue"),
        StepInfo("Verification code", "Please enter the 6-digit code we sent to your number to verify your account.", "Confirm"),
        StepInfo("Which platform do you drive for?", "Choose the platform you work with so we can set up your profile correctly.", "Confirm"),
        StepInfo("Where do you drive?", "Tell us where and when you usually drive so we can set up your driver profile properly.", "Next"),
        StepInfo("About Yourself", "Enter your basic details to create your driver account.", "Next"),
        StepInfo("Tell us about your ride", "Enter your vehicle details so we can match you with suitable campaigns.", "Next")
    )

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(DeepMaroon)
    ) {
        val screenHeight = maxHeight
        val mainCardHeight = screenHeight * 0.9f

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(screenHeight * 0.08f))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
            ) {
                // Background Card
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .heightIn(min = mainCardHeight)
                        .offset(y = (-20).dp)
                        .align(Alignment.TopCenter)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                        .background(Color.White.copy(alpha = 0.8f))
                )

                // Main Content Card
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = mainCardHeight)
                        .align(Alignment.TopCenter)
                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                        .background(Color.White)
                ) {
                    CircularIconButton(
                        onClick = onBackClick,
                        modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.TopStart)
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp, vertical = 0.dp),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Spacer(modifier = Modifier.height(screenHeight * 0.12f))

                        // Language Toggle
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .clip(RoundedCornerShape(50.dp))
                                .background(Color(0xFFF5F5F7))
                                .padding(4.dp)
                        ) {
                            LanguageToggleButton(
                                label = "Spa",
                                selected = selectedLanguage == "Spa",
                                showFlag = true,
                                onClick = { selectedLanguage = "Spa" }
                            )
                            LanguageToggleButton(
                                label = "Eng",
                                selected = selectedLanguage == "Eng",
                                showFlag = false,
                                onClick = { selectedLanguage = "Eng" }
                            )
                        }

                        Spacer(modifier = Modifier.height(28.dp))

                        Text(
                            text = stepData[currentStep].title,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = stepData[currentStep].subtitle,
                            fontSize = 16.sp,
                            color = grayTextColor
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        // Stepper Input
                        when (currentStep) {
                            0 -> {
                                // Step 1: Phone Number
                                Text(
                                    text = "Phone Number",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = MainTextCol
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                OutlinedTextField(
                                    value = phoneNumber,
                                    onValueChange = { phoneNumber = it },
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
                            1 -> {
                                // Step 2: 6-digit OTP
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    repeat(6) { index ->
                                        val char = otpCode.getOrNull(index)?.toString() ?: ""
                                        Box(
                                            modifier = Modifier
                                                .weight(1f)
                                                .height(56.dp)
                                                .border(1.dp, if (char.isNotEmpty()) PinkPrimary else Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
                                                .background(Color.White),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            if (char.isEmpty() && index == otpCode.length) {
                                                // Placeholder or cursor could go here
                                            }
                                            Text(
                                                text = char,
                                                fontSize = 18.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = MainTextCol
                                            )
                                        }
                                    }
                                }
                                // Hidden TextField to capture input
                                OutlinedTextField(
                                    value = otpCode,
                                    onValueChange = { if (it.length <= 6) otpCode = it },
                                    modifier = Modifier.fillMaxWidth().height(0.dp),
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )
                            }
                            2 -> {
                                // Step 3: Platform Dropdown
                                Text(
                                    text = "Platform",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = MainTextCol
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                OutlinedTextField(
                                    value = platform,
                                    onValueChange = { platform = it },
                                    placeholder = {
                                        Text(
                                            text = "Select platform",
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
                                    readOnly = true,
                                    trailingIcon = {
                                        Image(
                                            imageVector = icDownArrow,
                                            contentDescription = null,
                                            modifier = Modifier.size(15.dp)
                                        )
                                    },
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                            3 -> {
                                // Step 4: City, Area, Hours
                                val fields = listOf(
                                    Triple("City", city, "Select your city"),
                                    Triple("Area you drive in most", drivingArea, "Select area"),
                                    Triple("Typical weekly driving hours", drivingHours, "Select hours")
                                )
                                
                                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                                    fields.forEach { (label, value, placeholder) ->
                                        Column {
                                            Text(
                                                text = label,
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Medium,
                                                color = MainTextCol
                                            )
                                            Spacer(modifier = Modifier.height(8.dp))
                                            OutlinedTextField(
                                                value = value,
                                                onValueChange = { /* Update logic based on label */ },
                                                placeholder = {
                                                    Text(
                                                        text = placeholder,
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
                                                readOnly = true,
                                                trailingIcon = {
                                                    Image(
                                                        imageVector = icDownArrow,
                                                        contentDescription = null,
                                                        modifier = Modifier.size(15.dp)
                                                    )
                                                },
                                                modifier = Modifier.fillMaxWidth()
                                            )
                                        }
                                    }
                                }
                            }
                            4 -> {
                                // Step 5: About Yourself
                                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                                    // Full Name
                                    Column {
                                        Text(
                                            text = "Full Name",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MainTextCol
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        OutlinedTextField(
                                            value = fullName,
                                            onValueChange = { fullName = it },
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
                                    // Email
                                    Column {
                                        Text(
                                            text = "Email",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MainTextCol
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        OutlinedTextField(
                                            value = email,
                                            onValueChange = { email = it },
                                            placeholder = {
                                                Text(
                                                    text = "steve_henry@gmail.com",
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
                                }
                            }
                            5 -> {
                                // Step 6: Vehicle Details
                                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                                    // Model
                                    Column {
                                        Text(
                                            text = "Vehicle Model",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MainTextCol
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        OutlinedTextField(
                                            value = vehicleModel,
                                            onValueChange = { vehicleModel = it },
                                            placeholder = {
                                                Text(
                                                    text = "Enter vehicle model",
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
                                    // Year
                                    Column {
                                        Text(
                                            text = "Vehicle Year",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MainTextCol
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        OutlinedTextField(
                                            value = vehicleYear,
                                            onValueChange = { vehicleYear = it },
                                            placeholder = {
                                                Text(
                                                    text = "Select year",
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
                                            readOnly = true,
                                            trailingIcon = {
                                                Image(
                                                    imageVector = icDownArrow,
                                                    contentDescription = null,
                                                    modifier = Modifier.size(15.dp)
                                                )
                                            },
                                            modifier = Modifier.fillMaxWidth()
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "We accept vehicles up to 12 years old.",
                                            color = PinkPrimary,
                                            fontSize = 12.sp
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(PinkPrimary.copy(alpha = 0.3f)))
                                    }
                                    // Color
                                    Column {
                                        Text(
                                            text = "Vehicle Color",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = MainTextCol
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        OutlinedTextField(
                                            value = vehicleColor,
                                            onValueChange = { vehicleColor = it },
                                            placeholder = {
                                                Text(
                                                    text = "Select color",
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
                                            readOnly = true,
                                            trailingIcon = {
                                                Image(
                                                    imageVector = icDownArrow,
                                                    contentDescription = null,
                                                    modifier = Modifier.size(15.dp)
                                                )
                                            },
                                            modifier = Modifier.fillMaxWidth()
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(32.dp))

                        // Button logic
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 24.dp),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            TextButton(
                                onClick = {
                                    if (currentStep > 0) {
                                        currentStep--
                                    } else {
                                        onBackClick() // Use onBackClick as requested
                                    }
                                },
                                modifier = Modifier
                                    .weight(1f)
                                    .border(1.dp, MuteColor, RoundedCornerShape(50.dp))
                            ) {
                                Text(
                                    text = if (currentStep > 0) "Back" else "Cancel",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = grayTextColor,
                                )
                            }
                            PrimaryButton(
                                title = stepData[currentStep].buttonText,
                                onClick = {
                                    if (currentStep < stepData.size - 1) {
                                        currentStep++
                                    } else {
                                        onNextClick()
                                    }
                                },
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }
        }
    }
}

data class StepInfo(
    val title: String,
    val subtitle: String,
    val buttonText: String
)

@Composable
fun LanguageToggleButton(
    label: String,
    selected: Boolean,
    showFlag: Boolean,
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(RoundedCornerShape(50.dp))
            .background(
                if (selected) Color.White else Color.Transparent
            )
            .border(
                width = if (selected) 1.dp else 0.dp,
                color = if (selected) Color(0xFFDDDDDD) else Color.Transparent,
                shape = RoundedCornerShape(50.dp)
            )
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) { onClick() }
            .padding(horizontal = 14.dp, vertical = 8.dp)
    ) {
        if (showFlag) {
            Box(
                modifier = Modifier
                    .size(22.dp)
                    .clip(CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(Res.drawable.ic_es),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.size(6.dp))
        }
        Text(
            text = label,
            fontSize = 14.sp,
            fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
            color = if (selected) MainTextCol else grayTextColor
        )
    }
}