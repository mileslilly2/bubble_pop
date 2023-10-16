package com.example.bubblepop.views

import android.content.Context
import android.graphics.Canvas
import android.view.SurfaceHolder
import android.view.SurfaceView
import com.example.bubblepop.threads.GameThread

class GameView(context: Context) : SurfaceView(context), SurfaceHolder.Callback {

    private val thread: GameThread

    init {
        holder.addCallback(this)
        thread = GameThread(holder, this)
        isFocusable = true
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        thread.setRunning(true)
        thread.start()
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        // Handle surface changes if needed
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
        var retry = true
        while (retry) {
            try {
                thread.setRunning(false)
                thread.join()
                retry = false
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }

    fun update() {
        // Update game state (e.g., move objects, handle input, etc.)
    }

    override fun draw(canvas: Canvas?) {
        super.draw(canvas)
        // Draw game objects (e.g., sprites, text, etc.) on the canvas
    }
}

