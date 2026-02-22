package org.example.project

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.presentation.screen.campaign.UpcomingCampaignScreen
import org.example.project.presentation.screen.campaign.activeCampaign.ActiveCampaignScreen
import org.example.project.presentation.screen.campaign.weeklyCheckin.WeeklyCheckinScreen
import org.example.project.presentation.screen.demo.DemoScreen
import org.example.project.presentation.screen.login.LoginScreen
import org.example.project.presentation.screen.signup.SignUpScreen
import org.example.project.presentation.theme.AppTheme

@Preview
@Composable
fun App() {
    AppTheme {
//       SplashScreen()
//        LoginScreen {}
//        SignUpScreen {}
//        ActiveCampaignScreen()
//        DemoScreen()
//        WeeklyCheckinScreen()
        WeeklyCheckinScreen()
        
    }
}