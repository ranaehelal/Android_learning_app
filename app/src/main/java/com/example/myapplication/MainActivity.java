package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button colorButton,familyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        colorButton=findViewById(R.id.colorButton);
        colorButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ColorActivity.class);
            startActivity(intent);
        });

        familyButton = findViewById(R.id.familyButton);
        familyButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(intent);
        });
    }
}