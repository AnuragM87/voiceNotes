package com.example.voicenotes

import android.content.Context
import android.media.MediaPlayer
import androidx.core.net.toUri
import java.io.File

class AudioPlayer(private val context: Context) {
    private var player: MediaPlayer? = null
    var onCompletion: (() -> Unit)? = null

    fun playFile(file: File) {
        MediaPlayer.create(context, file.toUri()).apply {
            player = this
            setOnCompletionListener {
                onCompletion?.invoke()
                stop()
            }
            start()
        }
    }

    fun stop() {
        player?.stop()
        player?.release()
        player = null
    }
}
