package com.example.randomuserlist.model

import com.google.gson.annotations.SerializedName

data class RandomUserListResponse(
//    @SerializedName("total_pages") val totalPages: Int,
//    @SerializedName("total_results") val totalResults: Int,
    @SerializedName("results") val results: List<RandomUser>,
    @SerializedName("info") val info: ResponseInfo,
//    @SerializedName("page") val page: Int
)
