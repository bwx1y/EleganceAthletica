package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PullUp extends AppCompatActivity {
    private final String urlYoutube = "https://youtu.be/xf7ctwjcYjo?si=TQ3lxeSeR6bzBsux"; // link untuk video youtube
    private final long times = 28000; // satuan times adalah milisecond
    private ImageView back;
    private Button start, youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_up);

        this.back = findViewById(R.id.buttonBack);
        this.start = findViewById(R.id.buttonStartPullUp);
        this.youtube = findViewById(R.id.buttonYoutubePullUp);

        this.back.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        this.youtube.setOnClickListener(V -> startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(this.urlYoutube))));
        this.start.setOnClickListener(V -> startActivity(new Intent(PullUp.this, Times.class).putExtra("times", this.times)));

    }
}