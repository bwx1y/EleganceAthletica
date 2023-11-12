package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class JumpRope extends AppCompatActivity {
    private final String urlYoutube = "https://youtu.be/fLiozP7GVeA?si=YVZrpYU1DcObp4ZN"; // link untuk video youtube
    private final long times = 30000; // satuan times adalah milisecond
    private ImageView back;
    private Button start, youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_rope);

        this.back = findViewById(R.id.buttonBack);
        this.start = findViewById(R.id.buttonStartJump);
        this.youtube = findViewById(R.id.buttonYoutubePullUp);

        this.back.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
        this.youtube.setOnClickListener(V -> startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(this.urlYoutube))));
        this.start.setOnClickListener(V -> startActivity(new Intent(JumpRope.this, Times.class).putExtra("times", this.times)));

    }
}