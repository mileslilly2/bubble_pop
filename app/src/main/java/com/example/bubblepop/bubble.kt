package com.example.bubblepop


import processing.core.PApplet

class Bubble(private val p: PApplet, private var x: Float, private var y: Float, private val r: Float) {
    private var xSpeed = p.random(-2f, 2f)
    private var ySpeed = p.random(-2f, 2f)

    fun move() {
        x += xSpeed
        y += ySpeed

        // Boundary check to ensure the bubble doesn't leave the screen
        if (x > p.width - r || x < r) {
            xSpeed *= -1
            x = x.coerceIn(r, p.width - r)
        }
        if (y > p.height - r || y < r) {
            ySpeed *= -1
            y = y.coerceIn(r, p.height - r)
        }
    }

    fun display() {
        p.stroke(0)
        p.fill(127f)
        p.ellipse(x, y, r * 2, r * 2)
    }
}


