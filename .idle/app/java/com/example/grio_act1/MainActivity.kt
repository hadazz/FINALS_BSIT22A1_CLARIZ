package com.example.grio_act1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.grio_act1.ui.theme.Griño_Act1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Griño_Act1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Image(painter = painterResource(id =
        R.drawable.bg_mountain),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(),
        )
        Text(
                text = "Scenery",
        modifier = Modifier
            .padding(start = 10.dp, end = 5.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),
        fontSize = 20.sp
        )
        Text(
            text = "If you go to a place with mountains, and beautiful trees, and gorgeous skies, then it's got great scenery. Scenery is the stuff you can look at outside. If a place is plain, ugly, or desolate, you might say, \"Not much scenery.\" Also, painters and set designers create scenery for plays. In theater, scenery could represent anything: buildings, trees, or the inside of a house. If a play has a lot of different settings, then it needs a lot of scenery.",
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 25.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Griño_Act1Theme {
        Greeting()
    }
}