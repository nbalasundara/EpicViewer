package com.protolys.epicviewer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.protolys.epicviewer.EpicNavHost
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class NavigationTest {
    @get:Rule
    val composeTestRule = createComposeRule()
    lateinit var navController: TestNavHostController

    @Before
    fun setupEpicNavHost() {
        composeTestRule.setContent {
            navController =
                TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(
                ComposeNavigator()
            )
            EpicNavHost(navController = navController)
        }
    }

    @Test
    fun EpicyNavHost_verifyOverviewStartDestination() {
        composeTestRule
            .onNodeWithContentDescription("Daily Images Home Screen")
            .assertIsDisplayed()
    }
}