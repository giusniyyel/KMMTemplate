package org.giusniyyel.kmm.di

import org.giusniyyel.kmm.data.local.AppDatabase
import org.giusniyyel.kmm.data.local.ExampleDao
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

val sharedModule = module {
    single<ExampleDao> { get<AppDatabase>().getExampleDao() }
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