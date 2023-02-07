package com.jgarcia.peopleapp.features_users.domain.use_cases

import com.jgarcia.peopleapp.features_users.domain.model.User
import com.jgarcia.peopleapp.features_users.domain.repository.UserRepository
import javax.inject.Inject

class InsertUser @Inject constructor(
    private  val repository: UserRepository
) {
    suspend operator fun invoke(user: User){
        repository.insertUser(user)
    }
}