package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Times extends AppCompatActivity {
    private ImageView back;
    private TextView viewTimes;
    private Button buttonStartPause;
    private CountDownTimer CountDownTimer;
    private boolean timerRunning;
    private long startTimes, timeLeftInMillis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);

        this.startTimes = getIntent().getLongExtra("times",0);
        this.timeLeftInMillis = getIntent().getLongExtra("times",0);

        this.viewTimes = findViewById(R.id.viewTimes);
        this.buttonStartPause = findViewById(R.id.buttonStartTime);
        this.back = findViewById(R.id.buttonBack);

        this.updateCountDownText();

        this.buttonStartPause.setOnClickListener(V -> {
            if (this.timerRunning) {
                pauseTimer();
            } else {
                this.startTimer();
            }
        });

        this.back.setOnClickListener(V -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
    }

    private void pauseTimer() {
        this.CountDownTimer.cancel();
        this.timerRunning = false;
        this.buttonStartPause.setText("Start");
    }

    private void startTimer() {
        this.CountDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                timerRunning = false;
                buttonStartPause.setText("Start");
                buttonStartPause.setVisibility(View.INVISIBLE);
            }
        }.start();

        this.timerRunning = true;
        this.buttonStartPause.setText("pause");
    }

    private void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        this.viewTimes.setText(timeLeftFormatted);
    }
}