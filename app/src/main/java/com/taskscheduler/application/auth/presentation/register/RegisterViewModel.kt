package com.taskscheduler.application.auth.presentation.register

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RegisterViewModel: ViewModel() {
      private val _state = MutableStateFlow(RegisterState())
      val state: StateFlow<RegisterState> = _state


    fun onAction(action: RegisterAction) {
        when(action) {
            is RegisterAction.OnRegisterCick -> { TODO() }
            is RegisterAction.OnTogglePasswordVisibilityClick -> {
                _state.value.copy(
                    isPasswordVisible = !_state.value.isPasswordVisible
                )
            }
            is RegisterAction.OnLogInClick -> { TODO() }
        }
    }
}