package com.taskscheduler.application.auth.presentation.register

import androidx.compose.foundation.text.input.TextFieldState
import com.taskscheduler.application.auth.domain.PasswordValidationState

data class RegisterState(
    val userName: TextFieldState = TextFieldState(),
    val email: TextFieldState = TextFieldState(),
    val isValidEmail: Boolean = false,
    val password: TextFieldState = TextFieldState(),
    val isPasswordVisible: Boolean = false,
    val isValidPassword: PasswordValidationState = PasswordValidationState()
)
