package com.example.animequizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.animequizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener{

            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "Start button clicked",Toast.LENGTH_LONG).show()

        }







    }
}