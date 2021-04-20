package com.example.mymovie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity :
        AppCompatActivity(R.layout.activity_main),
        FragmentMoviesListClickListener,
        BackClickListener {
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
}



