package com.locobird00.lcaproject.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val LOG_OUTPUT = "Log String"

class MainViewModel (private val savedStateHandle: SavedStateHandle): ViewModel() {

    private var logcat = ""
    private var output: MutableLiveData<String> = savedStateHandle.getLiveData(LOG_OUTPUT)

    fun setLogs(value: String) {
        logcat += "$value \n"
        savedStateHandle.set(LOG_OUTPUT, logcat)
    }

    fun getOutput(): MutableLiveData<String> {
        return output
    }
}