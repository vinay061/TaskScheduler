package com.taskscheduler.application.auth.presentation.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.taskscheduler.application.R
import com.taskscheduler.application.core.presentation.designsystem.TaskSchedulerTheme
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyButton
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyPasswordTextField
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyTextButton
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyTextField
import org.koin.compose.viewmodel.koinViewModel

@Composable
private fun LoginScreenRoute(
    viewModel: LoginViewModel = koinViewModel()
) {
    val state by viewModel.loginState.collectAsStateWithLifecycle()

    LoginScreen(
        state = state,
        onAction = viewModel::onAction
    )
}
@Composable
fun LoginScreen(
    state: LoginState,
    onAction: (LoginAction) -> Unit
) {
    Scaffold { innerPadding ->
        Content(
            state = state,
            onAction = onAction,
            contentPadding = innerPadding
        )
    }
}

@Composable
private fun Content(
    state: LoginState,
    onAction: (LoginAction) -> Unit,
    contentPadding: PaddingValues,
) {
    Column {
        Text(
            text = stringResource(R.string.login_screen_title)
        )
        Card {
            Column {
                TaskyTextField(
                    state = state.userName,
                    hint = stringResource(R.string.login_screen_username_hint)
                )
                TaskyPasswordTextField(
                    state = state.password,
                    hint = stringResource(R.string.login_screen_password_hint),
                    isPasswordVisible = state.isPasswordVisible,
                    onTogglePasswordVisibility = { onAction(LoginAction.OnPasswordVisibilityClick) }
                )
                TaskyButton(
                    title = stringResource(R.string.login_screen_button_title),
                    onClick = { onAction(LoginAction.OnLoginClick) }
                )
                Row {
                    Text(
                        text = stringResource(R.string.login_screen_signup_text)
                    )
                    TaskyTextButton(
                        title = stringResource(R.string.login_screen_signup_textButton),
                        onClick = { onAction(LoginAction.OnSignUpClick) }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewLoginScreen() {
    TaskSchedulerTheme {
        LoginScreen(
            state = LoginState(),
            onAction = {}
        )
    }
}