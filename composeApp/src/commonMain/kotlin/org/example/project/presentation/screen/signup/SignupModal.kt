package org.example.project.presentation.screen.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.ic_creationImg
import com.composables.icArrowRightWhite
import org.example.project.presentation.component.GradientPrimaryButton
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.grayTextColor
import org.jetbrains.compose.resources.painterResource

@Preview
@Composable
fun SignupModal(
    onGetStartedClick: () -> Unit = {}
) {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.5f)) // Dim background
    ) {
        val screenHeight = maxHeight
        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.55f) // 55% of the screen height
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp))
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                // Drag handle
                Spacer(modifier = Modifier.height(12.dp))
                Box(
                    modifier = Modifier
                        .width(60.dp)
                        .height(5.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFFE0E0E0))
                )
                
                Spacer(modifier = Modifier.height(30.dp))
                
                // Image
                Image(
                    painter = painterResource(Res.drawable.ic_creationImg),
                    contentDescription = "Success Illustration",
                    modifier = Modifier.size(screenHeight * 0.22f)
                )
                
                Spacer(modifier = Modifier.height(24.dp))
                
                // Title
                Text(
                    text = "Account Created!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = MainTextCol,
                    textAlign = TextAlign.Center
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                // Subtitle
                Text(
                    text = "Upload a few photos to complete your \n profile and start getting paid.",
                    fontSize = 16.sp,
                    color = grayTextColor,
                    textAlign = TextAlign.Center,
                    lineHeight = 22.sp
                )
                
                Spacer(modifier = Modifier.weight(1f))
                
                // Button
                GradientPrimaryButton(
                    title = "Get started",
                    onClick = onGetStartedClick,
                    trailingIcon = {
                        Image(
                            imageVector = icArrowRightWhite,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth(0.45f)
                )
            }
        }
    }
}
