package com.example.imagen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imagen.ui.theme.ImagenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                ImagenTheme  {
                    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
                        App(modifier = Modifier.padding(padding))
                    }
                }
            }
        }
}

@Composable
fun App(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.w),
                contentDescription = "logo Aristidevs",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )
        }
        item {
            Text(
                text = "Jetpack Compose tutorial",
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 8.dp)
            )
        }
        item {
            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                color = Color.Black,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 4.dp)
            )
        }
        item {
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                color = Color.Black,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ImagenTheme {
        App()
    }
}
