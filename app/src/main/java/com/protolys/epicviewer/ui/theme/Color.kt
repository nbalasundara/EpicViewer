package com.protolys.epicviewer.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color


val DarkBlue = Color(0x003C73FF)
val Blue = Color(0x0F5799FF)
val LightBlue = Color(0x64B4F1FF)
val Elevation1 = Color(0x090440FF)
val Background = Color(0x050326FF)
val BackgroundGradient = Color(0x144366FF) // TODO
val BackgroundText = Color(0x000000FF) // TODO
val Black = Color(0x121212FF)
val Gray5 = Color(0X1C1C1EFF)
val Gray4 = Color(0x2C2C2EFF)
val Gray3 = Color(0x6A7078FF)
val Gray2  = Color(0xB2B7BDFF)
val Gray1 = Color(0xE3E5E8FF)
val Red = Color(0xFF453AFF)
val Green = Color(0x008F56FF)

// Epic Viewer is always dark themed.
val ColorPalette = darkColorScheme( // TODO
    primary = Black,
    onPrimary = Color.White,
    primaryContainer = Black,
    surface = Black,
    onSurface = LightBlue,
    background = Black,
    onBackground = Gray1,
    error = Red
/*
primary:
onPrimary:
primaryContainer:
onPrimaryContainer:
inversePrimary:
secondary:
onSecondary:
secondaryContainer:
onSecondaryContainer:
tertiary:
onTertiary:
tertiaryContainer:
onTertiaryContainer:
background:
onBackground:
surface:
onSurface:
surfaceVariant:
onSurfaceVariant:
surfaceTint:
inverseSurface:
inverseOnSurface:
error:
onError:
errorContainer:
onErrorContainer:
outline:
outlineVariant:
scrim:
surfaceBright:
surfaceContainer:
surfaceContainerHigh:
surfaceContainerHighest:
surfaceContainerLow:
surfaceContainerLowest:
surfaceDim */
)
