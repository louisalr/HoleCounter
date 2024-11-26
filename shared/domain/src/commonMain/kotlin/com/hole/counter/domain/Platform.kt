package com.hole.counter.domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform