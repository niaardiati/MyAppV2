package com.example.myappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityMoveWithData : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        edtCelcius = findViewById(R.id.edt_celcius)
        btnSuhu = findViewById(R.id.edt_btn_suhu)
        edt_hasil1 = findViewById(R.id.edt_hasil1)
        edt_hasil2 = findViewById(R.id.edt_hasil2)
        edt_hasil3 = findViewById(R.id.edt_hasil3)

        btnSuhu.setOnClickListener(this)
    }

    private lateinit var edtCelcius: EditText
    private lateinit var btnSuhu: Button
    private lateinit var edt_hasil1: TextView
    private lateinit var edt_hasil2: TextView
    private lateinit var edt_hasil3: TextView
    override fun onClick(v: View?) {
        if (v?.id == R.id.edt_btn_suhu) {
            val inputCelcius = edtCelcius.text.toString().trim()

            var isEmptyFields = false
            if (inputCelcius.isEmpty()){
                isEmptyFields = true
                edtCelcius.error = "Fields ini tidak boleh kosong"
            }

            if (!isEmptyFields){
                val celcius = inputCelcius.toDouble()
                val fahrenheit = (celcius*9/5)+32
                val kelvin = celcius + 273
                edt_hasil1.text = (celcius.toString()+ " " + "Fahrenheit")
                edt_hasil2.text = (fahrenheit.toString()+ " " + "Reamur")
                edt_hasil3.text = (kelvin.toString()+ " " + "Kelvin")
            }
        }
    }
}