package com.example.randomuserlist.di

import com.example.randomuserlist.BuildConfig
import com.example.randomuserlist.RandomUserApi
import com.example.randomuserlist.utils.Constants
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val networkModule = module {
    single { retrofit(get()) }
    single { apiService(get()) }
}


fun apiService(
    retrofit: Retrofit
): RandomUserApi =
    retrofit.create(RandomUserApi::class.java)

fun retrofit(
    okHttpClient: OkHttpClient
): Retrofit =
    Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
