package com.protolys.epicviewer.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext



@Composable
fun EPICViewerTheme(
    // EPIC viewer is dark themed
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}