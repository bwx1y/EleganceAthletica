package com.example.eleganceathletica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Jump extends AppCompatActivity {
    private final String urlYoutube = "https://youtu.be/FJmRQ5iTXKE?si=AjFJdTbGZsxjdahm"; // link untuk video youtube
    private final long times = 180000; // satuan times adalah milisecond
    private ImageView back;
    private Button start, youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);

        this.back = findViewById(R.id.buttonBack);
        this.start = findViewById(R.id.buttonStartJump);
        this.youtube = findViewById(R.id.buttonYoutubePullUp);

        this.back.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        this.youtube.setOnClickListener(V -> startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(this.urlYoutube))));
        this.start.setOnClickListener(V -> startActivity(new Intent(Jump.this, Jump.class).putExtra("times", this.times)));

    }
}