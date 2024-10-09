package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColorActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color);
        Button whiteButton = findViewById(R.id.whiteButton);
        Button blackButton = findViewById(R.id.blackButton);
        Button blueButton = findViewById(R.id.blueButton);
        Button redButton = findViewById(R.id.redButton);
        Button greenButton = findViewById(R.id.greenButton);

        whiteButton.setOnClickListener(v -> playSound(R.raw.white));
        blackButton.setOnClickListener(v -> playSound(R.raw.black));
        blueButton.setOnClickListener(v -> playSound(R.raw.blue));
        redButton.setOnClickListener(v -> playSound(R.raw.red));
        greenButton.setOnClickListener(v -> playSound(R.raw.green));
    }

    private void playSound(int soundResource) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }

        mediaPlayer = MediaPlayer.create(this, soundResource);
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(mp -> {
            mp.release();
            mediaPlayer = null;
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}
