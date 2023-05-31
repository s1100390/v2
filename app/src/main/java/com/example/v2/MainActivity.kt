package com.example.v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.v2.ui.theme.V2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            V2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "作者：資管二B 江祐丞")

        Image(
            painterResource(id = R.drawable.map),
            contentDescription ="Cart button icon",)

    }
    Canvas(modifier = Modifier){
        drawRect(Color.Blue, Offset(670f, 170f), Size(30f,30f))
    }
    Canvas(modifier = Modifier){
        drawRect(Color.Blue, Offset(1490f, 880f), Size(30f,30f))
    }
}






//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
    //V2Theme {
        //Greeting("Android")
    //}
//}
