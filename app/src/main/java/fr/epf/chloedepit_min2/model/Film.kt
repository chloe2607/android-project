package fr.epf.chloedepit_min2.model

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize


//import kotlinx.parcelize.Parcelize

enum class Categorie {
    HORREUR, COMEDIE, DRAME, ACTION
}

//@Parcelize

data class Film(
    val title: String,
    val overview: String,
    val vote_average: Float,
    val adult : Boolean,
    val release_date : String
    /*val titre : String,
    val producteur : String,
    val realisateur : String,
    val dateSortie : String,
    val duree : String,
    val acteurPrincipaux : String,
    val categorie: Categorie*/


) //: Parcelable {

//}