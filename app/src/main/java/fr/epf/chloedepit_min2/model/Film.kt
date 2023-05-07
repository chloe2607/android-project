package fr.epf.chloedepit_min2.model

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
//import kotlinx.parcelize.Parcelize

enum class Categorie {
    HORREUR, COMEDIE, DRAME, ACTION
}

//@Parcelize
data class Film(
    val titre : String,
    val producteur : String,
    val realisateur : String,
    val dateSortie : String,
    val duree : String,
    val acteurPrincipaux : String,
    val categorie: Categorie
) //: Parcelable {

//}