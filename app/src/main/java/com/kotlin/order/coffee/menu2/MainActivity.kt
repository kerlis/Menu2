package com.kotlin.order.coffee.menu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var radio_group = findViewById(R.id.radio_group) as RadioGroup


        var opcion1 = findViewById(R.id.opcion1) as RadioButton
        var opcion2 = findViewById(R.id.opcion2) as RadioButton
        var opcion3 = findViewById(R.id.opcion2) as RadioButton

        var btnordenar = findViewById(R.id.ordenar) as Button

        var txtresultado = findViewById(R.id.resultado) as EditText




        radio_group.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            Toast.makeText(applicationContext," On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT).show()
        }


         btnordenar.setOnClickListener{

             var id: Int = radio_group.checkedRadioButtonId

            if (id!=-1){
                val radio:RadioButton = findViewById(id)
                txtresultado.setText(radio.text)
                Toast.makeText(applicationContext,"On button click : ${radio.text}",
                        Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click : nothing selected",
                        Toast.LENGTH_SHORT).show()
            }


             //txtresultado.setText(rad)
        }



    }



    /*
    // Get the selected radio button text using radio button on click listener
    fun radio_button_click(view: View){
        // Get the clicked radio button instance
        val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
        Toast.makeText(applicationContext,"On click : ${radio.text}",
                Toast.LENGTH_SHORT).show()
    }
*/




    //}
}
