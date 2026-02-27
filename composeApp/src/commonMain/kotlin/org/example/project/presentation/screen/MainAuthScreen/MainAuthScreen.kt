// File: org/example/project/presentation/screen/MainAuthScreen.kt
package org.example.project.presentation.screen.MainAuthScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.example.project.presentation.screen.login.LoginScreen
import org.example.project.presentation.screen.signup.SignupScreen

import org.example.project.presentation.screen.campaign.activeCampaign.ActiveCampaignScreen

@Composable
fun MainAuthScreen() {
    var currentScreen by remember { mutableStateOf("login") }

    when (currentScreen) {
        "login" -> {
            LoginScreen(
                onSignInClick = { /* Handle sign in */ },
                onForgotPasswordClick = { /* Handle forgot password */ },
                onSignUpClick = { currentScreen = "signup" }
            )
        }
        "signup" -> {
            SignupScreen(
                onBackClick = { currentScreen = "login" },
                onCancelClick = { /* Handle cancel */ },
                onNextClick = { currentScreen = "campaign" }
            )
        }
        "campaign" -> {
            ActiveCampaignScreen()
        }
    }
}