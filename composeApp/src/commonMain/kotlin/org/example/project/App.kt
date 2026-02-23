package org.example.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.presentation.component.Navbar
import org.example.project.presentation.component.NavbarTab
import org.example.project.presentation.screen.campaign.UpcomingCampaignScreen
import org.example.project.presentation.screen.chat.ChatScreen
import org.example.project.presentation.screen.profile.ProfileScreen
import org.example.project.presentation.screen.wallet.WalletScreen
import org.example.project.presentation.theme.AppTheme

@Composable
fun App() {
    AppTheme {
//       SplashScreen()
//        LoginScreen {}
//        SignUpScreen {}
//        ActiveCampaignScreen()
//        DemoScreen()
//        WeeklyCheckingScreen {  }
        UpcomingCampaignScreen {  }
//        PastCampaignScreen {  }






    }
}
@Preview
@Composable
fun AppPreview() {
    App()
}