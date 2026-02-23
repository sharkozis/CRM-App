package org.example.project.presentation.screen.wallet.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.theme.PinkPrimary

@Composable
fun ReferralCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Invite a driver to join the platform—once they sign up and get fully onboarded, you get paid. Easy!",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF1B0E2F)
            )
            Spacer(modifier = Modifier.height(16.dp))
            PrimaryButton(
                title = "Go to Referral",
                onClick = {},
                containerColor = PinkPrimary
            )
        }
    }
}
