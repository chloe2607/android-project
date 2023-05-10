package fr.epf.chloedepit_min2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.runBlocking
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ListFilmsActivity : AppCompatActivity(){
    lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_films_activity)

        recyclerView = findViewById<RecyclerView>(R.id.list_film_recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.test -> {
                synchro()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.list_films, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun synchro() {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://api.themoviedb.org/3/")
            .build()

        val service = retrofit.create(RandomUserService::class.java)

        runBlocking {
            val films = service.getFilms().results.map {
                Log.d("EPF", "$it")
                Film(
                    it.title,
                    it.overview,
                    it.vote_average,
                    it.adult,
                    it.release_date,
                )
            }
            recyclerView.adapter = FilmAdapter(this@ListFilmsActivity, films )
        }

    }

}