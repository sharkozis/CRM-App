package org.example.project.presentation.screen.profile.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composables.icDownArrow
import org.example.project.presentation.screen.profile.components.ProfileModal
import org.example.project.presentation.screen.profile.viewmodel.ProfileViewModel
import org.example.project.presentation.theme.MainTextCol
import org.example.project.presentation.theme.grayTextColor

@Composable
fun DrivingModal(
    viewModel: ProfileViewModel,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    ProfileModal(
        title = "Driving Information",
        primaryButtonText = "Save Changes",
        secondaryButtonText = "Reset",
        onPrimaryClick = { viewModel.onDrivingSaveClick() },
        onSecondaryClick = { viewModel.onDrivingResetClick() },
        onDismiss = onDismiss,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FieldLabel("Platform")
            SelectorField(
                placeholder = "Select your Platform",
                value = viewModel.platform,
                onValueChange = { viewModel.updatePlatform(it) }
            )

            FieldLabel("City")
            SelectorField(
                placeholder = "Select your city",
                value = viewModel.city,
                onValueChange = { viewModel.updateCity(it) }
            )

            FieldLabel("Areas You Drive In Most")
            SelectorField(
                placeholder = "Select your driving areas",
                value = viewModel.areas,
                onValueChange = { viewModel.updateAreas(it) }
            )

            FieldLabel("Typical Weekly Driving Hours")
            SelectorField(
                placeholder = "Select weekly driving hours",
                value = viewModel.hours,
                onValueChange = { viewModel.updateHours(it) }
            )
        }
    }
}

@Composable
private fun FieldLabel(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = MainTextCol
    )
}

@Composable
private fun SelectorField(
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .border(
                width = 1.dp,
                color = Color(0xFFE0E0E0),
                shape = RoundedCornerShape(12.dp)
            )
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) { 
                // In a real app, this would show a selection dialog/bottom sheet
            }
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = if (value.isNotEmpty()) value else placeholder,
                color = if (value.isNotEmpty()) MainTextCol else grayTextColor,
                fontSize = 14.sp
            )
            
            Image(
                imageVector = icDownArrow,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}
