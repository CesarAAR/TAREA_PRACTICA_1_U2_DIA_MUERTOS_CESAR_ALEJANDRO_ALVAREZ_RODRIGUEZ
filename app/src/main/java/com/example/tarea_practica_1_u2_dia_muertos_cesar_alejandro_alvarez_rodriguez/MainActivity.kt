package com.example.tarea_practica_1_u2_dia_muertos_cesar_alejandro_alvarez_rodriguez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LIENZO(this))
    }
}