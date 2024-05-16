package com.example.alarm_manager

import android.app.AlarmManager
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.alarm_manager.ui.theme.AlarmManagerTheme


class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                Color.TRANSPARENT,
                Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        val alarmManager = AndroidAlarmManager(this)
        setContent {
            AlarmManagerTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){


                    Button(
                        onClick = {
                            alarmManager.scheduleAlarm()
                        }
                    ) {
                        Text(text = "Set Alarm")
                    }
                    Button(
                        onClick = {
                            alarmManager.cancelAlarm()
                        }
                    ) {
                        Text(text = "Cancel Alarm")
                    }


                }
            }
        }
    }

}