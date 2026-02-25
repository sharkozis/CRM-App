package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.example.project.presentation.component.Navbar
import org.example.project.presentation.component.NavbarTab
import org.example.project.presentation.screen.campaign.PastCampaignScreen
import org.example.project.presentation.screen.campaign.UpcomingCampaignScreen
import org.example.project.presentation.screen.campaign.activeCampaign.ActiveCampaignScreen
import org.example.project.presentation.screen.chat.ChatScreen
import org.example.project.presentation.screen.login.LoginScreen
import org.example.project.presentation.screen.profile.ProfileScreen
import org.example.project.presentation.screen.signup.SignUpScreen
import org.example.project.presentation.screen.splash.SplashScreen
import org.example.project.presentation.screen.wallet.WalletScreen
import org.example.project.presentation.theme.AppTheme

 @Composable
 fun App() {
     AppTheme {
         var currentTab by remember { mutableStateOf(NavbarTab.Campaigns) }
         var campaignSubTab by remember { mutableStateOf("Upcoming") }

         Scaffold(
             modifier = Modifier.fillMaxSize(),
             bottomBar = {
                 Navbar(
                     currentTab = currentTab,
                     onTabSelected = { currentTab = it }
                 )
             }
         ) { innerPadding ->
             val screenModifier = Modifier.padding(innerPadding)

             when (currentTab) {
                 NavbarTab.Campaigns -> {
                     when (campaignSubTab) {
                         "Active" -> ActiveCampaignScreen(
                             modifier = screenModifier,
                             selectedTab = campaignSubTab,
                             onTabSelected = { campaignSubTab = it }
                         )
                         "Past" -> PastCampaignScreen(
                             modifier = screenModifier,
                             selectedTab = campaignSubTab,
                             onTabSelected = { campaignSubTab = it }
                         )
                         "Upcoming" -> UpcomingCampaignScreen(
                             modifier = screenModifier,
                             selectedTab = campaignSubTab,
                             onTabSelected = { campaignSubTab = it }
                         )
                     }
                 }
                 NavbarTab.Wallet   -> WalletScreen(modifier = screenModifier)
                 NavbarTab.Chat     -> ChatScreen(modifier = screenModifier)
                 NavbarTab.Profile  -> ProfileScreen(modifier = screenModifier)
             }
         }
     }
 }
 @Preview
 @Composable
 fun AppPreview() {
     App()
 }

//fun App(){
//    LoginScreen()
//}