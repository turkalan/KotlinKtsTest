package com.turkalan.seed.common.compose.design_system

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimens(
    val zero: Dp,
    val ultraSmallest: Dp,
    val ultraSmall: Dp,
    val smallest: Dp,
    val small: Dp,
    val half: Dp,
    val mediumSmallest: Dp,
    val medium: Dp,
    val default: Dp,
    val big: Dp,
    val veryBig: Dp,
    val double: Dp,
    val doubleBig: Dp,
    val extra: Dp,
    val huge: Dp,
    val veryHuge: Dp,
)

val compatDimensions = Dimens(
    zero = 0.dp,
    ultraSmallest = 1.dp,
    ultraSmall = 2.dp,
    smallest = 4.dp,
    small = 6.dp,
    half = 10.dp,
    mediumSmallest = 12.dp,
    medium = 16.dp,
    default = 20.dp,
    big = 24.dp,
    veryBig = 30.dp,
    double = 40.dp,
    doubleBig = 48.dp,
    extra = 60.dp,
    huge = 90.dp,
    veryHuge = 120.dp,
)

val LocalDimens = compositionLocalOf { compatDimensions }