package com.taskscheduler.application.auth.presentation.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class LoginViewModel: ViewModel() {
    private val _state = MutableStateFlow(LoginState())
    val loginState = _state

    fun onAction(loginAction: LoginAction) {
        when(loginAction) {
            is LoginAction.OnLoginClick -> { TODO() }
            is LoginAction.OnPasswordVisibilityClick -> { TODO() }
            is LoginAction.OnSignUpClick -> { TODO() }
        }
    }
}