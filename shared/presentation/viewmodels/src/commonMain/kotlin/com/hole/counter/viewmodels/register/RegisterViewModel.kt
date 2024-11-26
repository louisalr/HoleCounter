package com.hole.counter.viewmodels.register

import androidx.lifecycle.ViewModel
import com.hole.counter.domain.authentication.register.RegisterUseCase
import com.hole.counter.viewmodels.register.models.RegisterUiStateModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RegisterViewModel(
    private val registerUseCase: RegisterUseCase
): ViewModel(){

    private val _viewState = MutableStateFlow(RegisterUiStateModel())
    val viewState: StateFlow<RegisterUiStateModel> = _viewState.asStateFlow()

    init {}
}