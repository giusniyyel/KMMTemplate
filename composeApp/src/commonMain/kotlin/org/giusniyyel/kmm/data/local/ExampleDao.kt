package org.giusniyyel.kmm.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import org.giusniyyel.kmm.data.local.entity.ExampleEntity

@Dao
interface ExampleDao {
    @Insert
    suspend fun insert(item: ExampleEntity)

    @Query("SELECT count(*) FROM ExampleEntity")
    suspend fun count(): Int

    @Query("SELECT * FROM ExampleEntity")
    fun getAllAsFlow(): Flow<List<ExampleEntity>>
}