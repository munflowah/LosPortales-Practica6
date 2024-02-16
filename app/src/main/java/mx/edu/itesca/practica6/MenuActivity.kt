package mx.edu.itesca.practica6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MenuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById<Button>(R.id.button_antojitos)
        var btnEspecialidades: Button = findViewById<Button>(R.id.button_especialidades)
        var btnCombinations: Button = findViewById<Button>(R.id.button_combinations)
        var btnTortas: Button = findViewById<Button>(R.id.button_tortas)
        var btnSopas: Button = findViewById<Button>(R.id.button_sopas)
        var btnDrinks: Button = findViewById<Button>(R.id.button_drinks)


        btnAntojitos.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("MenuType", "Antojitos")
            intent.putExtra("drawableId", R.drawable.antojitos)
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("MenuType", "Especialidades")
            intent.putExtra("drawableId", R.drawable.especialidades)
            startActivity(intent)
        }

        btnCombinations.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("MenuType", "Combinations")
            intent.putExtra("drawableId", R.drawable.combinations)
            startActivity(intent)
        }

        btnTortas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("MenuType", "Tortas")
            intent.putExtra("drawableId", R.drawable.tortas)
            startActivity(intent)
        }

        btnSopas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("drawableId", R.drawable.sopas)
            intent.putExtra("MenuType", "Sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("drawableId", R.drawable.drinks)
            intent.putExtra("MenuType", "Drinks")
            startActivity(intent)
        }
    }
}