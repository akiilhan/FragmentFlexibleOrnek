package com.example.fragmentflexibleornek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(),MyListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun sentData(p2: Int) {

     var fragmentAciklama=supportFragmentManager.findFragmentById(R.id.fragmentAciklamaLand) as? fragmentAciklama
        if (fragmentAciklama!=null && fragmentAciklama.isVisible){
            //Landscape mod için burası calısır

            fragmentAciklama.konuAciklama(p2)
        }else {

//portrait Mode
            var intent = Intent(this, DigerActivity::class.java)
            intent.putExtra("TiklanilanPozisyonGonder", p2)
            startActivity(intent)
        }

    }
}
