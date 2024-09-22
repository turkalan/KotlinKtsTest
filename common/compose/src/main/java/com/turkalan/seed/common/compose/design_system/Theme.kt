package com.turkalan.seed.common.compose.design_system

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

@Composable
fun ApplicationTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (isDarkMode) {
        DarkColorScheme
    } else LightColorScheme
}