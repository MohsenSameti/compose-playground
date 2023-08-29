package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlin.random.Random


@Suppress("AnimateAsStateLabel")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var temperature by remember { mutableStateOf(80) }

            LaunchedEffect(Unit) {
                while (isActive) {
                    temperature = Random(System.currentTimeMillis()).nextInt(0, 100)
                    delay(2000)
                }
            }

            val animatedColor: Color by animateColorAsState(
                targetValue = if (temperature < 20) Color.Black
                else if (temperature < 40) Color.Cyan
                else if (temperature < 60) Color.Yellow
                else if (temperature < 80) Color(255, 127, 39)
                else Color.Red,
                animationSpec = tween(durationMillis = 600)
            )

            Box(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.Center)
                        .background(animatedColor)
//                        .background(
//                            if (temperature < 20) Color.Black
//                            else if (temperature < 40) Color.Cyan
//                            else if (temperature < 60) Color.Yellow
//                            else if (temperature < 80) Color(255, 127, 39)
//                            else Color.Red
//                        )
                )
            }

        }
    }
}