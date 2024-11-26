package com.hole.counter.viewmodels

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform