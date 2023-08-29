@file:Suppress("AnimateAsStateLabel")

package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samentic.hellocompose.ui.theme.HelloComposeTheme


@Suppress("AnimateAsStateLabel")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                RotationDemo()
            }
        }
    }
}

@Composable
fun RotationDemo() {
    var rotated by remember { mutableStateOf(false) }

    val angle by animateFloatAsState(
        targetValue = if (rotated) 360f else 0f,
        animationSpec = tween(2500, easing = LinearEasing)
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_wifi_protect),
            contentDescription = "protect wifi",
            modifier = Modifier
                .rotate(angle)
                .padding(10.dp)
                .size(300.dp)
        )

        Button(
            onClick = { rotated = !rotated },
            modifier = Modifier.padding(10.dp)
        ) {
            Text("Rotate Protect wifi")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RotateDemoPreview() {
    HelloComposeTheme {
        RotationDemo()
    }
}