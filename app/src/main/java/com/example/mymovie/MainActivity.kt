package com.example.mymovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details_sec)

//        //инициализация переменной кнопки перехода
//        val textView:TextView = findViewById(R.id.first_activity_text_view)
//        //добавление обработчика нажатия кнопок
//        textView.setOnClickListener{ moveToNextScreen() }
    }

    //переход на следующий экран
    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        val transmittedString = "string to transmit"
        intent.putExtra(SecondActivity.TRANSMITTED_STRING, transmittedString)

        val transmittedInt = 12
        intent.putExtra(SecondActivity.TRANSMITTED_INT, transmittedInt)

        val transmittedBoolean = false
        intent.putExtra(SecondActivity.TRANSMITTED_BOOLEAN, transmittedBoolean)

        startActivity(intent)
    }
}