package castor.no.c.pro.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var miImagen:ImageView
    lateinit var texto:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miImagen = findViewById(R.id.imgDado)
        texto = findViewById(R.id.txtNumero)
    }
    fun clickBoton(v: View){
        //Log.e("MENSAJES", "Fijate que presionaste")
        //Toast.makeText(this, ":)", Toast.LENGTH_SHORT).show()
        val numero = Random.nextInt(6)+1
        texto.text = "$numero"

        when(numero){
            1 -> {miImagen.setImageResource(R.drawable.dice_1)}
            2 -> {miImagen.setImageResource(R.drawable.dice_2)}
            3 -> {miImagen.setImageResource(R.drawable.dice_3)}
            4 -> {miImagen.setImageResource(R.drawable.dice_4)}
            5 -> {miImagen.setImageResource(R.drawable.dice_5)}
            6 -> {miImagen.setImageResource(R.drawable.dice_6)}
        }
    }
}