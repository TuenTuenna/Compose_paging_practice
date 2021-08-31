package com.example.randomuserlist

import com.example.randomuserlist.model.RandomUserListResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface RandomUserApi {

    @GET("&results=10&seed=abc")
    suspend fun getRandomUsers(
        @Query("page") page: Int
    ): RandomUserListResponse
}
