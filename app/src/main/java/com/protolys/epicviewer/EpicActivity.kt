package com.protolys.epicviewer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.protolys.epicviewer.navigation.DailyImagesHome
import com.protolys.epicviewer.navigation.DayImages
import com.protolys.epicviewer.ui.theme.ColorPalette
import com.protolys.epicviewer.ui.theme.EPICViewerTheme

class EpicActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EPICViewerTheme {
                val navController = rememberNavController()
                val currentBackStack by navController.currentBackStackEntryAsState()
                // Fetch your currentDestination:
                val currentDestination = currentBackStack?.destination
                // Change the variable to this and use Overview as a backup screen if this returns null
                val currentScreen = DailyImagesHome
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = ColorPalette.primaryContainer) { innerPadding ->
                    EpicNavHost(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

