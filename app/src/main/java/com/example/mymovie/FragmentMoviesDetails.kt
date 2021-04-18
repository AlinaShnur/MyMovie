package com.example.mymovie

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private var backMoviesDetailsClickListener: BackToListClickListener? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        val view = inflater.inflate(R.layout.fragment_movies_details, container, false)
        view?.findViewById<TextView>(R.id.back_text_view)?.apply {
            setOnClickListener {
                backMoviesDetailsClickListener?.backToListClicked()
            }
        }
        return view
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BackToListClickListener) {
            backMoviesDetailsClickListener = context
        }
    }
    override fun onDetach() {
        super.onDetach()
        backMoviesDetailsClickListener = null
    }
}
