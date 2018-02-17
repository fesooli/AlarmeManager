package br.com.fellipe.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class AlarmeReceiver : BroadcastReceiver() {

    private lateinit var mp: MediaPlayer

    override fun onReceive(context: Context?, intent: Intent?) {
        mp = MediaPlayer.create(context, R.raw.kamehameha)
        mp.start()
        Toast.makeText(context, "Alarme...", Toast.LENGTH_LONG).show()
    }
}