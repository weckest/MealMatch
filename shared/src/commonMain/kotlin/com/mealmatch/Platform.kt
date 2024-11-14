package com.mealmatch

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform