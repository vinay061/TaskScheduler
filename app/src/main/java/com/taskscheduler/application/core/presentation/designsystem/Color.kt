package com.taskscheduler.application.core.presentation.designsystem

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// Light Mode
val LightBackground = Color(0xFF16161C)
val LightSurface = Color(0xFFFFFFFF)
val LightOnSurface = Color(0xFF3A4045)
val LightPrimary = Color(0xFF16161C)
val LightOutline = Color(0xFFB7C6DE)
val LightError = Color(0xFFF34B51)
val LightSuccess = Color(0xFF279F70)
val LightLink = Color(0xFF8E97FD)

val LightOnBackground = Color(0xFFFFFFFF)
val LightSurfaceHigher = Color(0xFFF2F3F7)
val LightOpacity60 = Color(0x99F2F3F7)  // 60%
val LightOnSurfaceVariant = Color(0xFF76808F)
val LightOnSurfaceVariant70 = Color(0xB376808F)  // 70%
val LightBackgroundOpacity50 = Color(0x8016161C) // 50%


// Dark Mode
val DarkBackground = Color(0xFF16161C)
val DarkSurface = Color(0xFF1B1B20)
val DarkOnSurface = Color(0xFFF2F3F7)
val DarkPrimary = Color(0xFFFFFFFF)
val DarkOutline = Color(0xFF3B3B42)
val DarkError = Color(0xFFF88084)
val DarkSuccess = Color(0xFF3BD699)
val DarkLink = Color(0xFFB1B8FE)

val DarkOnBackground = Color(0xFFFFFFFF)
val DarkSurfaceHigher = Color(0xFF242428)
val DarkOpacity60 = Color(0x99242428) // 60%
val DarkOnSurfaceVariant = Color(0xFF808B9B)
val DarkOnSurfaceVariant70 = Color(0xB3808B9B) // 70%
val DarkBackgroundOpacity50 = Color(0x8016161C) // 50%

// Brand colors

val BrandSecondary = Color(0xFF279F70)
val BrandTertiary = Color(0xFFCAEF45)
val BrandSupplementary = Color(0xFFFDEF8A)

val BrandSecondary80 = Color(0xCC279F70) // 80%
val BrandTertiary80 = Color(0xCCCCEF45) // 80%

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
    success = DarkSuccess,
    link = DarkLink,
    surfaceHigherWithOpacity = DarkOpacity60,
    surfaceVariantWithOpacity = DarkOnSurfaceVariant70,
    backgroundWithOpacity = DarkBackgroundOpacity50,
    brandSecondary = BrandSecondary,
    brandTertiary = BrandTertiary,
    brandSupplementary = BrandSupplementary,
    brandSecondaryWithOpacity = BrandSecondary80,
    brandTertiaryWithOpacity = BrandTertiary80,
)

val LightCustomColor = CustomColors(
    success = LightSuccess,
    link = LightLink,
    surfaceHigherWithOpacity = LightOpacity60,
    surfaceVariantWithOpacity = LightOnSurfaceVariant70,
    backgroundWithOpacity = LightBackgroundOpacity50,
    brandSecondary = BrandSecondary,
    brandTertiary = BrandTertiary,
    brandSupplementary = BrandSupplementary,
    brandSecondaryWithOpacity = BrandSecondary80,
    brandTertiaryWithOpacity = BrandTertiary80,
)

val LocalCustomColors = staticCompositionLocalOf { DarkCustomColor }