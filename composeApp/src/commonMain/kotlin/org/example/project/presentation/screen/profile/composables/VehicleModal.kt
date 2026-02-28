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
import org.example.project.presentation.theme.PinkPrimary
import org.example.project.presentation.theme.grayTextColor

@Composable
fun VehicleModal(
    viewModel: ProfileViewModel,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    ProfileModal(
        title = "Vehicle Information",
        primaryButtonText = "Save Change",
        secondaryButtonText = "Reset",
        onPrimaryClick = { viewModel.onVehicleSaveClick() },
        onSecondaryClick = { viewModel.onVehicleResetClick() },
        onDismiss = onDismiss,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Vehicle Model
            VehicleFieldLabel("Vehicle Model")
            PlainInputField(
                placeholder = "Select vehicle model",
                value = viewModel.vehicleModel,
                onValueChange = { viewModel.updateVehicleModel(it) }
            )

            // Vehicle Year
            VehicleFieldLabel("Vehicle Year")
            DropdownField(
                placeholder = "Select vehicle year",
                value = viewModel.vehicleYear,
                onValueChange = { viewModel.updateVehicleYear(it) }
            )

            // Info text
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "ⓘ",
                    fontSize = 14.sp,
                    color = PinkPrimary,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Text(
                    text = "We accept vehicles up to 12 years old.",
                    fontSize = 13.sp,
                    color = PinkPrimary
                )
            }

            // Vehicle Color
            VehicleFieldLabel("Vehicle Color")
            DropdownField(
                placeholder = "Select or enter vehicle color",
                value = viewModel.vehicleColor,
                onValueChange = { viewModel.updateVehicleColor(it) }
            )
        }
    }
}

@Composable
private fun VehicleFieldLabel(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = MainTextCol
    )
}

/** Plain text input-style field (no arrow, like Vehicle Model) */
@Composable
private fun PlainInputField(
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = value.ifEmpty { placeholder },
            color = if (value.isNotEmpty()) MainTextCol else grayTextColor,
            fontSize = 14.sp
        )
    }
}

/** Dropdown-style selector field with icDownArrow (Vehicle Year, Vehicle Color) */
@Composable
private fun DropdownField(
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) { /* In a real app: show a selection dialog/bottom sheet */ }
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