package com.bakery.api.users.di

import com.bakery.api.users.service.UserService
import com.bakery.database.repository.user.UserRepository
import com.bakery.database.repository.user.UserRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val userModule = module {
    singleOf(::UserRepositoryImpl) bind UserRepository::class

    singleOf(::UserService)
}
