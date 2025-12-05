package com.example.jetpackcomposearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposearticle.ui.theme.JetpackComposeArticleTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArticleScreen()
                }
            }
        }
    }
}

@Composable
fun Screen(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            Modifier.fillMaxWidth()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Header(
                modifier = Modifier.fillMaxWidth()
            )
            Heading(
                text = "Jetpack Compose tutorial",
            )
            Body_1(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs"

            )
            Body_1(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."

            )
        }
    }
}
@Composable
fun Header(modifier: Modifier = Modifier){

    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier.height(200.dp)
            .fillMaxWidth()
    )

}

@Composable
fun Heading(text: String,modifier: Modifier = Modifier){
    Text(
        text = text,
        fontSize = 24.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(all = 16.dp).fillMaxWidth()
    )
}
@Composable
fun Body_1(text: String,modifier: Modifier = Modifier){
    Text(
        text = text,
        color = Color.White,
        lineHeight = 24.sp,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp).fillMaxWidth(),
        textAlign = TextAlign.Justify
    )
}
@Preview(showBackground = true)
@Composable
fun ArticleScreen(){
    JetpackComposeArticleTheme() {
        Screen()
    }
}