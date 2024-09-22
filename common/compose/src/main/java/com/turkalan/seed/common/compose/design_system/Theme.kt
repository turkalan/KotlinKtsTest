package com.turkalan.seed.common.compose.design_system

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun ApplicationTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (isDarkMode) {
        DarkColorScheme
    } else LightColorScheme
    val rippleIndication = rememberRipple()
    CompositionLocalProvider(
        LocalAppColorScheme provides colorScheme,
        LocalAppTypography provides typography,
        LocalAppShape provides shape,
        LocalAppSize provides size,
        LocalIndication provides rippleIndication,
        content = content,
    )
}

object AppTheme {
    val colorScheme: AppColorScheme
        @Composable get() = LocalAppColorScheme.current
    val typography: AppTypography
        @Composable get() = LocalAppTypography.current
    val shape: AppShape
        @Composable get() = LocalAppShape.current
    val size: AppSize
        @Composable get() = LocalAppSize.current
}