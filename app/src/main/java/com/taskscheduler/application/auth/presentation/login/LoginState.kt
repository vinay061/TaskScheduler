package com.taskscheduler.application.auth.presentation.login

import androidx.compose.foundation.text.input.TextFieldState

data class LoginState(
    val userName: TextFieldState = TextFieldState(),
    val password: TextFieldState = TextFieldState(),
    val isPasswordVisible: Boolean = false,
)
