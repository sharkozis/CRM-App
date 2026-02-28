package org.example.project.presentation.screen.profile.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    // Personal modal visibility
    var isModalVisible by mutableStateOf(false)
        private set

    // Driving modal visibility
    var isDrivingModalVisible by mutableStateOf(false)
        private set

    // Personal Information States
    var fullName by mutableStateOf("Joseph Ahmed")
        private set
    var email by mutableStateOf("ryanditya@gmail.com")
        private set
    var phoneNumber by mutableStateOf("514 XXX-XXXX")
        private set

    // Driving Information States
    var platform by mutableStateOf("")
        private set
    var city by mutableStateOf("")
        private set
    var areas by mutableStateOf("")
        private set
    var hours by mutableStateOf("")
        private set

    // Initial values for personal info (for reset)
    private var initialFullName = fullName
    private var initialEmail = email
    private var initialPhoneNumber = phoneNumber

    // Initial values for driving info (for reset)
    private var initialPlatform = platform
    private var initialCity = city
    private var initialAreas = areas
    private var initialHours = hours

    // Personal Modal Controls
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
        // Persist personal changes
        initialFullName = fullName
        initialEmail = email
        initialPhoneNumber = phoneNumber
    }

    // Driving Modal Controls
    fun showDrivingModal() {
        isDrivingModalVisible = true
    }

    fun hideDrivingModal() {
        isDrivingModalVisible = false
    }

    fun updatePlatform(newPlatform: String) {
        platform = newPlatform
    }

    fun updateCity(newCity: String) {
        city = newCity
    }

    fun updateAreas(newAreas: String) {
        areas = newAreas
    }

    fun updateHours(newHours: String) {
        hours = newHours
    }

    fun onDrivingResetClick() {
        resetDrivingFields()
        // Optionally hide the modal if desired, but typical reset keeps modal open
        // hideDrivingModal()
    }

    fun onDrivingSaveClick() {
        saveDrivingChanges()
        hideDrivingModal()
    }

    fun resetDrivingFields() {
        platform = initialPlatform
        city = initialCity
        areas = initialAreas
        hours = initialHours
    }

    fun saveDrivingChanges() {
        // Persist driving changes
        initialPlatform = platform
        initialCity = city
        initialAreas = areas
        initialHours = hours
        // Additional persistence logic (e.g., API call) would go here
    }
}