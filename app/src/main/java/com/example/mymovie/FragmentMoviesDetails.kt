package com.example.mymovie
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private val backMoviesDetailsClickListener: BackClickListener? get() = (activity as? BackClickListener)
    lateinit var backTextView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backTextView = view.findViewById(R.id.back_text_view)
        backTextView.setOnClickListener {
            backMoviesDetailsClickListener?.onBackPressed()
        }
    }
}
