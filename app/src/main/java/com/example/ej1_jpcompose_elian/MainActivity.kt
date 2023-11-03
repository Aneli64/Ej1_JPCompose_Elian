package com.example.ej1_jpcompose_elian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ej1_jpcompose_elian.ui.theme.Ej1_JPCompose_ElianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ej1_JPCompose_ElianTheme {
                //myBox()
                state()
            }
        }
    }
}

@Preview
@Composable
fun state() {

    //val counter = remember { mutableStateOf(0) }
    var counter by remember { mutableStateOf(0) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {//definimos lo que hace por dentro (llamamos a la funcion onClcik -> al pulsar)
            Text(text = "Pulsar") //Interior de boton
        }
        Text(text = "He sido pulsado $counter veces") //Accion al pulsar el boton

    }
}

//@Preview
@Composable
fun myBox() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.hsl(0.35F, 0.60F, 0.70F, 0.65F)),
        verticalAlignment = CenterVertically
    ) {
        Text(
            text = "Ejemplo1",
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .background(Color.Yellow)
                .align(CenterVertically)
                .padding(46.dp) //Hay que centrarlo bien
        )

        Text(
            text = "Ejemplo2",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .background(Color.Black)
                .padding(46.dp) //Hay que centrarlo bien
        )
        Text(
            text = "Ejemplo3",
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .background(Color.Cyan)
                .padding(46.dp) //Hay que centrarlo bien
        )
    }
}

