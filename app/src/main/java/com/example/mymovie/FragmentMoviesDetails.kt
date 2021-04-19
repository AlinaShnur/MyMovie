package com.example.mymovie

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private val backMoviesDetailsClickListener: BackToListClickListener? get() = (activity as? BackToListClickListener)
    private lateinit var backTextView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backTextView = view.findViewById(R.id.back_text_view)
        backTextView.setOnClickListener {
            backMoviesDetailsClickListener?.onBackPressed()
        }
    }
}
