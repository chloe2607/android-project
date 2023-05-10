package fr.epf.chloedepit_min2

import retrofit2.http.GET

interface RandomUserService {

    @GET("movie/now_playing?api_key=98a7590b7310accc2bf3ea0e4f0300be&language=fr")
    suspend fun getFilms() : GetFilmsResult
}

data class GetFilmsResult(val results: List<Film>)
data class Film(val title: String, val overview: String, val vote_average: Float, val adult : Boolean, val release_date : String)