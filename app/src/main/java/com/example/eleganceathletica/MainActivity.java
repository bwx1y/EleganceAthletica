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

        pushUp.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), PushUp.class));
        });

        pullUp.setOnClickListener(V -> {
            startActivity(new Intent(getApplicationContext(), PullUp.class));
        });
    }
}