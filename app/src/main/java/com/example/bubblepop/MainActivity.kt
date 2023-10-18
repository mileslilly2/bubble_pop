package com.example.bubblepop

import android.app.Activity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

import processing.android.PFragment



class GameActivity : Activity() {
    private lateinit var sketch: BubbleSketch


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        sketch = BubbleSketch()
        val fragment = PFragment(sketch)
        fragment.setView(sketch, this)
        setContentView(sketch)
    }
}
