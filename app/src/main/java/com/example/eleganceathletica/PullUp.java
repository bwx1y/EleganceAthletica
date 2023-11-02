package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PullUp extends AppCompatActivity {
    ImageView back;

    Button start, youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_up);

        back = findViewById(R.id.buttonBack1);
        start = findViewById(R.id.buttonStartPullUp);
        youtube = findViewById(R.id.buttonYoutubePullUp);

        back.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });

        start.setOnClickListener(V -> {
            String times = "50000"; // satuan times adalah milisecond
            Intent intent = new Intent(PullUp.this, Times.class);
            intent.putExtra("data", times);
            startActivity(intent);
        });

    }
}