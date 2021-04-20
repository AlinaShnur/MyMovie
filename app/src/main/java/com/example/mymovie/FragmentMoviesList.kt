package com.example.mymovie
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private val fragmentMoviesListClickListener: FragmentMoviesListClickListener? get() = (activity as? FragmentMoviesListClickListener)
    lateinit var cardView: View
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView = view.findViewById(R.id.card_view)
        cardView.setOnClickListener {
            fragmentMoviesListClickListener?.toCardViewClicked()
        }
    }
}
