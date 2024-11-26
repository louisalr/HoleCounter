package com.hole.counter.presentation.ui

import androidx.compose.runtime.Composable
import com.hole.counter.presentation.ui.di.mainModules
import com.hole.counter.presentation.ui.home.HomeScreen
import org.koin.compose.KoinApplication
import org.koin.dsl.KoinAppDeclaration

@Composable
fun App(
    appDeclaration: KoinAppDeclaration = {}
){

    KoinApplication(application= mainModules(appDeclaration)){
        HomeScreen()
    }

}