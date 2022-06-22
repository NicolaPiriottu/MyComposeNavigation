package com.example.mycomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mycomposenavigation.navigation.navgraph.SetupNavGraph
import com.example.mycomposenavigation.ui.theme.MyComposeNavigationTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeNavigationTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}
