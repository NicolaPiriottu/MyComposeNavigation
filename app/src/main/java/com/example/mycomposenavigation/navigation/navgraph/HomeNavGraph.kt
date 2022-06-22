package com.example.mycomposenavigation.navigation.navgraph

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.mycomposenavigation.navigation.DETAIL_ARGUMENT_KEY
import com.example.mycomposenavigation.navigation.DETAIL_ARGUMENT_KEY2
import com.example.mycomposenavigation.navigation.HOME_ROUTE
import com.example.mycomposenavigation.navigation.Screen
import com.example.mycomposenavigation.screens.DetailScreen
import com.example.mycomposenavigation.screens.HomeScreen

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {

    navigation(startDestination = Screen.Home.route, route = HOME_ROUTE) {
        //First destination
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        //Second destination
        composable(
            route = Screen.Detail.route,
            arguments = listOf(

                //Argument list required
                /*navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                },

                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }*/

                //Optional args
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },

                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }

            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController = navController)
        }
    }
}
