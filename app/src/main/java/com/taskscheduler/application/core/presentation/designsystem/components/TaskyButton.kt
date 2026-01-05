package com.taskscheduler.application.core.presentation.designsystem.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.taskscheduler.application.core.presentation.designsystem.extended

@Composable
fun TaskyButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors().copy(
            containerColor = MaterialTheme.colorScheme.extended.surfaceButton
        ),
        shape = RoundedCornerShape(100f),
        modifier = modifier
    ) {
        Text(
            text = title
        )
    }
}

@Composable
fun TaskyTextButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
    ) {
        Text(
            text = title,
            color = MaterialTheme.colorScheme.extended.link
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun PreviewTaskyButton() {
    TaskyButton(
        title = "Get Started",
        onClick = {},
    )
}

@Preview
@Composable
private fun PreviewTaskyTextButton() {
    TaskyTextButton(
        title = "Sign Up",
        onClick = {}
    )
}