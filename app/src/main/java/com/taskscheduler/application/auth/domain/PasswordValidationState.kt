package com.taskscheduler.application.auth.domain

data class PasswordValidationState(
    val hasLowerCaseCharacter: Boolean = false,
    val hasUpperCaseCharacter: Boolean = false,
    val hasOneDigit: Boolean = false,
    val hasMinLength: Boolean = false
) {
    val isValidPassword: Boolean
        get() = hasLowerCaseCharacter && hasUpperCaseCharacter && hasOneDigit && hasMinLength
}
