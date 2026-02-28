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

    // Vehicle modal visibility
    var isVehicleModalVisible by mutableStateOf(false)
        private set

    // License modal visibility
    var isLicenseModalVisible by mutableStateOf(false)
        private set

    // Car photo modal visibility
    var isCarPhotoModalVisible by mutableStateOf(false)
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

    // Vehicle Information States
    var vehicleModel by mutableStateOf("")
        private set
    var vehicleYear by mutableStateOf("")
        private set
    var vehicleColor by mutableStateOf("")
        private set

    // License State
    var licenseImageUri by mutableStateOf("")
        private set

    // Car Photo State
    var carPhotoUri by mutableStateOf("")
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

    // Initial values for vehicle info (for reset)
    private var initialVehicleModel = vehicleModel
    private var initialVehicleYear = vehicleYear
    private var initialVehicleColor = vehicleColor

    // Initial values for license
    private var initialLicenseImageUri = licenseImageUri

    // Initial values for car photo
    private var initialCarPhotoUri = carPhotoUri

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
        initialPlatform = platform
        initialCity = city
        initialAreas = areas
        initialHours = hours
    }

    // Vehicle Modal Controls
    fun showVehicleModal() {
        isVehicleModalVisible = true
    }

    fun hideVehicleModal() {
        isVehicleModalVisible = false
    }

    fun updateVehicleModel(newModel: String) {
        vehicleModel = newModel
    }

    fun updateVehicleYear(newYear: String) {
        vehicleYear = newYear
    }

    fun updateVehicleColor(newColor: String) {
        vehicleColor = newColor
    }

    fun onVehicleResetClick() {
        resetVehicleFields()
    }

    fun onVehicleSaveClick() {
        saveVehicleChanges()
        hideVehicleModal()
    }

    fun resetVehicleFields() {
        vehicleModel = initialVehicleModel
        vehicleYear = initialVehicleYear
        vehicleColor = initialVehicleColor
    }

    fun saveVehicleChanges() {
        initialVehicleModel = vehicleModel
        initialVehicleYear = vehicleYear
        initialVehicleColor = vehicleColor
    }

    // License Modal Controls
    fun showLicenseModal() {
        isLicenseModalVisible = true
    }

    fun hideLicenseModal() {
        isLicenseModalVisible = false
    }

    fun updateLicenseImage(uri: String) {
        licenseImageUri = uri
    }

    fun onLicenseResetClick() {
        resetLicenseFields()
    }

    fun onLicenseSaveClick() {
        saveLicenseChanges()
        hideLicenseModal()
    }

    fun resetLicenseFields() {
        licenseImageUri = initialLicenseImageUri
    }

    fun saveLicenseChanges() {
        initialLicenseImageUri = licenseImageUri
    }

    // Car Photo Modal Controls
    fun showCarPhotoModal() {
        isCarPhotoModalVisible = true
    }

    fun hideCarPhotoModal() {
        isCarPhotoModalVisible = false
    }

    fun updateCarPhoto(uri: String) {
        carPhotoUri = uri
    }

    fun onCarPhotoResetClick() {
        resetCarPhotoFields()
    }

    fun onCarPhotoSaveClick() {
        saveCarPhotoChanges()
        hideCarPhotoModal()
    }

    fun resetCarPhotoFields() {
        carPhotoUri = initialCarPhotoUri
    }

    fun saveCarPhotoChanges() {
        initialCarPhotoUri = carPhotoUri
    }
}