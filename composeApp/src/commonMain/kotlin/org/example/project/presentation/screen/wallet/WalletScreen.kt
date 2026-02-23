package org.example.project.presentation.screen.wallet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.component.Navbar
import org.example.project.presentation.component.NavbarTab
import org.example.project.presentation.screen.wallet.composables.IncomeSummaryCard
import org.example.project.presentation.screen.wallet.composables.PaymentTrackerCard
import org.example.project.presentation.screen.wallet.composables.ReferralCard
import org.example.project.presentation.screen.wallet.composables.TransactionHistoryList
import org.example.project.presentation.theme.PageSecondaryBg
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WalletScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Wallet",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PageSecondaryBg
                )
            )
        },
        bottomBar = {
            Navbar(currentTab = NavbarTab.Wallet)
        },
        containerColor = PageSecondaryBg
    ) { paddingValues ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(PageSecondaryBg)
                .padding(paddingValues),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                IncomeSummaryCard()
            }
            item {
                ReferralCard()
            }
            item {
                PaymentTrackerCard()
            }
            item {
                TransactionHistoryList()
            }
        }
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletScreen()
}