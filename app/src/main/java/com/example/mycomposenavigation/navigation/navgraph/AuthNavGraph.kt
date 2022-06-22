package com.example.mycomposenavigation.navigation.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.mycomposenavigation.navigation.AUTHENTICATION_ROUTE
import com.example.mycomposenavigation.navigation.Screen
import com.example.mycomposenavigation.screens.LoginScreen
import com.example.mycomposenavigation.screens.SignUpScreen

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    //Nested 2
    navigation(
        startDestination = Screen.Login.route,
        //Nested name
        route = AUTHENTICATION_ROUTE
    ) {

        //First destination
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }

        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}