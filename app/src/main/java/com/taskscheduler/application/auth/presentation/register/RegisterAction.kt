package com.taskscheduler.application.auth.presentation.register

sealed interface RegisterAction {
    data object OnRegisterCick: RegisterAction
    data object OnTogglePasswordVisibilityClick: RegisterAction

    data object OnLogInClick: RegisterAction
}