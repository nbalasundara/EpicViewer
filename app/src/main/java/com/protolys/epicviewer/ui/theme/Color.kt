package com.protolys.epicviewer.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color


val Green500 = Color(0xFF1EB980)
val DarkBlue900 = Color(0xFF26282F)

// Epic Viewer is always dark themed.
val ColorPalette = darkColorScheme(
    primary = Green500,
    surface = DarkBlue900,
    onSurface = Color.White,
    background = DarkBlue900,
    onBackground = Color.White
)
