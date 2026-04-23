package org.giusniyyel.kmm.local

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import org.giusniyyel.kmm.data.local.AppDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<AppDatabase> {
    val appContext = context.applicationContext
    val dbFile = appContext.getDatabasePath("my_app_room.db")
    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}