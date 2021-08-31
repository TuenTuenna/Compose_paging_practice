package com.example.randomuserlist.di

import com.example.randomuserlist.RandomUserApi
import com.example.randomuserlist.RandomUserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { createRepository(get()) }
}

fun createRepository(
    randomUserApi: RandomUserApi
) : RandomUserRepository = RandomUserRepository(randomUserApi)
