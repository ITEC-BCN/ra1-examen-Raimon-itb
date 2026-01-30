package com.example.adivinaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.adivinaapp.Routes
import com.example.adivinaapp.view.Screen1
import com.example.adivinaapp.view.Screen2


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            val navigationController = rememberNavController()

            NavHost(
                navController = navigationController ,
                startDestination = Routes.Pantalla1 .route
            ) {
                composable(Routes.Pantalla1 .route) {
                    Screen1(navigationController)
                }
                composable(Routes.Pantalla2 .route) {
                    Screen2(navigationController)
                }
            }


            }


        }
    }



//private var preguntasPartida: List<Pregunta> = emptyList()