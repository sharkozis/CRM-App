// File: org/example/project/presentation/screen/MainAuthScreen.kt
package org.example.project.presentation.screen.MainAuthScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.example.project.presentation.screen.login.LoginScreen
import org.example.project.presentation.screen.signup.SignupScreen

@Composable
fun MainAuthScreen() {
    var isLoginScreen by remember { mutableStateOf(true) }

    if (isLoginScreen) {
        LoginScreen(
            onSignInClick = { /* Handle sign in */ },
            onForgotPasswordClick = { /* Handle forgot password */ },
            onSignUpClick = { isLoginScreen = false }
        )
    } else {
        SignupScreen(
            onBackClick = { isLoginScreen = true },
            onCancelClick = { /* Handle cancel */ },
            onNextClick = { /* Handle next */ }
        )
    }
}