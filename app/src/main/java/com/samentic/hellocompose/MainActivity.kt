package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun ColorBox(modifier: Modifier) {
    Box(modifier = Modifier
        .padding(1.dp)
        .size(width = 50.dp, height = 10.dp)
        .then(modifier))
}

@Composable
fun MainScreen() {
    Box(modifier = Modifier.size(120.dp, 80.dp)) {
        ColorBox(modifier = Modifier.background(Color.Blue))
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}