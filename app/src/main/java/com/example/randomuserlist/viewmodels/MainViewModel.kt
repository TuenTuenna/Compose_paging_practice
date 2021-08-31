package com.example.randomuserlist.viewmodels

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.randomuserlist.RandomUserRepository
import com.example.randomuserlist.RandomUserSource
import com.example.randomuserlist.model.RandomUser
import kotlinx.coroutines.flow.Flow

class MainViewModel(randomUserRepository: RandomUserRepository) : ViewModel() {
    val randomUsers: Flow<PagingData<RandomUser>> = Pager(PagingConfig(pageSize = 10)) {
        RandomUserSource(randomUserRepository = randomUserRepository)
    }.flow
}
