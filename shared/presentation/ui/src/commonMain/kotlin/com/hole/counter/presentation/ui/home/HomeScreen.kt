package com.hole.counter.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.home.navigator.HomeComponent

@Composable
fun HomeScreen(
    component: HomeComponent
){
    Scaffold {
        Column {
            Text("Test")
        }
    }
}