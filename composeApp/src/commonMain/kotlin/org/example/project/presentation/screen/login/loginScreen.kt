package org.example.project.presentation.screen.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.BoxWithConstraints
import org.example.project.presentation.component.CircularIconButton
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.theme.DeepMaroon
import org.example.project.presentation.theme.PinkPrimary

@Composable
fun LoginScreen(
    onSignInClick: () -> Unit = {},
    onForgotPasswordClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var selectedLanguage by remember { mutableStateOf("Spa") }

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(DeepMaroon)
    ) {
        val screenHeight = maxHeight
        val mainCardHeight = screenHeight * 0.9f
        val bgCardHeight = screenHeight * 0.92f

        // Background Card (Stacked effect)
        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(bgCardHeight)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                .background(Color.White.copy(alpha = 0.8f))
        )

        // Main Content Card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(mainCardHeight)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                .background(Color.White)
        ) {
            // Back Button
            CircularIconButton(
                onClick = { /* Handle back click */ },
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.TopStart)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp, vertical = 24.dp),
                verticalArrangement = Arrangement.Top
            ) {
                // Percentage-based top spacing inside the card
                Spacer(modifier = Modifier.fillMaxHeight(0.12f))

                // Title
                Text(
                    text = "Sign in to Empty Driver Apps",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A1A1A)
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Subtitle
                Text(
                    text = "Sign in with your email and password",
                    fontSize = 14.sp,
                    color = Color(0xFF888888)
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Language Toggle
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFFF0F0F0))
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

                // Email Field Label
                Text(
                    text = "Email/number",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1A1A1A)
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Email Field
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = {
                        Text(
                            text = "Enter your email or number",
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
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Password Field Label
                Text(
                    text = "Password",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1A1A1A)
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Password Field
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholder = {
                        Text(
                            text = "Enter your password",
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
                    visualTransformation = if (passwordVisible) VisualTransformation.None
                    else PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    trailingIcon = {
                        TextButton(onClick = { passwordVisible = !passwordVisible }) {
                            Text(
                                text = if (passwordVisible) "Hide" else "Show",
                                color = PinkPrimary,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(32.dp))

                // Sign In Button
                PrimaryButton(
                    title = "Sign in",
                    onClick = onSignInClick
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Forgot password
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Forgot your password?",
                        fontSize = 14.sp,
                        color = Color(0xFF888888),
                        modifier = Modifier.clickable { onForgotPasswordClick() }
                    )
                }
            }
        }
    }
}

@Composable
private fun LanguageToggleButton(
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
                Text(text = "🇪🇸", fontSize = 14.sp)
            }
            Spacer(modifier = Modifier.size(6.dp))
        }
        Text(
            text = label,
            fontSize = 14.sp,
            fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
            color = if (selected) Color(0xFF1A1A1A) else Color(0xFF888888)
        )
    }
}
