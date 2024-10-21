package com.protolys.epicviewer

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.protolys.epicviewer.navigation.DailyImages
import com.protolys.epicviewer.navigation.DayImageDetail
import com.protolys.epicviewer.navigation.DayImages
import com.protolys.epicviewer.navigation.DayImagesAnimation
import com.protolys.epicviewer.ui.DailyImagesScreen
import com.protolys.epicviewer.ui.DayImageDetailScreen
import com.protolys.epicviewer.ui.DayImagesAnimationScreen
import com.protolys.epicviewer.ui.DayImagesScreen

@Composable
fun EpicNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DailyImages.route,
        modifier = modifier
    ) {
        composable(route = DailyImages.route) {
            DailyImagesScreen(
            )
        }
        composable(route = DayImages.route) {
            DayImagesScreen(
            )
        }
        composable(route = DayImageDetail.route) {
            DayImageDetailScreen(
            )
        }
        composable(route = DayImagesAnimation.route) {
            DayImagesAnimationScreen(
            )
        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }
