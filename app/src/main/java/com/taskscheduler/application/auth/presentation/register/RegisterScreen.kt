package com.taskscheduler.application.auth.presentation.register

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.taskscheduler.application.core.presentation.designsystem.TaskSchedulerTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun RegisterScreenRoute(
    onRegisterClick: () -> Unit,
    viewModel: RegisterViewModel = koinViewModel()
) {
    val state = viewModel.state
    RegisterScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
fun RegisterScreen(
    state: RegisterState,
    onAction: (RegisterAction) -> Unit,
) {
        // TODO()
}

@Preview
@Composable
fun RegisterRoutePreview() {
    TaskSchedulerTheme {
        RegisterScreen(
            state = RegisterState(),
            onAction = {}
        )
    }
}