package com.taskscheduler.application.core.presentation.designsystem

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.taskscheduler.application.ui.theme.Typography

val DarkColorScheme = darkColorScheme(
    background = TaskyGray1000,
    surface = TaskyGray900,
    onSurface = TaskyGray200,
    primary = TaskyGray100,
    outline = TaskyGray600,
    error = TaskyRed400,
    onBackground = TaskyGray100,
    onPrimary = TaskyGray200,
    surfaceTint = TaskyGray600,
    surfaceContainerHigh = TaskyGray800,
    onSurfaceVariant = TaskyGray400,
    )
val LightColorScheme = lightColorScheme(
    background = TaskyGray1000,
    surface = TaskyGray100,
    onSurface = TaskyGray700,
    primary = TaskyGray1000,
    outline = TaskyGray300,
    error = TaskyRed600,
    onBackground = TaskyGray100,
    surfaceVariant = TaskyGray200,
    onPrimary = TaskyGray100,
    surfaceTint = TaskyGray300,
    surfaceContainerHigh = TaskyGray200,
    onSurfaceVariant = TaskyGray500,
)

@Composable
fun TaskSchedulerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme
    val view = LocalView.current
    if(!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}