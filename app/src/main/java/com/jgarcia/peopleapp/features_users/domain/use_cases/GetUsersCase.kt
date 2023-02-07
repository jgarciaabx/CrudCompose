package com.jgarcia.peopleapp.features_users.domain.use_cases

import com.jgarcia.peopleapp.features_users.domain.model.User
import com.jgarcia.peopleapp.features_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

import javax.inject.Inject

class GetUsersCase @Inject constructor(
    private val repository: UserRepository
) {
     operator fun invoke(): Flow<List<User>>{
         return repository.getUsers()
     }
}