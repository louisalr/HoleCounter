package com.hole.counter.viewmodels.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import com.hole.counter.viewmodels.home.HomeViewModel
import com.hole.counter.viewmodels.register.RegisterViewModel
import com.hole.counter.viewmodels.login.LoginViewModel
import com.hole.counter.viewmodels.leaderboard.LeaderBoardViewModel

val viewModelsModule = module {

    /*
    includes(httpModule)
    includes(encryptedPreferencesModule)

    includes(userRepositoryModule)
    includes(coursesRepositoryModule)

    includes(userDomainModule)
    includes(coursesDomainModule)

    includes(userEntityModule)

    factoryOf(::HomeViewModel)*/

    factoryOf(::HomeViewModel)
    factoryOf(::RegisterViewModel)
    factoryOf(::LoginViewModel)
    factoryOf(::LeaderBoardViewModel)
}