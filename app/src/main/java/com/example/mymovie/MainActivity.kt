package com.example.mymovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

//  Add FragmentMoviesList to the MainActivity
//  create the transaction with transition of navigation to FragmentMoviesDetails
//  by click on Card with Film

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        supportFragmentManager.beginTransaction()
                .add(R.id.main_container, FragmentMoviesList())
//                .add(R.id.main_container,FragmentMoviesList())
//                .hide(FragmentMoviesList())
//                .show(FragmentMoviesDetails())
                .commit()

        val textView: TextView = findViewById(R.id.movies_list_text_view)
        textView.setOnClickListener { moveToNextScreen()
        }

    }



        private fun moveToNextScreen() {
             val intent = Intent(this, MovieDetailsActivity::class.java)

             startActivity(intent)
        }

    }
