package com.example.bubblepop

import processing.core.PApplet

class Bubble(private val pApplet: PApplet, var x: Float, var y: Float, var diameter: Float) {
    var speedX = pApplet.random(-5f, 5f)
    var speedY = pApplet.random(-5f, 5f)

    fun move() {
        x += speedX
        y += speedY

        // Bounce the bubble if it hits the edge of the screen
        if (x < diameter/2 || x > pApplet.width - diameter/2) {
            speedX *= -1
        }
        if (y < diameter/2 || y > pApplet.height - diameter/2) {
            speedY *= -1
        }
    }

    fun display() {
        pApplet.ellipse(x, y, diameter, diameter)
    }
}
