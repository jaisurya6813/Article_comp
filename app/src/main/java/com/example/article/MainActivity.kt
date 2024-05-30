package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                ArtImage()
                //Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun All_text(modifier: Modifier=Modifier)
{
    val Justify : TextAlign
    Text(
        text = stringResource(R.string.h1),
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
    Text(
        text = stringResource(R.string.text_1),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify)
    Text(
        text =stringResource(R.string.text_2),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify)
}

@Composable
fun ArtImage(modifier: Modifier=Modifier)
{
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription = null)
        All_text()

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        ArtImage()
    }
}