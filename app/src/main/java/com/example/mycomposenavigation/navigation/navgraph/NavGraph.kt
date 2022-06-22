package com.example.mycomposenavigation.navigation.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.mycomposenavigation.navigation.HOME_ROUTE
import com.example.mycomposenavigation.navigation.ROOT_ROUTE
import com.example.mycomposenavigation.navigation.Screen

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        //principal route
        route = ROOT_ROUTE
    ) {
        //Nested 1
        homeNavGraph(navController = navController)
        //Nested 2
        authNavGraph(navController = navController)
    }
}