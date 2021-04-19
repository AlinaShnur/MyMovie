package com.example.mymovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainActivity :
        AppCompatActivity(R.layout.activity_main),
        FragmentMoviesListClickListener,
        BackToListClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            addMovieList()
        }
    }

    private fun addMovieList() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FragmentMoviesList())
                .addToBackStack(null)
                .commit()
    }

    override fun toCardViewClicked() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FragmentMoviesDetails())
                .addToBackStack(null)
                .commit()
    }

    override fun onBackPressed() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FragmentMoviesList())
                .addToBackStack(null)
                .commit()
    }
}



