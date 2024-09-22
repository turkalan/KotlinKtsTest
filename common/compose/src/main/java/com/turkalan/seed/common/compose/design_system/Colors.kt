package com.turkalan.seed.common.compose.design_system

import androidx.compose.ui.graphics.Color

val Transparent = Color(0x00000000)
val White = Color(0xFFFFFFFF)
val White40 = Color(0x66FFFFFF)
val Black = Color(0xFF000000)
val MidnightBlue = Color(0xFF223C77)
val OceanBlue = Color(0xFF5230E2)
val IndigoBlue = Color(0xFFA8B5F5)
val IndigoBlue50 = Color(0x80A8B5F5)
val LightBlue80 = Color(0xCCABB9FF)
val DarkPurple = Color(0xFF10123D)
val Purple = Color(0xFF665EFF)
val DarkGreen = Color(0xFF27B67C)
val Red = Color(0xFFE5235C)
val Yellow = Color(0xFFFFCA02)
val LightGray = Color(0xFFC2C6DD)

internal val DarkColorScheme = AppColorScheme(
    primary = DarkPurple,
    secondary = MidnightBlue,
    background = DarkPurple,
    onPrimary = White,
    onSecondary = IndigoBlue50,
    onBackground = White,
)

internal val LightColorScheme = AppColorScheme(
    primary = DarkPurple,
    secondary = MidnightBlue,
    background = DarkPurple,
    onPrimary = White,
    onSecondary = IndigoBlue50,
    onBackground = White,
)