package yatsekk.example.com.myweatherkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import yatsekk.example.com.myweatherkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val weather: Weather = Weather("Владивосток", 23,
        "Частично облачно и временами осадки", "Температура комфорта: 21",
        "Влажность 64%", "Давление 760 мм", "Ветер Юго-западный 1.0 м/с")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.weather = weather

        binding.cityNameTextView.setOnClickListener {
            Toast.makeText(this, "Название города", Toast.LENGTH_SHORT).show()
        }
    }
}
