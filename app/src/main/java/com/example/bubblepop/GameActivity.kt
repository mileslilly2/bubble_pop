package com.example.bubblepop

import processing.core.PApplet

class GameActivity : PApplet() {
    // Properties for the bubble
    var bubbleX: Float = 0f
    var bubbleY: Float = 0f
    val bubbleRadius: Float = 50f  // radius of the bubble

    override fun setup() {
        // Set the size of the sketch to the device screen size
        fullScreen()

        // Initialize the bubble's position
        resetBubblePosition()
    }

    override fun draw() {
        // Clear the background
        background(255)  // white background

        // Draw the bubble
        fill(127)  // gray fill
        stroke(0)  // black outline
        ellipse(bubbleX, bubbleY, bubbleRadius * 2, bubbleRadius * 2)

        // Reposition the bubble for the next frame
        resetBubblePosition()
    }

    // Function to randomly position the bubble within the screen bounds
    private fun resetBubblePosition() {
        bubbleX = random(bubbleRadius, width - bubbleRadius)
        bubbleY = random(bubbleRadius, height - bubbleRadius)
    }
}
