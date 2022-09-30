package com.example.myapplication_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController=MediaController(this)
        val uri:Uri=Uri.parse("android.resource://"+packageName+"/"+R.raw.movie)
        val myvideoview=findViewById<VideoView>(R.id.video)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
        val button=findViewById<FloatingActionButton>(R.id.floating)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply{startActivity(this)
            }
        }
    }
}