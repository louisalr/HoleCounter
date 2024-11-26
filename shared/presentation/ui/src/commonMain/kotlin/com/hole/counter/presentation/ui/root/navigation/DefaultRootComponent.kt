package com.hole.counter.presentation.ui.root.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.popTo
import com.arkivanov.decompose.router.stack.replaceAll
import com.arkivanov.decompose.value.Value
import com.hole.counter.presentation.ui.home.navigator.DefaultHomeComponent
import com.hole.counter.presentation.ui.home.navigator.HomeComponent
import com.hole.counter.presentation.ui.leaderboard.navigator.DefaultLeaderComponent
import com.hole.counter.presentation.ui.leaderboard.navigator.LeaderComponent
import com.hole.counter.presentation.ui.login.navigator.DefaultLoginComponent
import com.hole.counter.presentation.ui.login.navigator.LoginComponent
import com.hole.counter.presentation.ui.register.navigator.DefaultRegisterComponent
import com.hole.counter.presentation.ui.register.navigator.RegisterComponent
import kotlinx.serialization.Serializable
import com.hole.counter.presentation.ui.root.navigation.RootComponent.Child

class DefaultRootComponent(
    componentContext: ComponentContext,
) : RootComponent, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, Child>> =
        childStack(
            source = navigation,
            serializer = Config.serializer(),
            initialConfiguration = Config.Home,
            handleBackButton = true,
            childFactory = ::child,
        )

    private fun child(config: Config, childComponentContext: ComponentContext): Child =
        when (config) {
            is Config.Home -> Child.Home(homeComponent(childComponentContext))
            is Config.Login -> Child.Login(loginComponent(childComponentContext))
            is Config.Register -> Child.Register(registerComponent(childComponentContext))
            is Config.LeaderBoard -> Child.LeaderBoard(leaderComponent(childComponentContext))
        }

    private fun homeComponent(componentContext: ComponentContext): HomeComponent =
        DefaultHomeComponent(
            componentContext = componentContext,
            onRegisterClickedPressed = {}
        )

    private fun loginComponent(componentContext: ComponentContext): LoginComponent =
        DefaultLoginComponent(
            componentContext = componentContext,
            onRegisterClickedPressed = { navigation.replaceAll(Config.Home) },
        )

    private fun registerComponent(componentContext: ComponentContext): RegisterComponent =
        DefaultRegisterComponent(
            componentContext = componentContext,
            onRegisterClickedPressed = navigation::pop,
        )

    private fun leaderComponent(componentContext: ComponentContext): LeaderComponent =
        DefaultLeaderComponent(
            componentContext = componentContext,
            onRegisterClickedPressed = {  },
        )

    override fun onBackClicked(toIndex: Int) {
        navigation.popTo(index = toIndex)
    }

    @Serializable
    private sealed interface Config {
        @Serializable
        data object Login : Config

        @Serializable
        data object Register : Config

        @Serializable
        data object Home : Config

        @Serializable
        data object LeaderBoard : Config
    }
}