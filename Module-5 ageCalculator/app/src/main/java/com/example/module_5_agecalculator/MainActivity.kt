package com.example.module_5_agecalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.DatePicker
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.dateButton)
        button.setOnClickListener{
            clickedDate()
        }

    }

    fun clickedDate(){
        val cal = Calendar.getInstance()
        var year = cal.get(Calendar.YEAR)
        var month = cal.get(Calendar.MONTH)
        var dayOfMonth = cal.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this,
            {_, selectedyear, selectedmonth, selectedDayOfMonth ->
                val selectedDate: TextView = findViewById(R.id.selected_date)
//                selectedDate?.text = "$selectedDayOfMonth.${selectedmonth+1}.$selectedyear"

                var tvSelectedDate = "$selectedDayOfMonth/${selectedmonth+1}/$selectedyear"
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val theDate = sdf.parse(tvSelectedDate)
                var minutes = theDate.time / 60000

                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                val currentDateInMinute = currentDate.time / 60000

                minutes = currentDateInMinute - minutes

                val inMinutes: TextView = findViewById(R.id.minutes)
                inMinutes?.text = minutes.toString()
            },
            year,
            month,
            dayOfMonth
        )
        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()
    }
}


