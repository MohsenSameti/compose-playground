package com.samentic.hellocompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clip(RoundedCornerShape(12.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(24.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Column(modifier = Modifier.weight(0.5f)) {
                Text(text = "Hello, ", modifier = Modifier.fillMaxWidth())
                Text(
                    text = "$name!",
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.ExtraBold
                    )
                )
                if (isExpanded) {
                    Text(
                        text = ("Composem ipsum color sit lazy, " +
                                "padding theme elit, sed do bouncy. ").repeat(4),
                    )
                }

            }
            IconButton(onClick = { isExpanded = !isExpanded }) {
                Icon(
                    imageVector = if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = stringResource(if (isExpanded) R.string.show_less else R.string.show_more)
                )
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
@Preview(
    widthDp = 320,
    showBackground = true,
)
@Preview(
    name = "DarkPreview",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    widthDp = 320
)
@Composable
fun GreetingPreview() {
    HelloComposeTheme(dynamicColor = false) {
        Greetings()
    }
}

//@Preview(showBackground = true, widthDp = 320, heightDp = 320, name = "sss")
//@Composable
//fun OnBoardingPreview() {
//    HelloComposeTheme {
//        OnBoardingScreen()
//    }
//}
