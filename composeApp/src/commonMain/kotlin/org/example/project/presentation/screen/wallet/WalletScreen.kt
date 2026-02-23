package org.example.project.presentation.screen.wallet

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.component.Navbar
import org.example.project.presentation.component.NavbarTab
import org.example.project.presentation.screen.wallet.composables.IncomeSummaryContent
import org.example.project.presentation.screen.wallet.composables.PaymentTrackerContent
import org.example.project.presentation.screen.wallet.composables.ReferralContent
import org.example.project.presentation.screen.wallet.composables.TransactionHistoryList
import org.example.project.presentation.theme.PageSecondaryBg

@Composable
fun WalletScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Scaffold(
        bottomBar = {
            Navbar(currentTab = NavbarTab.Wallet)
        },
        containerColor = PageSecondaryBg
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(PageSecondaryBg)
                .padding(paddingValues)
                .verticalScroll(scrollState)
                .padding(bottom = 24.dp)
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            // Wallet Title Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text(
                    text = "Wallet",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B0E2F)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Main White Card Content
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 12.dp)
                    ) {
                        // Income Summary Section
                        IncomeSummaryContent()

                        DashedDivider(Modifier.padding(vertical = 12.dp, horizontal = 16.dp))

                        // Referral Section
                        ReferralContent()

                        DashedDivider(Modifier.padding(vertical = 12.dp, horizontal = 16.dp))

                        // Payment Tracker (MORDER) Section
                        PaymentTrackerContent()

                        DashedDivider(Modifier.padding(vertical = 12.dp, horizontal = 16.dp))

                        // Transaction History Section
                        Box(modifier = Modifier.padding(horizontal = 16.dp)) {
                            TransactionHistoryList()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DashedDivider(modifier: Modifier = Modifier) {
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(1.dp)
    ) {
        drawLine(
            color = Color(0xFFE0E0E0),
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f),
            strokeWidth = 2f
        )
    }
}

@Preview
@Composable
private fun WalletScreenPreview() {
    WalletScreen()
}