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
    background = DarkBackground,
    surface = DarkSurface,
    onSurface = DarkOnSurface,
    primary = DarkPrimary,
    outline = DarkOutline,
    error = DarkError,
    onBackground = DarkOnBackground,
    onPrimary = DarkOnSurface,
    surfaceTint = DarkOutline,
    surfaceContainerHigh = DarkSurfaceHigher,
    onSurfaceVariant = DarkOnSurfaceVariant,
    )

val LightColorScheme = lightColorScheme(
    background = LightBackground,
    surface = LightSurface,
    onSurface = LightOnSurface,
    primary = LightPrimary,
    outline = LightOutline,
    error = LightError,
    onBackground = LightOnBackground,
    onPrimary = LightOnSurface,
    surfaceTint = LightOutline,
    surfaceContainerHigh = LightSurfaceHigher,
    onSurfaceVariant = LightOnSurfaceVariant,
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