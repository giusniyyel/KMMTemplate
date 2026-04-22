package org.giusniyyel.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform