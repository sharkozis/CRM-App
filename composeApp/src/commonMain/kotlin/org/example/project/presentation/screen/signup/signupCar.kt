// package org.example.project.presentation.screen.signup


// import androidx.compose.foundation.Image
// import androidx.compose.foundation.background
// import androidx.compose.foundation.border
// import androidx.compose.foundation.clickable
// import androidx.compose.foundation.interaction.MutableInteractionSource
// import androidx.compose.foundation.layout.Arrangement
// import androidx.compose.foundation.layout.Box
// import androidx.compose.foundation.layout.BoxWithConstraints
// import androidx.compose.foundation.layout.Column
// import androidx.compose.foundation.layout.Row
// import androidx.compose.foundation.layout.Spacer
// import androidx.compose.foundation.layout.fillMaxHeight
// import androidx.compose.foundation.layout.fillMaxSize
// import androidx.compose.foundation.layout.fillMaxWidth
// import androidx.compose.foundation.layout.height
// import androidx.compose.foundation.layout.offset
// import androidx.compose.foundation.layout.padding
// import androidx.compose.foundation.layout.size
// import androidx.compose.foundation.layout.width
// import androidx.compose.foundation.layout.wrapContentHeight
// import androidx.compose.foundation.rememberScrollState
// import androidx.compose.foundation.shape.CircleShape
// import androidx.compose.foundation.shape.RoundedCornerShape
// import androidx.compose.foundation.text.KeyboardOptions
// import androidx.compose.foundation.verticalScroll
// import androidx.compose.material3.Icon
// import androidx.compose.material3.OutlinedTextField
// import androidx.compose.material3.OutlinedTextFieldDefaults
// import androidx.compose.material3.Text
// import androidx.compose.runtime.Composable
// import androidx.compose.runtime.getValue
// import androidx.compose.runtime.mutableStateOf
// import androidx.compose.runtime.remember
// import androidx.compose.runtime.setValue
// import androidx.compose.ui.Alignment
// import androidx.compose.ui.Modifier
// import androidx.compose.ui.draw.clip
// import androidx.compose.ui.graphics.Color
// import androidx.compose.ui.text.font.FontWeight
// import androidx.compose.ui.text.input.KeyboardType
// import androidx.compose.ui.tooling.preview.Preview
// import androidx.compose.ui.unit.dp
// import androidx.compose.ui.unit.sp
// import kotlinproject.composeapp.generated.resources.Res
// import kotlinproject.composeapp.generated.resources.ic_es
// import org.example.project.presentation.component.CircularIconButton
// import org.example.project.presentation.component.PrimaryButton
// import org.example.project.presentation.theme.DarkPurple
// import org.example.project.presentation.theme.DeepMaroon
// import org.example.project.presentation.theme.DiffWhiteBg
// import org.example.project.presentation.theme.MuteColor
// import org.example.project.presentation.theme.PinkPrimary
// import org.example.project.presentation.theme.grayTextColor
// import org.jetbrains.compose.resources.painterResource

// @Preview
// @Composable
// fun Signup(
//     onBackClick: () -> Unit = {},
//     onCreateAccountClick: () -> Unit = {}
// ) {
//     var name by remember { mutableStateOf("") }
//     var email by remember { mutableStateOf("") }
//     var phoneNumber by remember { mutableStateOf("") }
//     var referralCode by remember { mutableStateOf("") }
//     var selectedLanguage by remember { mutableStateOf("Spa") }

//     BoxWithConstraints(
//         modifier = Modifier
//             .fillMaxSize()
//             .background(DeepMaroon)
//     ) {
//         val screenHeight = maxHeight
//         val mainCardHeight = screenHeight * 0.9f
//         val bgCardHeight = screenHeight * 0.92f


//         // Background Card (Stacked effect)
//         Box(
//             modifier = Modifier
//                 .fillMaxWidth(0.9f)
//                 .height(bgCardHeight)
//                 .align(Alignment.BottomCenter)
//                 .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
//                 .background(Color.White.copy(alpha = 0.8f))
//         )

//         Column(
//             modifier = Modifier
//                 .fillMaxSize()
//                 .verticalScroll(rememberScrollState()),
//             horizontalAlignment = Alignment.CenterHorizontally
//         ) {
//             // Spacer to start the card lower down initially
//             Spacer(modifier = Modifier.height(screenHeight * 0.10f))

