package com.hole.counter.presentation.ui

import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.root.navigation.DefaultRootComponent
import org.koin.dsl.KoinAppDeclaration

@Composable
fun MainAndroid(
    appDeclaration: KoinAppDeclaration,
    rootComponent: DefaultRootComponent,
){
    App(
        appDeclaration = appDeclaration,
        rootComponent = rootComponent
    )
}