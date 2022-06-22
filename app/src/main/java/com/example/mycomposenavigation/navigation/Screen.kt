package com.example.mycomposenavigation.navigation

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

const val DETAIL_SCREEN = "detail_screen"

sealed class Screen(val route: String) {

    //Home destination
    object Home : Screen(route = "home_screen")

    //Detail destination
    //object Detail : Screen(route = "home_screen")

    //Detail destination with require args
    /*object Detail : Screen(route = "$DETAIL_SCREEN/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
        //Single arg
        *//*fun passId(id: Int): String {
            return "$DETAIL_SCREEN/$id"
        }*//*
        //Multiple args
        fun passNameAndId(id: Int, name: String): String {
            return "$DETAIL_SCREEN/$id/$name"
        }
    }*/

    //Detail destination with optional args
    object Detail : Screen(route = "$DETAIL_SCREEN?id={id}&name={name}") {
        //Single arg
        /* fun passId(id: Int): String {
             return "$DETAIL_SCREEN/$id"
         }*/
        //Multiple args
        fun passNameAndId(id: Int = 0, name: String = "niKO"): String {
            return "$DETAIL_SCREEN?id=$id&name=$name"
        }
    }


    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "sign_up_screen")
}
