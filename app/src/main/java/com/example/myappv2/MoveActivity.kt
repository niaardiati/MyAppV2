package com.example.myappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)


        edtDolar = findViewById(R.id.edt_dolar)
        btnRupiah = findViewById(R.id.btn_rupiah)
        tvResult = findViewById(R.id.tv_result)

        btnRupiah.setOnClickListener(this)

    }
    private lateinit var edtDolar: EditText
    private lateinit var btnRupiah : Button
    private lateinit var tvResult : TextView

    override fun onClick(v: View?) {
       if (v?.id == R.id.btn_rupiah) {
           val inputRupiah = edtDolar.text.toString().trim()

           var isEmptyFields = false
           if (inputRupiah.isEmpty()) {
               isEmptyFields = true
               edtDolar.error = "Field ini tidak boleh kosong"
           }

           if (!isEmptyFields){
               val akhir = inputRupiah.toDouble()/15000
               tvResult.text = ("$" + akhir.toString())
           }
       }
    }
}