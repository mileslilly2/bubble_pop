package com.example.bubblepop.threads

import android.graphics.Canvas
import android.view.SurfaceHolder
import com.example.bubblepop.views.GameView

class GameThread(private val surfaceHolder: SurfaceHolder, private val gameView: GameView) : Thread() {

    private var running: Boolean = false

    fun setRunning(isRunning: Boolean) {
        running = isRunning
    }

    override fun run() {
        var canvas: Canvas?
        while (running) {
            canvas = null
            try {
                canvas = surfaceHolder.lockCanvas()
                synchronized(surfaceHolder) {
                    gameView.update()
                    gameView.draw(canvas)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                if (canvas != null) {
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }
}
