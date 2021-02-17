package com.gmail.killian.tp1_sowa_killian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewCount;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    /**
     * Methods that allow to retrieve the instance of views
     *  in the layout and set onClick listeners on buttons
     */
    private void initViews() {
        Button buttonToast = findViewById(R.id.buttonToast);
        Button buttonInc = findViewById(R.id.buttonCount);
        textViewCount =  findViewById(R.id.counterTextView);

        buttonToast.setOnClickListener(this);
        buttonInc.setOnClickListener(this);
    }

    /**
     * Method that implement actions when a button is clicked
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonToast:
                Toast.makeText(MainActivity.this, String.valueOf(counter), Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCount:
                counter++;
                textViewCount.setText(String.valueOf(counter));
                break;
        }
    }
}
