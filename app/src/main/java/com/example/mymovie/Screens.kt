package com.example.mymovie

import android.content.Intent
import com.github.terrakok.cicerone.androidx.ActivityScreen
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun MovieList() = FragmentScreen {
        FragmentMoviesList()
    }
    fun MovieDetails(): FragmentScreen = FragmentScreen {
        FragmentMoviesDetails()
    }
}