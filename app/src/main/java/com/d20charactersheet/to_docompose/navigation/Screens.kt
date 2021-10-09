package com.d20charactersheet.to_docompose.navigation

import androidx.navigation.NavController
import com.d20charactersheet.to_docompose.util.Action
import com.d20charactersheet.to_docompose.util.Constants.LIST_SCREEN
import com.d20charactersheet.to_docompose.util.Constants.SPLASH_SCREEN

class Screens(navController: NavController) {
    val splash: () -> Unit = {
        navController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
    val list: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
    val task: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

}