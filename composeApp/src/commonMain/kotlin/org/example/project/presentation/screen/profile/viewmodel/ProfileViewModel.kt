package org.example.project.presentation.screen.profile.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    var isModalVisible by mutableStateOf(false)
        private set

    fun showModal() {
        isModalVisible = true
    }

    fun hideModal() {
        isModalVisible = false
    }
    
    fun onResetClick() {
        // Implement reset logic here if needed
        hideModal()
    }
    
    fun onSaveClick() {
        // Implement save logic here if needed
        hideModal()
    }
}
