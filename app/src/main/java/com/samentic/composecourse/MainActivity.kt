package com.samentic.composecourse

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import com.samentic.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourseTheme {
                LazyColumn(
                    contentPadding = PaddingValues(vertical = 16.dp, horizontal = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(
                        items = Data.getCrypto(),
                        key = { it.id }
                    ) {
                        CryptoCurrencyItem(crypto = it)
                    }
                }
            }
        }
    }
}

@Composable
fun CryptoCurrencyItem(crypto: CryptoCurrency, modifier: Modifier = Modifier) {
    var bookmarked by rememberSaveable { mutableStateOf(false) }

    Surface(
        shape = MaterialTheme.shapes.medium,
        color = Color.LightGray,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = { bookmarked = !bookmarked }) {
                Icon(
                    painterResource(
                        if (bookmarked) R.drawable.ic_star_filled else R.drawable.ic_star_outline
                    ),
                    contentDescription = null
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    AsyncImage(
                        model = crypto.iconUrl, // what if it is null?
                        contentDescription = null,
                        onState = {
                            when (it) {
                                AsyncImagePainter.State.Empty -> Log.d(
                                    "SampleTAG",
                                    "empty: ${crypto.iconUrl}"
                                )

                                is AsyncImagePainter.State.Error -> Log.d(
                                    "SampleTAG",
                                    "error: ${crypto.iconUrl} -> ${it.result.throwable.message}"
                                )

                                is AsyncImagePainter.State.Loading -> Log.d(
                                    "SampleTAG",
                                    "loading: ${crypto.iconUrl}"
                                )

                                is AsyncImagePainter.State.Success -> Log.d(
                                    "SampleTAG",
                                    "success: ${crypto.iconUrl}"
                                )
                            }
                            Log.d("SampleTAG", "$it")
                        },
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(24.dp).clip(CircleShape)
                    )
                    Text(
                        text = crypto.name,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.height(IntrinsicSize.Min)
                ) {
                    Text(
                        text = crypto.time.orEmpty().ifEmpty { "-" },
                        style = MaterialTheme.typography.bodySmall
                    )
                    if (!crypto.symbol.isNullOrBlank()) {
                        Divider(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(1.dp)
                                .padding(vertical = 4.dp),
                            color = Color.Gray
                        )
                        Text(
                            text = crypto.symbol,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CryptoCurrencyItemPreview() {
    CryptoCurrencyItem(Data.getCrypto().first())
}