package com.example.alarm_manager

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log


class AlarmService : Service(){
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }



}