package com.hole.counter.presentation.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.login.navigator.LoginComponent

@Composable
fun LoginScreen(
    component: LoginComponent
){
    Scaffold {
        Column {
            Text("Login Screen")
        }
    }
}