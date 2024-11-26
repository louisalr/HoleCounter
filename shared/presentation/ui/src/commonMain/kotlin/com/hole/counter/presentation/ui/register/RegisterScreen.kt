package com.hole.counter.presentation.ui.register

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.login.navigator.LoginComponent
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent

@Composable
fun RegisterScreen(
    component: RegisterComponent
){
    Scaffold {
        Column {
            Text("Register Screen")
        }
    }
}