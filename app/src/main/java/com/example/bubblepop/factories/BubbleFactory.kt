package com.example.bubblepop.factories

class BubbleFactory {
    fun createBubble(type: BubbleType): Bubble {
        return when (type) {
            BubbleType.SMALL -> SmallBubble()
            BubbleType.MEDIUM -> MediumBubble()
            BubbleType.LARGE -> LargeBubble()
        }
    }
}

enum class BubbleType {
    SMALL, MEDIUM, LARGE
}

// Example Bubble classes
class SmallBubble : Bubble() {
    // SmallBubble specific properties and methods
    init {
        // Initialize properties specific to SmallBubble
        speed = 5f  // Example speed
        points = 10  // Example points
        //color = Color.BLUE  // Example color
    }



    // Additional properties and methods...

}

class MediumBubble : Bubble() {
    // MediumBubble specific properties and methods
}

class LargeBubble : Bubble() {
    // LargeBubble specific properties and methods
}

open class Bubble {
    var x: Float = 0f
    var y: Float = 0f
    var speed: Float = 0f
    var isPopped: Boolean = false
    var points: Int = 0

    open fun pop() {
        this.isPopped = true
        // Additional pop logic specific to SmallBubble
    }

    open fun move() {
        this.x = x + 1
        this.y = y + 1
        // Additional move logic specific to SmallBubble
    }


    // Additional properties and methods...
}
