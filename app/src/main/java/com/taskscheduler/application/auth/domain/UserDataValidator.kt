package com.taskscheduler.application.auth.domain

class UserDataValidator {
    companion object {
        const val MIN_FULL_NAME_LENGTH = 4
        const val MAX_FULL_NAME_LENGTH = 50
        const val MIN_PASSWORD_LENGTH = 9
    }
}