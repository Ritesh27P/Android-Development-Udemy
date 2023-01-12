package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt: String = ""

        val txtView: TextView = findViewById(R.id.txtView)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btndiv: Button = findViewById(R.id.btndiv)
        val btnmul: Button = findViewById(R.id.btnmul)
        val btndiff: Button = findViewById(R.id.btndiff)
        val btnadd: Button = findViewById(R.id.btnadd)
        val btnClr: Button = findViewById(R.id.btnclr)
        val btnequals: Button = findViewById(R.id.btnequal)

        val btn_list = listOf(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndiv, btnmul, btndiff, btnadd)

        for (btn in btn_list){
            btn.setOnClickListener{
                if (txt.length < 13) {
                    txt += btn.text.toString()
                    txtView.text = txt
                } else {
                    Toast.makeText(this, "Maximum character acheive", Toast.LENGTH_LONG).show()
                }
            }
        }

        btnequals.setOnClickListener {
            if ((txt[txt.length -1].toInt() > 41) && (txt[txt.length -1].toInt() < 48)){
                txtView.text = "Invalid syntax"
                txt = ""
            }
            var number = ""
            var operators: String = ""
            for (i in txt) {
                if ((i.toInt() > 47) && (i.toInt() < 58)){
                    number += (i.code - 48).toString()
                } else {
                    number += " "
                    operators += i
                }
            }
            var lst1 = number.split(" ")
            var num = doMath(lst1, operators)
            txt = ""
            txtView.text = num.toString()
        }

        btnClr.setOnClickListener {
            txt = ""
            txtView.text = ""
        }
    }

    fun doMath(number: List<String>, operator: String): Double{
        var value = 0.0
        value += Integer.parseInt(number[0])
        var index = 1
        for (i in operator){
            println(i)
            when(i){
                '+' -> value += Integer.parseInt(number[index])
                '-' -> value -= Integer.parseInt(number[index])
                '/' -> if (Integer.parseInt(number[index]) == 0) { value = 0.0 } else { value /= Integer.parseInt(number[index]) }
                '*' -> value *= Integer.parseInt(number[index])
                else -> continue
            }
            index ++
        }
        return value
    }



}