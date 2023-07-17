package com.samentic.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.samentic.hellocompose.ui.theme.HelloComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                MyApp(Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
) {
    var shouldShowOnBoarding by rememberSaveable { mutableStateOf(true) }

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {

        if (shouldShowOnBoarding) {
            OnBoardingScreen(onContinueClicked = { shouldShowOnBoarding = false })
        } else {
            Greetings()
        }

    }
}

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    names: List<String> = List(1000) { "$it" }
) {

    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
        items(names) { name ->
            Greeting(name = name)
        }
    }
}

@Composable
fun Greeting(name: String) {
    var isExpanded by remember { mutableStateOf(false) }
    val extraPadding = if (isExpanded) 48.dp else 0.dp

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clip(RoundedCornerShape(12.dp))
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(bottom = extraPadding)
            ) {
                Text(text = "Hello, ", modifier = Modifier.fillMaxWidth())
                Text(text = "$name!", modifier = Modifier.fillMaxWidth())
            }
            ElevatedButton(onClick = { isExpanded = !isExpanded }) {
                Text(text = if (isExpanded) "Show less" else "ShowMore")
            }
        }
    }
}

@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    onContinueClicked: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to basics Codelab!")
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
            onClick = onContinueClicked
        ) {
            Text(text = "Continue!")
        }
    }
}

// Why the fuck colors are different with runtime?
//@Preview(widthDp = 320)
//@Preview(
//    name = "DarkPreview",
//    uiMode = Configuration.UI_MODE_NIGHT_YES,
//    widthDp = 320
//)
//@Composable
//fun GreetingPreview() {
//    HelloComposeTheme {
//        Greetings()
//    }
//}

//@Preview(showBackground = true, widthDp = 320, heightDp = 320, name = "sss")
//@Composable
//fun OnBoardingPreview() {
//    HelloComposeTheme {
//        OnBoardingScreen()
//    }
//}
