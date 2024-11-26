package com.hole.counter.domain.authentication.register

import com.hole.counter.domain.authentication.register.models.RegisterUseCaseModel

interface RegisterUseCase{
    suspend fun invoke(): RegisterUseCaseModel
}