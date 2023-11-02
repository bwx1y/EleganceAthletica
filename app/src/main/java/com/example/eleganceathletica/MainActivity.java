package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pushUp, pullUp, sitUp, handstand, jump, jumpRope, bicepsCurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushUp = findViewById(R.id.buttonPushUp);
        pullUp = findViewById(R.id.buttonPullUp);
        sitUp = findViewById(R.id.buttonSitUp);
        handstand = findViewById(R.id.buttonHandstand);
        jump = findViewById(R.id.buttonJump);
        jumpRope = findViewById(R.id.buttonJumpRope);
        bicepsCurl = findViewById(R.id.buttonBicepsCurl);

        pushUp.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), PushUp.class));
        });

        pullUp.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), PullUp.class));
        });

        sitUp.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), SitUp.class));
        });

        handstand.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), Handstand.class));
        });

        jumpRope.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), JumpRope.class));
        });

        bicepsCurl.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), BicepsCurl.class));
        });
    }
}