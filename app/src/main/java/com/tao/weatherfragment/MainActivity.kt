package com.tao.weatherfragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentCurrentWeatherInfoContainer, CurrentWeatherInfoFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentCurrentDetailInfoContainer, CurrentDetailInfoFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentHourlyInfoContainer, HourlyInfoFragment())
            .commit()
    }
}

