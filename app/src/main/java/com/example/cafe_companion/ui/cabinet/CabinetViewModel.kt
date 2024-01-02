package com.example.cafe_companion.ui.cabinet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cafe_companion.classes.Tea

class CabinetViewModel : ViewModel() {

    private val _teaList = MutableLiveData<List<Tea>>()

    val teaList: LiveData<List<Tea>> = _teaList

    fun loadData() {
        _teaList.value = listOf(Tea("X"), Tea("Y"), Tea("Z"))
    }
}