package com.example.memory_game

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.blue)
        var b2 = findViewById<Button>(R.id.yellow)
        var b3 = findViewById<Button>(R.id.green)
        var b4 = findViewById<Button>(R.id.red)
        b1.setOnClickListener{
            var mp2 = MediaPlayer.create(this,R.raw.blue)
            mp2.start()
        }
        b2.setOnClickListener{
            var mp4 = MediaPlayer.create(this,R.raw.yellow)
            mp4.start()
        }
        b3.setOnClickListener{
            var mp3 = MediaPlayer.create(this,R.raw.green)
            mp3.start()
        }
        b4.setOnClickListener{
            var mp = MediaPlayer.create(this,R.raw.red)
            mp.start()
        }
    }
    fun game(view: View){
        var j = 1
        var b1 = findViewById<Button>(R.id.blue)
        var b2 = findViewById<Button>(R.id.yellow)
        var b3 = findViewById<Button>(R.id.green)
        var b4 = findViewById<Button>(R.id.red)
        while (j<=6) {
            for(i in 1..j) {
                var colour = (1..4).random()
                when (colour) {
                    1 -> {
                        b1.performClick()
                    }
                    2 -> {
                        b2.performClick()
                    }
                    3 -> {
                        b3.performClick()
                    }
                    else -> {
                        b4.performClick()
                    }
                }
                var arr = ArrayList<Int>()
                arr.add(colour)
                ++j
                var buttonTag = 0
                val v = view as Button
                buttonTag = v.tag.toString().toInt()
                var arr2 = ArrayList<Int>()
                arr2.add(buttonTag)
                var s = arr.size
                var s2 = arr2.size

            }

        }
    }
}
