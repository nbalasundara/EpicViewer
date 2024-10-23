package com.protolys.epicviewer.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.Normal
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import com.protolys.epicviewer.R

//
// Fonts from: https://fonts.google.com/specimen/Space+Grotesk
object AppFont {
    val SpaceGroteskFamily = FontFamily(
        Font(R.font.spacegrotesk_bold, Bold),
        Font(R.font.spacegrotesk_light, Light),
        Font(R.font.spacegrotesk_medium, Medium),
        Font(R.font.spacegrotesk_regular, Normal),
        Font(R.font.spacegrotesk_semibold, SemiBold)
    )
    val InterFamily = FontFamily(
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
}

// Set of Material typography styles
private val defaultTypography = Typography()
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = AppFont.SpaceGroteskFamily),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = AppFont.SpaceGroteskFamily),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = AppFont.SpaceGroteskFamily),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = AppFont.SpaceGroteskFamily),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = AppFont.SpaceGroteskFamily),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = AppFont.SpaceGroteskFamily),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = AppFont.SpaceGroteskFamily),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = AppFont.SpaceGroteskFamily),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = AppFont.SpaceGroteskFamily),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = AppFont.SpaceGroteskFamily), // TODO: should this be Inter?
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = AppFont.InterFamily),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = AppFont.InterFamily),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = AppFont.InterFamily),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = AppFont.InterFamily),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = AppFont.InterFamily)
)
/*
val Typography = Typography(
    displayLarge = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    displayMedium = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    displaySmall = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    titleLarge = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    titleMedium = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    titleSmall = TextStyle( // H1
        fontFamily = SpaceGroteskFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 26.sp,
        //letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle( // body bold
        fontFamily = InterFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        //letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle( // body semibold
        fontFamily = InterFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        //letterSpacing = 0.sp
    ),
    bodySmall = TextStyle( // body regular
        fontFamily = InterFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        //letterSpacing = 0.sp
    ),
    labelLarge = TextStyle( // label
        fontFamily = InterFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        //letterSpacing = 0.sp
    ),
    labelMedium = TextStyle( // label
        fontFamily = InterFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        //letterSpacing = 0.sp
    ),
    labelSmall = TextStyle( // label
        fontFamily = InterFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        //letterSpacing = 0.sp
    ),
)*/