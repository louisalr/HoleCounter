package com.hole.counter.presentation.ui

import androidx.compose.runtime.Composable
import org.koin.dsl.KoinAppDeclaration

@Composable
fun MainAndroid(appDeclaration: KoinAppDeclaration){
    App(appDeclaration = appDeclaration)
}