package org.giusniyyel.kmm.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

val sharedModule = module {
    // TODO: Introduce Shared Modules
}

expect val platformModule: Module

fun initializeKoin() {
    startKoin {
        modules(
            sharedModule,
            platformModule
        )
    }
}