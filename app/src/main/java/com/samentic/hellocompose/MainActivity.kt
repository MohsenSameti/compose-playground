package com.samentic.hellocompose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable1()
        }
    }
}

val LocalColor = staticCompositionLocalOf { Color(0xFFffdbc4) }

@Composable
fun Composable1() {
    Column {

        val color = if (isSystemInDarkTheme()) {
            Color(0xFFa08d87)
        } else {
            Color(0xFFffdbc4)
        }

        Composable2()
        CompositionLocalProvider(LocalColor provides color) {
            Composable3()
        }
    }
}

@Composable
fun Composable2() {
    Composable4()
}

@Composable
fun Composable3() {
    Text(text = "Composable 3", modifier = Modifier.background(LocalColor.current))
    CompositionLocalProvider(LocalColor provides Color.Red) {
        Composable5()
    }
}

@Composable
fun Composable4() {
    Composable6()
}

@Composable
fun Composable5() {
    Composable7()
    Composable8()
}

@Composable
fun Composable6() {
    Text(text = "Composable 6")
}

@Composable
fun Composable7() {

}

@Composable
fun Composable8() {
    Text(text = "Composable 8", modifier = Modifier.background(LocalColor.current))
}

@Preview(showBackground = true, name = "light mode")
@Preview(showBackground = true, name = "dark mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun Composable1Preview() {
    Composable1()
}