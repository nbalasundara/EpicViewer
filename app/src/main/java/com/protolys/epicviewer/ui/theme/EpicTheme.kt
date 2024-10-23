package com.protolys.epicviewer.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun EPICViewerTheme(
    // EPIC viewer is dark themed
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = ColorPalette,
        typography = Typography,
        content = content
    )
}