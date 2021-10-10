package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edittext : EditText
    var number1 : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean = false
    var isMultiply: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          edittext = findViewById<EditText>(R.id.edit_text)
    }


    fun Button_Clicked(v: View){

        when(v.id){

            R.id.button_one -> {
                Number_operation(1)
            }
            R.id.button_two -> {
                Number_operation(2)
            }
            R.id.button_three -> {
                Number_operation(3)
            }
            R.id.button_four -> {
                Number_operation(4)
            }
            R.id.button_five -> {
                Number_operation(5)
            }
            R.id.button_six -> {
                Number_operation(6)
            }
            R.id.button_seven -> {
                Number_operation(7) }

            R.id.button_eight -> {
                Number_operation(8) }

            R.id.button_nine -> {
                Number_operation(9)
        }
            R.id.button_zero -> {
                Number_operation(0)
            }
            R.id.button_dot -> {
                val number = edittext.text.toString() + "."
                edittext.setText(number)
            }

            R.id.button_add -> {
                number1 = edittext.text.toString().toFloat()
                isPlus = true
                edittext.setText("")
            }

            R.id.button_minus -> {
                 number1 = edittext.text.toString().toFloat()
                isMinus = true
                edittext.setText("")
            }
            R.id.button_multiply -> {
                number1 = edittext.text.toString().toFloat()
                isMultiply = true
                edittext.setText("")
            }

            R.id.button_clear -> {

                edittext.setText("")
            }

            R.id.button_equal -> {

                when{

                    isPlus ->{
                        val number2 = edittext.text.toString().toFloat()
                        val result = number1 +number2
                        edittext.setText(result.toString())
                        isPlus = false

                    }

                    isMinus ->{
                        val number2 = edittext.text.toString().toFloat()
                        val result = number1 - number2
                        edittext.setText(result.toString())
                        isMinus = false

                    }

                    isMultiply ->{
                        val number2 = edittext.text.toString().toFloat()
                        val result = number1 * number2
                        edittext.setText(result.toString())
                        isMultiply = false

                    }


                }


            }





        }

    }

    fun Number_operation(number_chosen : Int){
        val number = edittext.text.toString() + number_chosen.toString()
        edittext.setText(number)
    }
}