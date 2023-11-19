package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Trophy extends AppCompatActivity {
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy);

        this.back = findViewById(R.id.imageView2);
        this.back.setOnClickListener(V -> startActivity(new Intent(Trophy.this, MainActivity.class)));
    }
}