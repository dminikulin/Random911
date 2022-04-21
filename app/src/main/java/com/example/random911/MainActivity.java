package com.example.random911;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int rand_num = (int) (Math.random() * 100);

        TextView textView = findViewById(R.id.textView);
        Button generateBtn = findViewById(R.id.generateBtn);
        generateBtn.setOnClickListener(view -> textView.setText("Here is number " + rand_num));
    }
}