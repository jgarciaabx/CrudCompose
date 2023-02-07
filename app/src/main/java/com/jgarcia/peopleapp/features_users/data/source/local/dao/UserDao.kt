package com.jgarcia.peopleapp.features_users.data.source.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jgarcia.peopleapp.features_users.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserDao {
    @Query("SELECT * FROM User")
    fun getUsers(): Flow<List<User>>


    @Query("SELECT * FROM User WHERE id = :id")
    suspend fun getUserById(id:Int): User?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert (user: User)

    @Delete
    suspend fun deleteUser(user: User)

}