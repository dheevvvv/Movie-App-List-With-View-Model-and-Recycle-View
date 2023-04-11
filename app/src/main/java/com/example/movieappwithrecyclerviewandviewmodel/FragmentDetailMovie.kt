package com.example.movieappwithrecyclerviewandviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.movieappwithrecyclerviewandviewmodel.databinding.FragmentDetailMovieBinding
import kotlin.collections.ArrayList

@Suppress("DEPRECATION")
class FragmentDetailMovie : Fragment() {
    private lateinit var binding: FragmentDetailMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailMovieBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val bundle = arguments
        val title = bundle?.getString("title")
        val poster = bundle?.getInt("img")
        val genre = bundle?.getString("genre")
        val durasi = bundle?.getInt("durasi")
        val sinopsis = bundle?.getString("sinopsis")

        val data = DataMovie(poster.toString().toInt(),title.toString(),genre.toString(),durasi.toString().toInt(),sinopsis.toString())
        binding.ivPoster.setImageResource(data.poster.toString().toInt())
        binding.tvTitle.text = data.title
        binding.tvGenre.text = data.genre
        binding.tvDurasi.text= data.durasi.toString()
        binding.tvSinopsis.text = data.sinopsis

//        val vm = ViewModelProvider(this).get(MovieListViewModel::class.java)
//        vm.getMovie(data)
//        val observer = Observer<DataMovie>{
//            binding.ivPoster.setImageResource(it.poster)
//            binding.tvTitle.text = it.title
//            binding.tvGenre.text = it.genre
//            binding.tvDurasi.text = it.durasi.toString()
//            binding.tvSinopsis.text = it.sinopsis
//        }
//        vm.movie.observe(viewLifecycleOwner,observer)



//        vm.movieList.observe(viewLifecycleOwner, Observer {movies->
//            val selectedMovie = movies.find{ it.title == (title ?: "null") }
//            val result = selectedMovie?.let { movie->
//                binding.ivPoster.setImageResource(movie.poster)
//                binding.tvTitle.text = movie.title
//                binding.tvGenre.text = movie.genre
//                binding.tvDurasi.text = movie.durasi.toString()
//                binding.tvSinopsis.text = movie.sinopsis
//            }
//           adapter.setMovieData(result as java.util.ArrayList<DataMovie>)
//
//        })




        binding.ivArrowBack.setOnClickListener {
            requireActivity().onBackPressed()
        }


    }


}