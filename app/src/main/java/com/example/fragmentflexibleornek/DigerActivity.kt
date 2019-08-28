package com.example.fragmentflexibleornek

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DigerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diger)
        var intent=intent
        var position = intent.extras?.get("TiklanilanPozisyonGonder") as Int

        var fragmentAciklamasi=supportFragmentManager.findFragmentById(R.id.fragmentAciklama) as fragmentAciklama
        fragmentAciklamasi.konuAciklama(position)

    }

}