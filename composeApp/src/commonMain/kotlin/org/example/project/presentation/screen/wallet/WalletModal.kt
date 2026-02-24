package org.example.project.presentation.screen.wallet

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icDownArrow
import com.composables.icLink
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PinkPrimary
import org.example.project.presentation.theme.SuccessActive
import org.example.project.presentation.theme.grayTextColor
import org.example.project.presentation.theme.yellowTextColor

data class ReferralItem(
    val name: String,
    val email: String,
    val status: String,
    val amount: String,
    val statusColor: Color
)

@Composable
fun WalletModal(
    modifier: Modifier = Modifier,
    referrals: List<ReferralItem> = listOf(
        ReferralItem("Steve Henry", "steve_henry@gmail.com", "Pending", "$10", yellowTextColor),
        ReferralItem("Arman Aditya", "arman@gmail.com", "Earned", "$10", SuccessActive),
        ReferralItem("Michael Chen", "michael.c@example.com", "Pending", "$15", yellowTextColor),
        ReferralItem("Sarah Johnson", "sarah.j@example.com", "Earned", "$20", SuccessActive),
        ReferralItem("David Kim", "david.k@example.com", "Pending", "$12", yellowTextColor),
        ReferralItem("Emily Davis", "emily.d@example.com", "Earned", "$18", SuccessActive)
    )
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.9f)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp)
            )
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        // Handle bar for modal
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(4.dp)
                .background(Color(0xFFE0E0E0), RoundedCornerShape(2.dp))
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Page Title
        Text(
            text = "My Referrals",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MainTextCol,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Scrollable content
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(scrollState)
                .padding(horizontal = 24.dp)
        ) {
            // Section Title
            Text(
                text = "Invite member",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MainTextCol
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Main Card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color(0xFFF0F0F0), RoundedCornerShape(16.dp)),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Referral Code",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = MainTextCol
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Code Box
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "2564564",
                            fontSize = 18.sp,
                            color = MainTextCol
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Edit",
                                fontSize = 16.sp,
                                color = MainTextCol,
                                modifier = Modifier.padding(end = 4.dp)
                            )
                            Icon(
                                imageVector = icDownArrow,
                                contentDescription = "Edit",
                                tint = MainTextCol
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Send Invite Button
                    PrimaryButton(
                        title = "Send invite",
                        onClick = {},
                        containerColor = PinkPrimary,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    // Or copy link divider
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        HorizontalDivider(
                            modifier = Modifier.weight(1f),
                            thickness = 1.dp,
                            color = Color(0xFFE0E0E0)
                        )
                        Text(
                            text = "Or copy link",
                            fontSize = 14.sp,
                            color = grayTextColor,
                            modifier = Modifier.padding(horizontal = 12.dp)
                        )
                        HorizontalDivider(
                            modifier = Modifier.weight(1f),
                            thickness = 1.dp,
                            color = Color(0xFFE0E0E0)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Link Section
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFF8F7FA), RoundedCornerShape(26.dp))
                            .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(26.dp))
                            .padding(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(12.dp))
                        Icon(
                            imageVector = icLink,
                            contentDescription = "Link",
                            tint = Color.Black,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "emptyad.com/2564564",
                            fontSize = 14.sp,
                            color = MainTextCol,
                            modifier = Modifier.weight(1f)
                        )
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = MainTextCol
                            ),
                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp),
                            modifier = Modifier.height(40.dp)
                        ) {
                            Text(
                                text = "Copy",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Referral Members List
            referrals.forEach { item ->
                ReferralMemberItem(
                    name = item.name,
                    email = item.email,
                    status = item.status,
                    amount = item.amount,
                    statusColor = item.statusColor
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
fun ReferralMemberItem(
    name: String,
    email: String,
    status: String,
    amount: String,
    statusColor: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Round Box Placeholder for Avatar
        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
                .background(Color(0xFFF0F0F0), CircleShape)
                .border(1.dp, Color(0xFFE0E0E0), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = name.firstOrNull()?.toString() ?: "U",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MainTextCol.copy(alpha = 0.5f)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MainTextCol
            )
            Text(
                text = email,
                fontSize = 14.sp,
                color = grayTextColor
            )
        }

        Box(
            modifier = Modifier
                .border(
                    1.dp,
                    statusColor.copy(alpha = 0.3f),
                    RoundedCornerShape(8.dp)
                )
                .padding(horizontal = 10.dp, vertical = 8.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = status,
                    fontSize = 14.sp,
                    color = statusColor.copy(alpha = 0.8f),
                    modifier = Modifier.padding(end = 6.dp)
                )
                Text(
                    text = amount,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = statusColor
                )
            }
        }
    }
}

@Preview
@Composable
fun WalletModalPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        WalletModal(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}