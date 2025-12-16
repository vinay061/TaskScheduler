package com.taskscheduler.application.auth.presentation.register

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {
    private val _state = mutableStateOf(RegisterState())
    val state: RegisterState
        get() = _state.value


    fun onAction(action: RegisterAction) {
        when(action) {
            is RegisterAction.OnRegisterCick -> { TODO() }
            is RegisterAction.OnTogglePasswordVisibilityClick -> { TODO() }
            is RegisterAction.OnLogInClick -> { TODO() }
        }
    }
}