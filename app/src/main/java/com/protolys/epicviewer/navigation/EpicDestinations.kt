package com.protolys.epicviewer.navigation

import java.util.Date
import androidx.navigation.NavType
import androidx.navigation.navArgument

/**
 * Contract for information needed on every Epic navigation destination
 */
interface EpicDestination {
    val route: String
}

/**
 * Epic app navigation destinations
 */
object DailyImages : EpicDestination {
    override val route = "dayImages"
}

object DayImages : EpicDestination {
    override val route = "dayImages"
    val arguments = listOf(
        navArgument("date") { type = NavType.StringType }
    )
}

object DayImage : EpicDestination {
    override val route = "dayImage"
    val arguments = listOf(
        navArgument("date") { type = NavType.StringType }
    )
}

// Maybe this one is not a Navigation destination but a dialog // TODO
object DayImageDetail : EpicDestination {
    override val route = "dayImageDetail"
    val arguments = listOf(
        navArgument("date") { type = NavType.StringType }
    )
}

object DayImagesAnimation : EpicDestination {
    override val route = "dayImagesAnimation"
    val arguments = listOf(
        navArgument(name = "date") { type = NavType.StringType }
    )
}