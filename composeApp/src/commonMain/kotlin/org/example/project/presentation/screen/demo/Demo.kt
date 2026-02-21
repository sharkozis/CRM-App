package org.example.project.presentation.screen.demo

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import com.composables.icMenu

@Composable
fun DemoScreen() {
    Image(
        imageVector = icMenu,
        contentDescription = "Menu Icon"
    )
}

