@file:OptIn(ExperimentalMaterial3Api::class)

package org.example.project.presentation.screen.campaign.weeklyCheckin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.*
import org.example.project.presentation.component.PrimaryButton
import org.example.project.presentation.theme.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WeeklyCheckinScreen(
    onBackClicked: () -> Unit = {},
    onCheckinClicked: () -> Unit = {}
) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Weekly Check-in",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = MainTextCol
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClicked) {
                        Image(
                            imageVector = icArrowleft,
                            contentDescription = "Back",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.White
                )
            )
        },
        bottomBar = {
            BottomNavigationBar()
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(PageSecondaryBg)
                .verticalScroll(scrollState)
                .padding(paddingValues)
                .padding(horizontal = 24.dp, vertical = 24.dp)
        ) {
            // Instructions Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Info Icon Placeholder
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .background(PinkPrimary.copy(alpha = 0.6f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "i", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    }
                    
                    Spacer(modifier = Modifier.width(16.dp))
                    
                    Column {
                        Text(
                            text = "INSTRUCTIONS",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )
                        Text(
                            text = "Please upload a photo of both sides of your car.",
                            fontSize = 12.sp,
                            color = grayTextColor
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Photos Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "PHOTOS",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = grayTextColor
                        )
                        Text(
                            text = "Delete",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = AlertTextCol,
                            modifier = Modifier.clickable { }
                        )
                    }

                    HorizontalDivider(color = PageSecondaryBg, thickness = 1.dp)

                    Row(
                        modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min)
                    ) {
                        PhotoUploadItem(
                            modifier = Modifier.weight(1f),
                            label = "Left Side"
                        )
                        
                        VerticalDivider(color = PageSecondaryBg, thickness = 1.dp)
                        
                        PhotoUploadItem(
                            modifier = Modifier.weight(1f),
                            label = "Right Side"
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Driver Feedback Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        // Feedback Icon Placeholder
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(PinkPrimary.copy(alpha = 0.6f)),
                            contentAlignment = Alignment.Center
                        ) {
                             Image(imageVector = icAction, contentDescription = null, modifier = Modifier.size(20.dp))
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Driver Feedback",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = MainTextCol
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    Text(
                        text = "Any interesting feedback over the past week?\nThis helps us understand campaign performance.",
                        fontSize = 12.sp,
                        color = grayTextColor,
                        lineHeight = 16.sp
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    
                    HorizontalDivider(color = PageSecondaryBg, thickness = 1.dp, modifier = Modifier.padding(bottom = 16.dp))

                    TextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("Type your answer here...", fontSize = 14.sp, color = grayTextColor) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = PageSecondaryBg.copy(alpha = 0.5f),
                            unfocusedContainerColor = PageSecondaryBg.copy(alpha = 0.5f),
                            disabledContainerColor = PageSecondaryBg.copy(alpha = 0.5f),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Check-in Button
            PrimaryButton(
                title = "Check-in",
                onClick = onCheckinClicked,
                modifier = Modifier.fillMaxWidth(),
                containerColor = PinkPrimary.copy(alpha = 0.8f)
            )
            
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun PhotoUploadItem(
    modifier: Modifier = Modifier,
    label: String
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = MainTextCol
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, MuteColor, RoundedCornerShape(24.dp))
                .padding(vertical = 12.dp)
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    imageVector = icCamera,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Add Photo",
                    fontSize = 12.sp,
                    color = grayTextColor
                )
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.White,
        tonalElevation = 8.dp
    ) {
        val items = listOf("Campaigns", "Wallet", "Chat", "Profile")
        items.forEach { item ->
            NavigationBarItem(
                selected = item == "Campaigns",
                onClick = {},
                icon = {
                    Box(modifier = Modifier.size(24.dp).background(if (item == "Campaigns") PinkPrimary else Color.Gray.copy(alpha = 0.3f), RoundedCornerShape(6.dp)))
                },
                label = {
                    Text(text = item, color = if (item == "Campaigns") PinkPrimary else grayTextColor, fontSize = 10.sp)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = PinkPrimary,
                    selectedTextColor = PinkPrimary,
                    unselectedIconColor = grayTextColor,
                    unselectedTextColor = grayTextColor,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}

@Preview
@Composable
fun WeeklyCheckinScreenPreview() {
    AppTheme {
        WeeklyCheckinScreen()
    }
}
