package com.gmail.killian.tp1_sowa_killian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gmail.killian.tp1_sowa_killian.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int counter = 0;
    float sum1 = 0;
    float sum2 = 0;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    /**
     * Methods that allow to retrieve the instance of views
     *  in the layout and set onClick listeners on buttons
     */
    private void initViews() {
        binding.buttonToast.setOnClickListener(this);
        binding.buttonCount.setOnClickListener(this);
        binding.buttonResult.setOnClickListener(this);
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
                binding.counterTextView.setText(String.valueOf(counter));
                break;
            case R.id.buttonResult:
                sum1 = Float.parseFloat(binding.sumNumber1.getText().toString());
                sum2 = Float.parseFloat(binding.sumNumber2.getText().toString());

                float result = sum1+sum2;
                binding.resultSumTextView.setText(String.valueOf(result));
        }
    }
}
