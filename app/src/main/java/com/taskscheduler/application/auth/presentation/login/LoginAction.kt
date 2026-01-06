package com.taskscheduler.application.auth.presentation.login

sealed interface LoginAction {
    data object OnLoginClick: LoginAction
    data object OnPasswordVisibilityClick: LoginAction
    data object OnSignUpClick: LoginAction
}