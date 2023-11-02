package com.example.eleganceathletica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Times extends AppCompatActivity {

    TextView viewTimes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);

        viewTimes = findViewById(R.id.textViewtes);
        int times = Integer.parseInt(getIntent().getStringExtra("data"));

        if (getIntent().getExtras() != null) {
            viewTimes.setText(getIntent().getStringExtra("data"));
        }
    }
}