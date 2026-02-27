package org.example.project.presentation.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.geometry.Offset


val DeepMaroon = Color(0xFF7B264B)
val MuteColor = Color(0xFFDEDCE3)

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val DarkPurple = Color(0xFF211B2A)

//Border Colors
val BorderPink = Color(0xFFFDEBF3)

//action color
val SuccessActive = Color(0xFF3B9865)


//notification colors
val AlertCardBg = Color(0xFFF8D0D0)
val AlertTextCol = Color(0xFFC63C3C)

//bg colors
val PinkPrimary = Color(0xFFD77CA4)
val DiffWhiteBg = Color(0xFFF0F0F0)
val PageSecondaryBg = Color(0xFFF8F7FA)

//Text colors
val MainTextCol = Color (0xFF1B0E2F)
val grayTextColor = Color(0xFF7A767F)
val actionTextPurple = Color(0xFF661FAA)
val yellowTextColor = Color(0xFFEEBA31)
val maroonTextColor = Color(0xFF8B345A)






// ─── Gradient Colors ─────────────────────────────────────────────

val GradientMainStart = Color(0xFFEE2A7B)
val GradientMainMid = Color(0xFFF65399)
val GradientMainEnd = Color(0xFFFF7DB8)


// ─── Gradient Brushes ────────────────────────────────────────────
val GradientMain = Brush.linearGradient(
    colors = listOf(
        GradientMainStart,
        GradientMainMid,
        GradientMainEnd
    ),
    start = Offset.Zero,
    end = Offset(800f, 400f) // approximates 299.64deg
)

// ─── Gradient Brushes ────────────────────────────────────────────
val GradientSubStart = Color(0xFF7F00FF)
val GradientSubEnd = Color(0xFFE100FF)
val GradientSub = Brush.linearGradient(
    colors = listOf(
        GradientSubStart,
        GradientSubEnd
    ),
    start = Offset.Zero,
    end = Offset(800f, 400f) // approximates 299.64deg
)