package com.turkalan.seed.common.compose.design_system

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val typography = AppTypography(
    titleLarge = TextStyle(
        fontFamily = Barlow,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
    ),
    titleNormal = TextStyle(
        fontFamily = Barlow,
        fontSize = 20.sp,
    ),
    body =  TextStyle(
        fontFamily = Barlow,
        fontSize = 12.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = Barlow,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
    ),
    labelNormal = TextStyle(
        fontFamily = Barlow,
        fontSize = 14.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = Barlow,
        fontSize = 12.sp,
    ),
)