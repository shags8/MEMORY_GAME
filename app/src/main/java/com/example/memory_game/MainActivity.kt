package com.example.memory_game

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import kotlinx.coroutines.delay
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    var s =0
    var arr = ArrayList<Int>()
    var count =1
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
    fun colourSound(colour : Int){
        var b1 = findViewById<Button>(R.id.blue)
        var b2 = findViewById<Button>(R.id.yellow)
        var b3 = findViewById<Button>(R.id.green)
        var b4 = findViewById<Button>(R.id.red)
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

    }
     fun game(){
         for(i in 0..6){
              s = 0
             arr.clear()
             for (j in 0..i){
                 var colour = (1..4).random()
                 arr.add(colour)
                 colourSound(colour)
                 s = arr.size
             }
             input()
             if(count==0){
                 break
             }
         }
               // for(i in 0..s){
                //    if(arr[i]==arr2[i])
                  //      continue
                 //   else{
                   //     var mp4 = MediaPlayer.create(this,R.raw.wrong)
                  //      mp4.start()
                 //       game(view)
                 //   }

               // }
    }
    fun input(view: View){
        var arr2 = ArrayList<Int>()
        arr2.clear()
        for (i in 0..s){
            var buttonTag = 0
            val v = view as Button
            buttonTag = v.tag.toString().toInt()
            arr2.add(buttonTag)
            var s2 = arr2.size
        }
        if (arr!=arr2){
            var mp = MediaPlayer.create(this,R.raw.wrong)
            mp.start()
            count = 0
        }
    }
}
