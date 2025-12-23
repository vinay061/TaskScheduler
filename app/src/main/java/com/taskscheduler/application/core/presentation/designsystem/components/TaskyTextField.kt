package com.taskscheduler.application.core.presentation.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.taskscheduler.application.core.presentation.designsystem.LocalCustomColors
import com.taskscheduler.application.core.presentation.designsystem.TaskSchedulerTheme
import com.taskscheduler.application.ui.theme.TaskyTypography

@Composable
fun TaskyTextField(
    state: TextFieldState,
    endIcon: ImageVector? = null,
    hint: String,
    keyboardType: KeyboardType = KeyboardType.Text,
) {
    val customColors = LocalCustomColors.current

    BasicTextField(
        state = state,
        textStyle = TaskyTypography.bodyMedium.copy(
            color = customColors.onSurface
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        lineLimits = TextFieldLineLimits.SingleLine,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(customColors.surfaceHigher)
            .padding(12.dp),
        decorator = { innerBox ->
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    if(state.text.isEmpty()) {
                        Text(
                            text = hint,
                            style = TaskyTypography.bodyMedium.copy(
                                color = customColors.onSurface
                            ),
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    innerBox()
                }
                if(endIcon != null) {
                    Icon(
                        imageVector = endIcon,
                        contentDescription = null,
                        tint = customColors.success,
                        modifier = Modifier
                            .padding(8.dp)
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun TaskyTextFieldPreview() {
    TaskSchedulerTheme {
        TaskyTextField(
            state = TextFieldState(),
            hint = "User Name",
            endIcon = Icons.Default.Check
        )
    }
}