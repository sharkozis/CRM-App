package org.example.project.presentation.screen.wallet.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.screen.wallet.WalletModal
import org.example.project.presentation.theme.PageSecondaryBg
import org.example.project.presentation.theme.PinkPrimary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReferralCard(modifier: Modifier = Modifier) {
    var showModal by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    Card(
        modifier = modifier.fillMaxWidth()
            .border(1.dp, PageSecondaryBg, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        ReferralContent(
            onGoToReferralClick = { showModal = true }
        )
    }

    if (showModal) {
        ModalBottomSheet(
            onDismissRequest = { showModal = false },
            sheetState = sheetState,
            shape = RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp),
            containerColor = Color.White,
            dragHandle = null // We have our own handle inside WalletModal
        ) {
            WalletModal()
        }
    }
}

@Composable
fun ReferralContent(
    onGoToReferralClick: () -> Unit
) {
    Column(
        modifier = Modifier.padding(8.dp)
            .border(1.dp, PageSecondaryBg, RoundedCornerShape(16.dp))
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Invite a driver to join the platform—once they sign up and get fully onboarded, you get paid. Easy!",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF1B0E2F),
            modifier = Modifier.background(PageSecondaryBg, shape = RoundedCornerShape(12.dp)).padding(16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        PrimaryButton(
            title = "Go to Referral",
            onClick = onGoToReferralClick,
            containerColor = PinkPrimary,
            modifier = Modifier.background(shape = RoundedCornerShape(12.dp), color = PinkPrimary)
        )
    }
}

@Preview
@Composable
fun ReferralCardPreview() {
    ReferralCard()
}