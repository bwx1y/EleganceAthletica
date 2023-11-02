package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PullUp extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_up);

        back = findViewById(R.id.buttonBack1);

        back.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });
    }
}