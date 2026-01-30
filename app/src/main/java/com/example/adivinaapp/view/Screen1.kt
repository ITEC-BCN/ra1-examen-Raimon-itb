package com.example.adivinaapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.adivinaapp.R
import com.example.adivinaapp.ui.theme.Purple40

@Composable
fun Screen1( navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Adivina el número by Raimon", fontSize = 25.sp, fontWeight = FontWeight.Bold)

            Spacer(Modifier.height(25.dp))

            Image(
                painter = painterResource (id = R.drawable .ic_game),
                contentDescription = "Example" ,
                alpha = 0.5f
            )

            Spacer(Modifier.height(25.dp))

            Button(
                onClick = {
                    navController .navigate( "pantalla2" )
                },

                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.White
                )


            ) {
                Text(text = "Iniciar partida")
            }
        }
    }
}