//             // Stack container that grows with its content
// //            Box(
// //                modifier = Modifier
// //                    .fillMaxWidth()
// //                    .wrapContentHeight()
// //            ) {
//                 // Background card (Peeks at the top)
// //                Box(
// //                    modifier = Modifier
// //                        .fillMaxWidth(0.9f)
// //                        // .matchParentSize() // Matches the size of the box (determined by the main card)
// //                        .offset(y = (-15).dp) // Peeks 15dp above the main card
// //                        .align(Alignment.TopCenter)
// //                        .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
// //                        .background(Color.White.copy(alpha = 0.8f))
// //                        .height(bgCardHeight)
// //                )

//                 // Main content card
//                 Box(
//                     modifier = Modifier
//                         .fillMaxWidth()
//                         .wrapContentHeight()
//                         .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
//                         .background(Color.White)
//                 ) {
//                     // Back Button (Aligned to card top-left)
//                     CircularIconButton(
//                         onClick = onBackClick,
//                         modifier = Modifier
//                             .padding(16.dp)
//                             .align(Alignment.TopStart)
//                     )

//                     Column(
//                         modifier = Modifier
//                             .fillMaxWidth()
//                             .padding(horizontal = 24.dp, vertical = 0.dp),
//                         verticalArrangement = Arrangement.Top
//                     ) {
//                         // Standardized top spacing inside the card
//                         Spacer(modifier = Modifier.height(40.dp))

//                         // Language Toggle
//                         Row(
//                             verticalAlignment = Alignment.CenterVertically,
//                             modifier = Modifier
//                                 .clip(RoundedCornerShape(50.dp))
//                                 .background(Color(0xFFF5F5F7))
//                                 .padding(4.dp)
//                         ) {
//                             LanguageToggleButton(
//                                 label = "Spa",
//                                 selected = selectedLanguage == "Spa",
//                                 showFlag = true,
//                                 onClick = { selectedLanguage = "Spa" }
//                             )
//                             LanguageToggleButton(
//                                 label = "Eng",
//                                 selected = selectedLanguage == "Eng",
//                                 showFlag = false,
//                                 onClick = { selectedLanguage = "Eng" }
//                             )
//                         }

//                         Spacer(modifier = Modifier.height(28.dp))







//                         // Title
//                         Text(
//                             text = "Let’s get you started",
//                             fontSize = 20.sp,
//                             fontWeight = FontWeight.Bold,
//                             color = Color(0xFF1A1A1A)
//                         )

//                         Spacer(modifier = Modifier.height(6.dp))

//                         // Subtitle
//                         Text(
//                             text = "Tell us a bit about yourself so we can set up your driver profile.",
//                             fontSize = 16.sp,
//                             color = grayTextColor,
//                         )

//                         Spacer(modifier = Modifier.height(24.dp))



//                         // Fields
//                         SignUpField(label = "Full Name", placeholder = "Enter your full name", value = name, onValueChange = { name = it })
//                         SignUpField(label = "Email", placeholder = "Enter your email", value = email, onValueChange = { email = it }, keyboardType = KeyboardType.Email)

//                         // Phone Number Field (Simulated with prefix)
//                         Text(text = "Phone Number", fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color(0xFF1A1A1A))
//                         Spacer(modifier = Modifier.height(8.dp))
//                         Row(verticalAlignment = Alignment.CenterVertically) {
//                             Row(
//                                 modifier = Modifier
//                                     .height(56.dp)
//                                     .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
//                                     .padding(horizontal = 12.dp),
//                                 verticalAlignment = Alignment.CenterVertically
//                             ) {
//                                 Text(text = "🇺🇸 +1", fontSize = 14.sp)
//                                 Text(text = "▼", fontSize = 12.sp, color = MuteColor)
//                             }
//                             Spacer(modifier = Modifier.width(8.dp))
//                             OutlinedTextField(
//                                 value = phoneNumber,
//                                 onValueChange = { phoneNumber = it },
//                                 placeholder = { Text("Enter your phone number", color = Color(0xFFBBBBBB), fontSize = 14.sp) },
//                                 shape = RoundedCornerShape(12.dp),
//                                 colors = OutlinedTextFieldDefaults.colors(
//                                     focusedBorderColor = PinkPrimary,
//                                     unfocusedBorderColor = Color(0xFFE0E0E0),
//                                     cursorColor = PinkPrimary
//                                 ),
//                                 modifier = Modifier.weight(1f),
//                                 keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
//                             )
//                         }
//                         Spacer(modifier = Modifier.height(16.dp))

//                         SignUpDropdownField(label = "Weekly Driving Hours", placeholder = "Select weekly driving hours")
//                         SignUpDropdownField(label = "Vehicle Year", placeholder = "Select vehicle year")
//                         SignUpDropdownField(label = "Vehicle Brand", placeholder = "Select vehicle brand")

