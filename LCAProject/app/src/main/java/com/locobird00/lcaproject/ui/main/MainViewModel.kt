package com.locobird00.lcaproject.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    companion object {
        private var message: MutableLiveData<String> = MutableLiveData()

        private var mess = ""
        fun addMsg(msg: String){
            mess += msg
            message.value = mess
        }
    }

    fun getMsg(): MutableLiveData<String> {
        return message
    }
}