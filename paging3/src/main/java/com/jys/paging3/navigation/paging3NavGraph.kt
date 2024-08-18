package com.jys.paging3.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

fun NavGraphBuilder.paging3NavGraph(navController: NavHostController) {
    navigation(
        startDestination = "paging3_screen",
        route = "paging3"
    ) {
        composable("paging3_screen") {

        }
    }
}