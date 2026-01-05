package com.taskscheduler.application.auth.presentation.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import org.koin.androidx.compose.koinViewModel

@Composable
fun RegisterScreenRoute(
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
    Scaffold(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.extended.backGroundScreen)
    ) { innerPadding ->
        Content(
            state = state,
            onAction = onAction,
            contentPadding = innerPadding
        )
    }
}

@Composable
private fun Content(
    state: RegisterState,
    onAction: (RegisterAction) -> Unit,
    contentPadding: PaddingValues
) {
    Column(
        modifier = Modifier
            .padding(contentPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.register_screen_title),
            color = Color.White,
            style = TaskyTypography.headlineLarge,
            modifier = Modifier
                .padding(top = 70.dp, bottom = 35.dp)
        )
        Card(
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.extended.surfaceCard
            ),
            modifier = Modifier
                .fillMaxHeight(),
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.White),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TaskyTextField(
                    state = state.userName,
                    hint = stringResource(R.string.register_screen_username),
                    endIcon = Icons.Default.Check
                )
                TaskyTextField(
                    state = state.email,
                    hint = stringResource(R.string.register_screen_email),
                    endIcon = null
                )
                TaskyPasswordTextField(
                    state = state.password,
                    isPasswordVisible = state.isPasswordVisible,
                    hint = stringResource(R.string.register_screen_password),
                    onTogglePasswordVisibility = { onAction.invoke(
                        RegisterAction.OnTogglePasswordVisibilityClick
                    ) }
                )
                TaskyButton(
                    title = stringResource(R.string.register_screen_button_get_started),
                    onClick = { onAction.invoke(
                        RegisterAction.OnRegisterCick
                    )},
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.register_screen_login_text),
                        style = TaskyTypography.labelSmall
                    )
                    TaskyTextButton(
                        title = stringResource(R.string.registe_screen_login_text_button),
                        onClick = { onAction.invoke(
                            RegisterAction.OnLogInClick
                        )}
                    )
                }
            }
        }
    }
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