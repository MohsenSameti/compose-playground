package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 70.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(4.dp)
            .size(100.dp, 100.dp)
            .border(width = 4.dp, color = Color.Red)
            .then(modifier)
    )
}

@Composable
fun MainScreen() {
    Column(modifier = Modifier.size(width = 600.dp, height = 600.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(4.dp)
                .border(width = 2.dp, Color.Blue)
                .weight(2f)
                .fillMaxWidth()
        ) {
            TextCell("1")
            TextCell("2")
            TextCell("3")
        }

        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .padding(4.dp)
                .border(width = 2.dp, Color.Green)
                .weight(6f)
                .fillMaxWidth()
        ) {
            TextCell("4")
            TextCell("5")
            TextCell("6")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}