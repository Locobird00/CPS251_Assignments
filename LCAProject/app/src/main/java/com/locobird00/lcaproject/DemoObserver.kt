package com.locobird00.lcaproject

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

import com.locobird00.lcaproject.ui.main.MainViewModel
import java.text.SimpleDateFormat

class DemoObserver: LifecycleObserver {

    private val _logTAG = "DemoObserver"
    private var mv = MainViewModel

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.i(_logTAG, "onResume")
        mv.addMsg("onResume was fired on " + SimpleDateFormat("HH:mm:ss.SSS"))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.i(_logTAG, "onPause")
        mv.addMsg("onPause was fired on " + SimpleDateFormat("HH:mm:ss.SSS"))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i(_logTAG, "onCreate")
        mv.addMsg("onCreate was fired on " + SimpleDateFormat("HH:mm:ss.SSS"))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.i(_logTAG, "onStart")
        mv.addMsg("onStart was fired on " + SimpleDateFormat("HH:mm:ss.SSS"))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.i(_logTAG, "onStop")
        mv.addMsg("onStop was fired on " + SimpleDateFormat("HH:mm:ss.SSS"))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.i(_logTAG, "onDestroy")
        mv.addMsg("onDestroy was fired on " + SimpleDateFormat("HH:mm:ss.SSS"))
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(owner: LifecycleOwner, event: Lifecycle.Event) {
        Log.i(_logTAG, owner.lifecycle.currentState.name)
    }
}