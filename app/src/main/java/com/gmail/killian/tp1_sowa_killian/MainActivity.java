package com.gmail.killian.tp1_sowa_killian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonToast;
    Button buttonCount;
    TextView counterTextView;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView =  findViewById(R.id.counterTextView);

        initToastButton();
        initCountButton();
    }


    void initToastButton() {
        buttonToast = findViewById(R.id.buttonToast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(counter), Toast.LENGTH_SHORT).show();
            }
        });

    }

    void initCountButton() {
        buttonCount = findViewById(R.id.buttonCount);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });
    }
}
