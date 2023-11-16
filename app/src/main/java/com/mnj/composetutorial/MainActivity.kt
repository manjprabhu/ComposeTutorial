package com.mnj.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mnj.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hello welcome to Compose")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_dummy),
            contentDescription = "welcome",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(
                    1.dp, MaterialTheme.colorScheme.primary,
                    CircleShape
                )
        )

        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = "Hello $name!", color= MaterialTheme.colorScheme.primary)
            Text(text = "This is Compose tutorial!!", color = MaterialTheme.colorScheme.secondary)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        Greeting("")
    }
}