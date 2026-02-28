package org.example.project.presentation.screen.profile.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    var isModalVisible by mutableStateOf(false)
        private set

    // Personal Modal States
    var fullName by mutableStateOf("Joseph Ahmed")
        private set
    var email by mutableStateOf("ryanditya@gmail.com")
        private set
    var phoneNumber by mutableStateOf("514 XXX-XXXX")
        private set

    // Initial values for reset logic
    private var initialFullName = fullName
    private var initialEmail = email
    private var initialPhoneNumber = phoneNumber

    fun showModal() {
        isModalVisible = true
    }

    fun hideModal() {
        isModalVisible = false
    }

    fun updateFullName(newName: String) {
        fullName = newName
    }

    fun updateEmail(newEmail: String) {
        email = newEmail
    }

    fun updatePhoneNumber(newNumber: String) {
        phoneNumber = newNumber
    }

    fun onResetClick() {
        resetFields()
        hideModal()
    }

    fun onSaveClick() {
        saveChanges()
        hideModal()
    }

    fun resetFields() {
        fullName = initialFullName
        email = initialEmail
        phoneNumber = initialPhoneNumber
    }

    fun saveChanges() {
        // Logic to persist changes would go here
        initialFullName = fullName
        initialEmail = email
        initialPhoneNumber = phoneNumber
    }
}
