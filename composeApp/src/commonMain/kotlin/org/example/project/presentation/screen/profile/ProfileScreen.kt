package org.example.project.presentation.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icPen
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_avatar
import org.example.project.presentation.component.IconButton
import org.example.project.presentation.screen.profile.composables.CarPhotoSection
import org.example.project.presentation.screen.profile.composables.LocationSection
import org.example.project.presentation.screen.profile.composables.PreferenceSection
import org.example.project.presentation.screen.profile.composables.SupportSection
import org.example.project.presentation.screen.profile.composables.UberProfileSection
import org.example.project.presentation.screen.profile.composables.UberTripHistorySection
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.PinkPrimary
import org.jetbrains.compose.resources.painterResource

@Preview
@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 16.dp)
            .verticalScroll(scrollState)
    ) {
        // Title
        Text(
            text = "Profile",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MainTextCol,
            modifier = Modifier.padding(horizontal = 10.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Gradient Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .background(
                    brush = Brush.verticalGradient(
                        0.0f to PinkPrimary.copy(alpha = 0.6f), // 20% Pink area starts here
                        0.2f to Color.White                    // Remaining 80% is white
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Avatar
                Box(
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .border(4.dp, Color.White, CircleShape)
                        .background(Color.White)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.ic_avatar),
                        contentDescription = "Avatar",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // User Info
                Text(
                    text = "Joseph A.",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MainTextCol
                )

                Spacer(modifier = Modifier.height(8.dp))

                UserInfoText(label = "Full Name", value = "Joseph Anthony")
                UserInfoText(label = "Email", value = "joseph@email.com")
                UserInfoText(label = "Phone", value = "555-0199")
                UserInfoText(label = "Car Model", value = "Toyota Camry")

                Spacer(modifier = Modifier.height(20.dp))

                // Edit Button
                IconButton(
                    title = "Edit",
                    icon = icPen,
                    onClick = { /* Handle edit */ }
                )

                Spacer(modifier = Modifier.height(40.dp))

                // Preferences Section
                PreferenceSection()
                Spacer(modifier = Modifier.height(40.dp))

                LocationSection()
                Spacer(modifier = Modifier.height(40.dp))

                SupportSection {  }
                Spacer(modifier = Modifier.height(40.dp))

                CarPhotoSection {  }
                Spacer(modifier = Modifier.height(40.dp))

                UberProfileSection()
                Spacer(modifier = Modifier.height(40.dp))


                UberTripHistorySection {  }
                Spacer(modifier = Modifier.height(40.dp))

            }
        }
    }
}

@Composable
private fun UserInfoText(label: String, value: String) {
    Text(
        text = "$label: $value",
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        color = Color(0xFF666666),
        modifier = Modifier.padding(vertical = 2.dp)
    )
}
