package com.taskscheduler.application.auth.presentation.register

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.taskscheduler.application.core.presentation.designsystem.TaskSchedulerTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun RegisterScreenRoute(
    onRegisterClick: () -> Unit,
    viewModel: RegisterViewModel = koinViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    RegisterScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
private fun RegisterScreen(
    state: RegisterState,
    onAction: (RegisterAction) -> Unit,
) {
        // TODO()
}

@Preview
@Composable
private fun RegisterScreenPreview() {
    TaskSchedulerTheme {
        RegisterScreen(
            state = RegisterState(),
            onAction = {}
        )
    }
}