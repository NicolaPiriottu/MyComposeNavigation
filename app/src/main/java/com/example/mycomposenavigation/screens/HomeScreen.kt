package com.example.mycomposenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mycomposenavigation.navigation.AUTHENTICATION_ROUTE
import com.example.mycomposenavigation.navigation.Screen

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Detail.passNameAndId(id = 10, name = "niKO"))
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Login/ Sign Up",
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    //Go to auth screen
                    navController.navigate(AUTHENTICATION_ROUTE)

                },
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}