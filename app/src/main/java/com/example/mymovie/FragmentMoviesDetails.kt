package com.example.mymovie
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.mymovie.databinding.FragmentMoviesDetailsBinding

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {

    private val binding by viewBinding(FragmentMoviesDetailsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding.backTextView.setOnClickListener {
            onBackPressed()
        }   
    }
    private fun onBackPressed() {
        router?.exit()
    }
}
