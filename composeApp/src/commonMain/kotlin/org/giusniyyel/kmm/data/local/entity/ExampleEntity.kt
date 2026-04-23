package org.giusniyyel.kmm.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExampleEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val content: String
)