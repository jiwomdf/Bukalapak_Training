package com.katilijiwo.latihan2.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.katilijiwo.latihan2.base.BaseViewModel
import com.katilijiwo.latihan2.data.Repository
import com.katilijiwo.latihan2.data.remote.json.banner.Banner
import com.katilijiwo.latihan2.data.remote.json.categories.Category
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val repository: Repository
): BaseViewModel() {

    private val RESPONSE_ITEMS_NULL_MSG = "response items is null"

    private var _flashBanners = MutableLiveData<Event<Banner>>()
    val flashBanners : LiveData<Event<Banner>> = _flashBanners
    fun fetchFlashBanners() {
        viewModelScope.launch {
            try {
                _flashBanners.postValue(Event.Loading)
                val response = repository.fetchFlashBanners()
                if(response?.banners != null && response.banners.isNotEmpty()){
                    _flashBanners.postValue(Event.Success(response.banners))
                } else {
                    _flashBanners.postValue(Event.Error(RESPONSE_ITEMS_NULL_MSG))
                }
            }
            catch (ex: Exception){
                _flashBanners.postValue(Event.Error(ex.message.toString()))
            }
        }
    }

    private var _categories = MutableLiveData<Event<Category>>()
    val categories: LiveData<Event<Category>> = _categories
    fun fetchCategories(){
        viewModelScope.launch {
            try {
                _categories.postValue(Event.Loading)
                val response = repository.fetchCategories()
                if(response?.categories != null && response.categories.isNotEmpty()){
                    _categories.postValue(Event.Success(response.categories))
                } else {
                    _categories.postValue(Event.Error(RESPONSE_ITEMS_NULL_MSG))
                }
            }
            catch (ex: Exception){
                _categories.postValue(Event.Error(ex.message.toString()))
            }
        }
    }

}