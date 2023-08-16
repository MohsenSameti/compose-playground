package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.samentic.hellocompose.ui.theme.HelloComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column {
        SpanString()
        ParaString()
        BrushStyle()
    }
}

@Composable
fun SpanString() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            ) {
                append("T")
            }

            withStyle(style = SpanStyle(color = Color.Gray)) {
                append("his")
            }
            append(" is ")
            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    color = Color.Blue
                )
            ) {
                append("great!")
            }
        }
    )
}

@Composable
fun ParaString() {
    Text(
        buildAnnotatedString {
            append("\nThis is some text that doesn't have any style applied to it.\n")

            withStyle(
                style = ParagraphStyle(
                    lineHeight = 30.sp,
                    textIndent = TextIndent(
                        firstLine = 60.sp,
                        restLine = 25.sp
                    )
                )
            ) {
                append(
                    "This is some Text that is indented more on the first line than the" +
                            "rest of the lines. It also jas increased line Height.\n"
                )
            }

            withStyle(style = ParagraphStyle(textAlign = TextAlign.End)) {
                append("This is some text that is right aligned.")
            }
        }
    )
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun BrushStyle() {
    val colorList: List<Color> = listOf(
        Color.Red,
        Color.Blue,
        Color.Magenta,
        Color.Yellow,
        Color.Green,
        Color.Red
    )

    Text(
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 70.sp,
                    brush = Brush.linearGradient(colors = colorList)
                )
            ) {
                append("COMPOSE!")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    HelloComposeTheme {
        MainScreen()
    }
}