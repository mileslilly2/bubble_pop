package com.example.bubblepop


import processing.core.PApplet


class BubbleSketch : PApplet() {
    lateinit var bubble: Bubble

    override fun settings() {
        size(800, 600)
    }

    override fun setup() {
        background(255f)
        bubble = Bubble(this, width / 2f, height / 2f, 50f)
    }

    override fun draw() {
        background(255f)
        bubble.move()
        bubble.display()
    }
}
