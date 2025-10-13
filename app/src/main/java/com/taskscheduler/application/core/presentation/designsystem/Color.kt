package com.taskscheduler.application.core.presentation.designsystem

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

//Gray scale colors
val TaskyGray1000 = Color(0xFF16161C)
val TaskyGray900 = Color(0xFF1B1B20)
val TaskyGray800 = Color(0xFF242428)
val TaskyGray700 = Color(0xFF3A4045)
val TaskyGray600 = Color(0xFF3B3B42)
val TaskyGray500 = Color(0xFF76808F)
val TaskyGray400 = Color(0xFF808B9B)
val TaskyGray300 = Color(0xFFB7C6DE)
val TaskyGray200 = Color(0xFFF2F3F7)
val TaskyGray100 = Color(0xFFFFFFFF)

// Semantic colors
val TaskyRed600 = Color(0xFFF34B51)
val TaskyRed400 = Color(0xFFF88084)
val TaskyGreen600 = Color(0xFF279F70)
val TaskyGreen500 = Color(0xFF3BD699)
val TaskyPurple500 = Color(0xFF8E97FD)
val TaskyPurple300 = Color(0xFFB1B8FE)

//Opacity variants
val TaskyGray2000Opacity60 = Color(0x99F2F3F7)
val TaskyGray5000Opacity70 = Color(0xB376808F)
val TaskyGray10000Opacity50 = Color(0x8016161C)
val TaskyGray400Opacity70 = Color(0xB3808B9B)
val TaskyGray8000Opacity60 = Color(0x99242428)

// Brand colors
val TaskyBrandGreen = Color(0xFF279F70)
val TaskyBrandLime = Color(0xFFCAEF45)
val TaskyBrandYellow = Color(0xFFFDEF8A)
val TaskyBrandGreenOpacity80 = Color(0xCC279F70)
val TaskyBrandLimeOpacity80 = Color(0xCCCCEF45)





data class CustomColors(
    val success: Color,
    val link: Color,
    val surfaceHigherWithOpacity: Color,
    val surfaceVariantWithOpacity: Color,
    val backgroundWithOpacity: Color,
    val brandSecondary: Color,
    val brandTertiary: Color,
    val brandSupplementary: Color,
    val brandSecondaryWithOpacity: Color,
    val brandTertiaryWithOpacity: Color,
)

val DarkCustomColor = CustomColors(
    success = TaskyGreen500,
    link = TaskyPurple300,
    surfaceHigherWithOpacity = TaskyGray8000Opacity60,
    surfaceVariantWithOpacity = TaskyGray400Opacity70,
    backgroundWithOpacity = TaskyGray10000Opacity50,
    brandSecondary = TaskyBrandGreen,
    brandTertiary = TaskyBrandLime,
    brandSupplementary = TaskyBrandYellow,
    brandSecondaryWithOpacity = TaskyBrandGreenOpacity80,
    brandTertiaryWithOpacity = TaskyBrandLimeOpacity80,
)

val LightCustomColor = CustomColors(
    success = TaskyGreen600,
    link = TaskyPurple500,
    surfaceHigherWithOpacity = TaskyGray2000Opacity60,
    surfaceVariantWithOpacity = TaskyGray5000Opacity70,
    backgroundWithOpacity = TaskyGray10000Opacity50,
    brandSecondary = TaskyBrandGreen,
    brandTertiary = TaskyBrandLime,
    brandSupplementary = TaskyBrandYellow,
    brandSecondaryWithOpacity = TaskyBrandGreenOpacity80,
    brandTertiaryWithOpacity = TaskyBrandLimeOpacity80,
)
val LocalCustomColors = staticCompositionLocalOf { DarkCustomColor }