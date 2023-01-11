package com.example.agecalculatorinhour

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn)
        button.setOnClickListener{
            clicked()
        }

    }

    fun clicked(){

        val year: Int = 2023
        val month: Int = 1
        val dayOfMonth: Int = 10
        val sltDate: TextView = findViewById(R.id.sltDate)
        val inHours: TextView = findViewById(R.id.inHours)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{_, Syear, Smonth, SdayOfMonth ->
                val gtDate = "$SdayOfMonth/$Smonth/$Syear"
                sltDate.text = gtDate

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

                val gtDateHour = sdf.parse(gtDate)
                val DateInHour = gtDateHour.time / 6000000

                val currDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                val currInHour = currDate.time / 6000000

                val HourDiff = currInHour - DateInHour

                inHours.text = HourDiff.toString()
            },
            year,
            month,
            dayOfMonth
        ).show()

        Toast.makeText(this, "Message", Toast.LENGTH_LONG).show()
    }

}