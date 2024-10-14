package com.example.uts_2022131030

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Edittext : AppCompatActivity() {

    // Initiasi Variable
    private lateinit var edit_Nilai: EditText
    private lateinit var keterangan: TextView
    private lateinit var hitungBtn: Button
    private lateinit var resetBtn: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menghubungkan kodingan kotlin dengan kodingan UI
        setContentView(R.layout.activity_edittext)

        // Mencari component yang mempunya id yang sama dan kemudian di assign ke variable
        edit_Nilai = findViewById(R.id.editNilai)
        keterangan = findViewById(R.id.keterangan)
        hitungBtn = findViewById(R.id.Hitung)
        resetBtn = findViewById(R.id.Reset)

        // Hal yang akan terjadi setelah tombol hitung ditekan
        hitungBtn.setOnClickListener {
            val nilaiStr = edit_Nilai.text.toString()
            if (nilaiStr.isNotEmpty()) {
                val nilaiInt = nilaiStr.toInt()

                // Logic for determining grade
                when {
                    nilaiInt >= 85 -> keterangan.text = "A"
                    nilaiInt >= 75 -> keterangan.text = "B"
                    nilaiInt >= 60 -> keterangan.text = "C"
                    else -> keterangan.text = "D"
                }
            }
        }

        // Reset button action
        resetBtn.setOnClickListener {
            edit_Nilai.setText("")
            keterangan.setText("Keterangan Nilai")
        }
    }
}