package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button pushUp, pullUp, sitUp, handstand, jump, jumpRope, bicepsCurl;
    private ImageView award;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.pushUp = findViewById(R.id.buttonPushUp);
        this.pullUp = findViewById(R.id.buttonPullUp);
        this.sitUp = findViewById(R.id.buttonSitUp);
        this.handstand = findViewById(R.id.buttonHandstand);
        this.jump = findViewById(R.id.buttonJump);
        this.jumpRope = findViewById(R.id.buttonJumpRope);
        this.bicepsCurl = findViewById(R.id.buttonBicepsCurl);

        this.award = findViewById(R.id.buttonAward);

        this.pushUp.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), PushUp.class)));
        this.pullUp.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), PullUp.class)));
        this.sitUp.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), SitUp.class)));
        this.handstand.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), Handstand.class)));
        this.jumpRope.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), JumpRope.class)));
        this.bicepsCurl.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), BicepsCurl.class)));
    }
}