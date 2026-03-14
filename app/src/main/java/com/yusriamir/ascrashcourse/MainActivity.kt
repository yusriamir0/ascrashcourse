package com.yusriamir.ascrashcourse

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText


import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.yusriamir.ascrashcourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

//        var tvText = findViewById<TextView>(R.id.tvText)
//        var btnSubmit = findViewById<Button>(R.id.btnSubmit)
//        var etText = findViewById<EditText>(R.id.etText)

        binding.btnSubmit.setOnClickListener {
            var etString = binding.etText.text.toString().trim()
            binding.tvText.text = "Hello, $etString"
    }
}
}