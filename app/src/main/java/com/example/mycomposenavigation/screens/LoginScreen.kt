package com.example.mycomposenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mycomposenavigation.navigation.HOME_ROUTE
import com.example.mycomposenavigation.navigation.Screen

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.SignUp.route)
            },
            text = "Login",
            color = Color.Magenta,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Go Back",
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    /*navController.navigate(HOME_ROUTE) {
                        popUpTo(HOME_ROUTE)
                    }*/
                    navController.popBackStack()
                    navController.navigate(Screen.Detail.passNameAndId())
                },
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun LoginPreview() {
    LoginScreen(navController = rememberNavController())
}