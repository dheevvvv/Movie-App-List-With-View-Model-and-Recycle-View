package com.example.movieappwithrecyclerviewandviewmodel

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieappwithrecyclerviewandviewmodel.databinding.FragmentMovieListBinding



class FragmentMovieList : Fragment() {
    private lateinit var binding:FragmentMovieListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMovieListBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieViewModel =ViewModelProvider(this).get(MovieListViewModel::class.java)

        val adapter = MovieListAdapter(ArrayList()){ dataMovie ->
            val bundle = Bundle().apply {
                putInt("img", dataMovie.poster)
                putString("title", dataMovie.title)
                putString("genre", dataMovie.genre)
                putInt("durasi", dataMovie.durasi)
                putString("sinopsis", dataMovie.sinopsis)
            }
            findNavController().navigate(R.id.action_fragmentMovieList_to_fragmentDetailMovie, bundle)
        }
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val recyclerView = binding.movieListRecyclerView
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        movieViewModel.getMovieList()
        movieViewModel.movieList.observe(viewLifecycleOwner, Observer {
            adapter.setMovieData(it as java.util.ArrayList<DataMovie>)
        })




        var isGridLayout = false
        binding.ivArrowBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.ivGridOnOff.setOnClickListener {
            isGridLayout = !isGridLayout
            if (isGridLayout){
                binding.ivGridOnOff.setImageResource(R.drawable.ic_grid_on)
                recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
                recyclerView.adapter = adapter

            }else{
                binding.ivGridOnOff.setImageResource(R.drawable.ic_grid_off)
                recyclerView.layoutManager = layoutManager
                recyclerView.adapter = adapter
            }
        }

        binding.tvTopTitle.text = "Movie"
    }







}