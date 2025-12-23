package com.taskscheduler.application.core.presentation.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.taskscheduler.application.core.presentation.designsystem.EyeIconClosed
import com.taskscheduler.application.core.presentation.designsystem.EyeIconOpen
import com.taskscheduler.application.core.presentation.designsystem.LocalCustomColors
import com.taskscheduler.application.core.presentation.designsystem.TaskSchedulerTheme
import com.taskscheduler.application.ui.theme.TaskyTypography

@Composable
fun TaskyPasswordTextField(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    isPasswordVisible: Boolean,
    onTogglePasswordVisibility: () -> Unit,
    hint: String,
) {
    val customColors = LocalCustomColors.current

    BasicSecureTextField(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .background(customColors.brandSecondary) // color to be changed after pulling the changes from develop branch. on surface variant from Colors.kt
            .padding(12.dp),
        state = state,
        textObfuscationMode = if(isPasswordVisible) {
            TextObfuscationMode.Visible
        } else TextObfuscationMode.Hidden,
        textStyle = TaskyTypography.bodyMedium,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        decorator = { innerBox ->
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    if (state.text.isEmpty()) {
                        Text(
                            text = hint
                        )
                    }
                    innerBox()
                }
                IconButton(
                    onClick = onTogglePasswordVisibility
                ) {
                    Icon(
                        imageVector = if(!isPasswordVisible) {
                            EyeIconClosed
                        } else EyeIconOpen,
                        contentDescription = null,
                        tint = customColors.brandSupplementary // color to be changed from colors.kt, on surface variant
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun TaskyPasswordTextFieldPreview() {
    TaskSchedulerTheme {
        TaskyPasswordTextField(
            state = TextFieldState(),
            hint = "Password",
            isPasswordVisible = false,
            onTogglePasswordVisibility = { /* no-op */ },
        )
    }
}