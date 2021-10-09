package com.d20charactersheet.to_docompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.d20charactersheet.to_docompose.navigation.destinations.listComposable
import com.d20charactersheet.to_docompose.navigation.destinations.splashComposable
import com.d20charactersheet.to_docompose.navigation.destinations.taskComposable
import com.d20charactersheet.to_docompose.ui.viewmodels.SharedViewModel
import com.d20charactersheet.to_docompose.util.Constants.SPLASH_SCREEN
import com.google.accompanist.navigation.animation.AnimatedNavHost

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = Screens(navController = navController)

    AnimatedNavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }
}