//                         Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(vertical = 2.dp)) {
//                             Text(text = "ⓘ", fontSize = 16.sp, color = MuteColor)
//                             Spacer(modifier = Modifier.width(4.dp))
//                             Text("Select year to enable brand suggestions", fontSize = 14.sp, color = grayTextColor)
//                         }

//                         Spacer(modifier = Modifier.height(12.dp))

//                         SignUpDropdownField(label = "Vehicle Model", placeholder = "Select vehicle model")
//                         SignUpField(label = "Vehicle Color", placeholder = "Select or enter vehicle color", value = "", onValueChange = {})
//                         SignUpDropdownField(label = "City", placeholder = "Select your city")
//                         SignUpDropdownField(label = "Neighborhood", placeholder = "Select your neighborhood")
//                         SignUpField(label = "Referral Code (Optional)", placeholder = "Enter referral code (optional)", value = referralCode, onValueChange = { referralCode = it })

//                         Spacer(modifier = Modifier.height(32.dp))

//                         // Create Account Button
//                         PrimaryButton(
//                             title = "Create Account",
//                             onClick = onCreateAccountClick,
//                             modifier = Modifier
//                                 .fillMaxWidth()
//                                 .height(52.dp),
//                             containerColor = DarkPurple // Custom color passed to button
//                         )

//                         Spacer(modifier = Modifier.height(40.dp))
//                     }
//                 }
//             }
//         }
//     }
// //}

// @Composable
// private fun SignUpField(
//     label: String,
//     placeholder: String,
//     value: String,
//     onValueChange: (String) -> Unit,
//     keyboardType: KeyboardType = KeyboardType.Text
// ) {
//     Text(text = label, fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color(0xFF1A1A1A))
//     Spacer(modifier = Modifier.height(8.dp))
//     OutlinedTextField(
//         value = value,
//         onValueChange = onValueChange,
//         placeholder = { Text(text = placeholder, color = Color(0xFFBBBBBB), fontSize = 14.sp) },
//         shape = RoundedCornerShape(12.dp),
//         colors = OutlinedTextFieldDefaults.colors(
//             focusedBorderColor = PinkPrimary,
//             unfocusedBorderColor = Color(0xFFE0E0E0),
//             cursorColor = PinkPrimary
//         ),
//         singleLine = true,
//         keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
//         modifier = Modifier.fillMaxWidth()
//     )
//     Spacer(modifier = Modifier.height(16.dp))
// }

// @Composable
// private fun SignUpDropdownField(
//     label: String,
//     placeholder: String
// ) {
//     Text(text = label, fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color(0xFF1A1A1A))
//     Spacer(modifier = Modifier.height(8.dp))
//     Box(
//         modifier = Modifier
//             .fillMaxWidth()
//             .height(56.dp)
//             .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
//             .padding(horizontal = 16.dp),
//         contentAlignment = Alignment.CenterStart
//     ) {
//         Row(
//             modifier = Modifier.fillMaxWidth(),
//             horizontalArrangement = Arrangement.SpaceBetween,
//             verticalAlignment = Alignment.CenterVertically
//         ) {
//             Text(text = placeholder, color = Color(0xFFBBBBBB), fontSize = 14.sp)
//             Text(text = "▼", fontSize = 14.sp, color = MuteColor)
//         }
//     }
//     Spacer(modifier = Modifier.height(16.dp))
// }

// @Composable
// private fun LanguageToggleButton(
//     label: String,
//     selected: Boolean,
//     showFlag: Boolean,
//     onClick: () -> Unit
// ) {
//     Row(
//         verticalAlignment = Alignment.CenterVertically,
//         horizontalArrangement = Arrangement.Center,
//         modifier = Modifier
//             .then(
//                 if (selected) {
//                     Modifier
//                         .background(Color.White, RoundedCornerShape(50.dp))
//                         .border(1.dp, Color(0xFFE8E8E8), RoundedCornerShape(50.dp))
//                 } else Modifier
//             )
//             .clip(RoundedCornerShape(50.dp))
//             .clickable(
//                 indication = null,
//                 interactionSource = remember { MutableInteractionSource() }
//             ) { onClick() }
//             .padding(horizontal = 16.dp, vertical = 10.dp)
//     ) {
//         if (showFlag) {
//             Image(
//                 painter = painterResource(Res.drawable.ic_es),
//                 contentDescription = null,
//                 modifier = Modifier
//                     .size(24.dp)
//                     .clip(CircleShape)
//             )
//             Spacer(modifier = Modifier.size(8.dp))
//         }
//         Text(
//             text = label,
//             fontSize = 16.sp,
//             fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium,
//             color = if (selected) Color(0xFF2D2D32) else Color(0xFF8E8E93)
//         )
//     }
// }