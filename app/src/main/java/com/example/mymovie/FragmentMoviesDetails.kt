package com.example.mymovie
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backTextView = view.findViewById<TextView>(R.id.back_text_view)
        backTextView.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}
