package com.example.mymovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity :
        AppCompatActivity(R.layout.activity_main),
        FragmentMoviesListClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            openFragment(fragment = FragmentMoviesList())
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, fragment)
                .addToBackStack(null)
                .commit()
    }

    override fun toCardViewClicked() = openFragment(fragment = FragmentMoviesDetails())
}



