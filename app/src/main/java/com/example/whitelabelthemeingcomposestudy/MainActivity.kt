package com.example.whitelabelthemeingcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whitelabelthemeingcomposestudy.ui.theme.WhitelabelThemeingComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhitelabelThemeingComposeStudyTheme {
                SampleScreen()
            }
        }
    }
}

@Composable
fun SampleScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background)
    ) {
        Surface(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier.padding(10.dp).fillMaxWidth()
        ) {
            Text(
                text = "This is a sample text inside a surface",
                modifier = Modifier.padding(10.dp).align(CenterHorizontally)
            )
        }
        Button(onClick = { /*TODO*/ },
            Modifier.align(CenterHorizontally)
        ) {
            Text(text = "Click me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WhitelabelThemeingComposeStudyTheme {
        SampleScreen()
    }
}