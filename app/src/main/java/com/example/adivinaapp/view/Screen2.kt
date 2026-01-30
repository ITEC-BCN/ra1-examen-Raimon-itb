package com.example.adivinaapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.adivinaapp.R
import com.example.adivinaapp.ui.theme.Green1
import com.example.adivinaapp.ui.theme.Grey1
import com.example.adivinaapp.ui.theme.Purple40
import java.lang.ref.Cleaner


val correctNumber = "8"
var msgUtilitzats = "Numeros utilitzats: "
@Composable
fun Screen2(navController: NavController ) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(75.dp))

            Text("?", fontSize = 50.sp, fontWeight = FontWeight.Bold)

            Spacer(Modifier.height(25.dp))

            LinearProgressIndicator(
                progress = { 1f },
                color = Color.Red,
                trackColor = Color.LightGray
            )

            Spacer(Modifier.height(25.dp))

            var myText by remember { mutableStateOf("") }
            TextField(
                value = myText,
                onValueChange = { myText = it },
                label = { Text(text = "Introdueix un numeror (1-10)") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )



            Spacer(Modifier.height(25.dp))


            Button(
                onClick = {
                    //InputNum(int = myText)
                },

                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.White
                )


            ) {
                Text(text = "Comprovar")
            }
            Spacer(Modifier.height(60.dp))
            Row(

            ) {
                Button(
                    onClick = {
                        myText = ""
                    },

                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(

                        contentColor = Color.White
                    )


                ) {
                    Text(text = "Tornar a jugar")
                }

                Spacer(Modifier.width(25.dp))

                Button(
                    onClick = {
                        navController.navigate("pantalla1")
                    },

                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(

                        contentColor = Color.White
                    )


                ) {
                    Text(text = "Menu Principal")
                }
            }

        }
    }
}
@Composable
fun InputNum(int: String){
    Text(text = "No s'ha introduit un numero correcte")
    if (int != correctNumber){
        Text(text = "Intent Fallit")
    }
    if(int == correctNumber){
        Text(text = "Enhorabona! Has encertat el numero ${correctNumber} ")
    }
    msgUtilitzats = msgUtilitzats + int + ", "
    Text(text = msgUtilitzats)

}
