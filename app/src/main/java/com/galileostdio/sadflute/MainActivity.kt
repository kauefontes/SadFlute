package com.galileostdio.sadflute

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var resID = getResources().getIdentifier("flauta", "raw", getPackageName())
        val button1 = findViewById (R.id.sadButton) as ImageButton
        button1.setOnClickListener {
            val mp = MediaPlayer.create(this, resID)
            mp.start ()
        }

    }
}
