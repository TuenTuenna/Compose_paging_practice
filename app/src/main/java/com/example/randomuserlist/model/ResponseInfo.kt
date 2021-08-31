package com.example.randomuserlist.model

data class ResponseInfo (
    val seed: String,
    val results: Long,
    val page: Long,
    val version: String
)
