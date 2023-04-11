package com.example.movieappwithrecyclerviewandviewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter(private var movieList:ArrayList<DataMovie>, private val onItemClick:(DataMovie)->Unit):
    RecyclerView.Adapter<MovieListAdapter.ViewHolder>(){

//    var onItemClick: ((DataMovie) -> Unit)? = null
//
//    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
//        val poster = itemView.findViewById<ImageView>(R.id.iv_poster)
//        val title = itemView.findViewById<TextView>(R.id.tv_title)
//        val genre = itemView.findViewById<TextView>(R.id.tv_genre)
//    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val poster :ImageView = itemView.findViewById(R.id.iv_poster)
        val title:TextView = itemView.findViewById(R.id.tv_title)
        val genre:TextView = itemView.findViewById(R.id.tv_genre)

        fun bind(dataMovie: DataMovie) {
            poster.setImageResource(dataMovie.poster)
            title.text = dataMovie.title
            genre.text = dataMovie.genre
            itemView.setOnClickListener { onItemClick(dataMovie) }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListAdapter.ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieListAdapter.ViewHolder, position: Int) {
        holder.bind(movieList[position])


//        val movie = movieList[position]
//        holder.poster.setImageResource(movie.poster)
//        holder.genre.text = movie.genre
//        holder.title.text = movie.title


//        val movie = movieList[position]
//        holder.bind(movie)
//        holder.itemView.setOnClickListener {
//            onItemClickListener.onItemClick(movie)
//        }


//        holder.itemView.setOnClickListener {
//            onItemClick?.invoke(movie)
//        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }


    fun setMovieData(movieList: java.util.ArrayList<DataMovie>)
    {
        this.movieList =movieList
//        notifyDataSetChanged()
    }
}