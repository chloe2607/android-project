package fr.epf.chloedepit_min2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import fr.epf.chloedepit_min2.model.Categorie
import fr.epf.chloedepit_min2.model.Film

class DetailsFilmActivity : AppCompatActivity(){

    lateinit var imageView : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_film_activity)

        val TitreTextView = findViewById<TextView>(R.id.details_film_titre_textView)

        val RealisateurTextView= findViewById<TextView>(R.id.details_film_realisateur_textView)
        val ProducteurTextView =findViewById<TextView>(R.id.details_film_producteur_texteView)
        val ActeurTextView=findViewById<TextView>(R.id.details_film_acteur_TextView)
        val CategorieTextView=findViewById<TextView>(R.id.details_film_categorie_textView)
        val DateSortieTextView=findViewById<TextView>(R.id.details_film_dateSortie_TextView)
        val DureeTextView=findViewById<TextView>(R.id.details_film_duree_textView)

        val film = intent.extras?.get("film") as? Film

        //TitreTextView.text = film?.titre ?: "Non renseigné"

        imageView = findViewById<ImageView>(R.id.details_film_imageview)
    }


}