package com.locobird00.ansdpt2project.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    var personName: MutableLiveData<String> = MutableLiveData()
    private var nameList: ArrayList<String?> = arrayListOf()
    var currentName: MutableLiveData<String> = MutableLiveData()

    fun addName() {
        nameList.add(personName.value)
    }

    fun displayNames() {
        currentName.value = personName.value

        for (i in nameList)
            currentName.value += "\n$i"
    }
}