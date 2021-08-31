package com.example.randomuserlist

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.randomuserlist.model.RandomUser
import java.lang.Exception

class RandomUserSource (private val randomUserRepository: RandomUserRepository) : PagingSource<Int, RandomUser>(){

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RandomUser> {
        return try {
            val nextPage = params.key ?: 1 // params.key 가 값이 없으면 1을 넣어준다.
            val randomUserListResponse = randomUserRepository.getRandomUsers(nextPage)
            LoadResult.Page(
                data = randomUserListResponse.results,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = randomUserListResponse.info.page as Int + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, RandomUser>): Int? {
        Log.d("TAG", "getRefreshKey: ")
        return null
    }


}
