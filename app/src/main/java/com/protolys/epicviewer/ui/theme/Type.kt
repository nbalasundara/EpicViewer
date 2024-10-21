package com.protolys.epicviewer.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.Normal
import androidx.compose.ui.text.font.FontWeight.Companion.Light

import androidx.compose.ui.unit.sp
import com.protolys.epicviewer.R

//
// Fonts from: https://fonts.google.com/specimen/Space+Grotesk
val spaceGroteskFamily = FontFamily(
    Font(R.font.spacegrotesk_bold, Bold),
    Font(R.font.spacegrotesk_light, Light),
    Font(R.font.spacegrotesk_medium, Medium),
    Font(R.font.spacegrotesk_regular, Normal),
    Font(R.font.spacegrotesk_semibold, SemiBold)
)

val interFamily = FontFamily(
    Font(R.font.inter_18pt_bold, Bold),
    Font(R.font.inter_18pt_regular, Normal),
    Font(R.font.inter_18pt_semibold, SemiBold),
    Font(R.font.inter_24pt_bold, Bold),
    Font(R.font.inter_24pt_regular, Normal),
    Font(R.font.inter_24pt_semibold, SemiBold),
    Font(R.font.inter_28pt_bold, Bold),
    Font(R.font.inter_28pt_regular, Normal),
    Font(R.font.inter_28pt_semibold, SemiBold)
)


// Set of Material typography styles
val Typography = Typography(
    titleLarge = TextStyle( // H1
        fontFamily = spaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle( // H2
        fontFamily = spaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle( // H3
        fontFamily = spaceGroteskFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 21.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle( // body bold
        fontFamily = interFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle( // body semibold
        fontFamily = interFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    bodySmall = TextStyle( // body regular
        fontFamily = interFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle( // label
        fontFamily = interFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
)