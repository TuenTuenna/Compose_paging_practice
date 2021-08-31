package com.example.randomuserlist

class RandomUserRepository(private val randomUserApi: RandomUserApi) {
    suspend fun getRandomUsers(page: Int) = randomUserApi.getRandomUsers(page)
}
