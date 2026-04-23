package org.giusniyyel.kmm.di

import org.giusniyyel.kmm.data.local.AppDatabase
import org.giusniyyel.kmm.data.local.getRoomDatabase
import org.giusniyyel.kmm.local.getDatabaseBuilder
import org.koin.dsl.module

actual val platformModule = module{
    single<AppDatabase> {
        val builder = getDatabaseBuilder(get())
        getRoomDatabase(builder)
    }
    // TODO: Introduce Android Platform Specific Modules
}