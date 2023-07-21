package com.samentic.hellocompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier = modifier)
}