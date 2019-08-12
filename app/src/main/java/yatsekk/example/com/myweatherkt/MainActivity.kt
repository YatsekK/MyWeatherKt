package yatsekk.example.com.myweatherkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import yatsekk.example.com.myweatherkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.cityNameTextView.setOnClickListener { Toast.makeText(this, "Название города", Toast.LENGTH_LONG).show() }
    }
}
