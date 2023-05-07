package fr.epf.chloedepit_min2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_film_activity)
    }
}
fun View.click(action : (View) -> Unit){
    Log.d("CLICK", "click")
    this.setOnClickListener(action)
}