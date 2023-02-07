package com.jgarcia.peopleapp.features_users.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jgarcia.peopleapp.features_users.data.source.local.dao.UserDao
import com.jgarcia.peopleapp.features_users.domain.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)

abstract class UserDatabase:RoomDatabase(){
       abstract val userDao: UserDao

}