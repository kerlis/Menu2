package com.kotlin.order.coffee.menu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_menu3.*
import kotlinx.android.synthetic.main.activity_menu3.view.*

class Menu3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)

        txtresultado.setText("")
        rbentradagroup.visibility = View.INVISIBLE
        rbfondogroup.visibility = View.INVISIBLE



        /*
        var checkbox1 = findViewById(R.id.chkentrada) as CheckBox
        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox


        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox
        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox
        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox

        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox
        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox
        var checkbox2 = findViewById(R.id.chkfondo) as CheckBox
 */



    }

    fun mostrarfondo(view:  View){
        if(chkfondo.isChecked){
            rbfondogroup.visibility = View.VISIBLE
        }
        else{
            rbfondogroup.visibility = View.INVISIBLE
        }
    }


    fun mostrarentrada(view:  View){
        if(chkentrada.isChecked){
            rbentradagroup.visibility = View.VISIBLE
        }
        else{
            rbentradagroup.visibility = View.INVISIBLE

        }


    }



    fun ordenarmenu(view: View){
        var resulado =""

        if(chkentrada.isChecked){
            when{
                rbentradagroup.rbentrada1.isChecked ->
                    resulado +=  "Entrada " + rbentradagroup.rbentrada1.text.toString() + "\n"
                rbentradagroup.rbentrada2.isChecked ->
                    resulado +=  "Entrada " + rbentradagroup.rbentrada2.text.toString() + "\n"
                rbentradagroup.rbentrada3.isChecked ->
                    resulado +=  "Entrada " + rbentradagroup.rbentrada3.text.toString() + "\n"
            }
        }


        if(chkfondo.isChecked){
            when{
                rbfondogroup.rbfondo1.isChecked ->
                    resulado +=  "Entrada " + rbfondogroup.rbfondo1.text.toString() + "\n"
                rbfondogroup.rbfondo2.isChecked ->
                    resulado +=  "Entrada " + rbfondogroup.rbfondo2.text.toString() + "\n"
                rbfondogroup.rbfondo3.isChecked ->
                    resulado +=  "Entrada " + rbfondogroup.rbfondo3.text.toString() + "\n"
            }
        }


        txtresultado.setText(resulado)



    }

}
