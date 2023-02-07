package com.jgarcia.peopleapp.features_users.presentation.home

import com.jgarcia.peopleapp.features_users.domain.model.User

data class HomeState(
    val users: List<User> = emptyList()
)
