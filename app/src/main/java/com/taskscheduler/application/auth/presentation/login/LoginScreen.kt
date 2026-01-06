package com.taskscheduler.application.auth.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.taskscheduler.application.R
import com.taskscheduler.application.core.presentation.designsystem.TaskSchedulerTheme
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyButton
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyPasswordTextField
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyTextButton
import com.taskscheduler.application.core.presentation.designsystem.components.TaskyTextField
import com.taskscheduler.application.core.presentation.designsystem.extended
import com.taskscheduler.application.ui.theme.TaskyTypography
import com.taskscheduler.application.ui.theme.Typography
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
    Column(
        modifier = Modifier
            .padding(contentPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.login_screen_title),
            style = Typography.headlineLarge,
            modifier = Modifier
                .padding(top = 70.dp, bottom = 35.dp)
        )
        Card(
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp,
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.extended.surfaceCard
            ),
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.login_screen_signup_text),
                        style = TaskyTypography.labelSmall
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