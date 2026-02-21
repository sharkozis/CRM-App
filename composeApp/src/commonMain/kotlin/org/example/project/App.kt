package org.example.project

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.presentation.screen.login.LoginScreen
import org.example.project.presentation.screen.signup.SignUpScreen
import org.example.project.presentation.screen.splash.SplashScreen
import org.example.project.presentation.theme.AppTheme

@Preview
@Composable
fun App() {
    AppTheme {
//       SplashScreen()
//        LoginScreen {}
        SignUpScreen {}
    }
}