package com.example.movieappwithrecyclerviewandviewmodel

import android.provider.ContactsContract.Data
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieListViewModel:ViewModel() {


    val list = arrayListOf(
        DataMovie(R.drawable.spiderr,"Spiderman", "Action", 120, "Setelah kehilangan pamannya, Peter merasa bersalah dan memutuskan untuk menggunakan kekuatannya untuk membantu orang lain. Ia mengembangkan kostum khasnya dan menjadi superhero Spider-Man. Ia berusaha untuk memerangi kejahatan di New York City dan melindungi orang-orang yang dicintainya, termasuk kekasihnya, Mary Jane Watson."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth."),
        DataMovie(R.drawable.imgbatman,"Batman", "Action", 120, "Di Kota Gotham, Bruce Wayne muda jatuh ke sumur kering dan diserang oleh segerombolan kelelawar, mengembangkan ketakutan bruce terhadap kekelawar. Menghadiri opera bersama orang tuanya, Thomas dan Martha, Bruce menjadi ketakutan oleh para pemain yang menyamar sebagai kelelawar dan meminta untuk pergi. Di luar, perampok Joe Chill membunuh orang tua Bruce di depannya, dan Bruce yang yatim piatu dibesarkan oleh kepala pelayan keluarga, Alfred Pennyworth.")
    )

    private var _movieList:MutableLiveData<List<DataMovie>> = MutableLiveData()
    val movieList:LiveData<List<DataMovie>> get() = _movieList
    fun getMovieList(){
        val movie =list
        _movieList.value = movie
    }
//    private var _movie:MutableLiveData<DataMovie> = MutableLiveData()
//    val movie:LiveData<DataMovie> get() = _movie
//
//    fun getMovie(data: DataMovie){
//        val movie = data
//        _movie.value = movie
//    }



//    private var _movieList = MutableLiveData<List<DataMovie>>()
//    val movieList:LiveData<List<DataMovie>>get() = _movieList
//
//    fun getMovieList(){
//        val current = movieList.value
//        _movieList.postValue(current)
//    }

}