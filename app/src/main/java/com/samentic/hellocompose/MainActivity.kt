@file:Suppress("AnimateAsStateLabel")

package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.samentic.hellocompose.ui.theme.HelloComposeTheme

enum class BoxColor {
    Red,
    Magenta
}

enum class BoxPosition {
    Start,
    End
}

@Suppress("AnimateAsStateLabel")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                MotionDemo()
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

@Composable
fun ColorChangeDemo() {
    var colorState by remember { mutableStateOf(BoxColor.Red) }

    val animatedColor: Color by animateColorAsState(
        targetValue = when (colorState) {
            BoxColor.Red -> Color.Magenta
            BoxColor.Magenta -> Color.Red
        },
        animationSpec = tween(4500)
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .size(200.dp)
                .background(animatedColor)
        )

        Button(
            onClick = {
                colorState = when (colorState) {
                    BoxColor.Red -> BoxColor.Magenta
                    BoxColor.Magenta -> BoxColor.Red
                }
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Change Color")
        }
    }
}

@Composable
fun MotionDemo() {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    var boxState by remember { mutableStateOf(BoxPosition.Start) }
    val boxSideLength = 70.dp

    val animatedOffset: Dp by animateDpAsState(
        targetValue = when (boxState) {
            BoxPosition.Start -> 0.dp
            BoxPosition.End -> screenWidth - boxSideLength
        },
        animationSpec = tween(500)
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .offset(x = animatedOffset, y = 20.dp)
                .size(boxSideLength)
                .background(Color.Red)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = {
                boxState = when (boxState) {
                    BoxPosition.End -> BoxPosition.Start
                    BoxPosition.Start -> BoxPosition.End
                }
            },
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Move Box")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MotionDemoPreview() {
    HelloComposeTheme {
        MotionDemo()
    }
}

@Preview(showBackground = true)
@Composable
fun RotateDemoPreview() {
    HelloComposeTheme {
        RotationDemo()
    }
}

@Preview(showBackground = true)
@Composable
fun ColorChangeDemoPreview() {
    HelloComposeTheme {
        ColorChangeDemo()
    }
}