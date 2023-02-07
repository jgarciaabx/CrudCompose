package com.jgarcia.peopleapp.features_users.presentation.home

import com.jgarcia.peopleapp.features_users.domain.model.User

sealed class HomeEvent{
    data class DeleteUser(val user: User):HomeEvent()
}
