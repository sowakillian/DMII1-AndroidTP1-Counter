package com.gmail.killian.tp1_sowa_killian;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gmail.killian.tp1_sowa_killian.databinding.ActivityViewBindingBinding;

public class ViewBindingActivity extends AppCompatActivity implements View.OnClickListener {
    float sum1 = 0;
    float sum2 = 0;
    ActivityViewBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViewBindingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();
    }

    /**
     * Methods that allow to retrieve the instance of views
     *  in the layout and set onClick listeners on buttons
     */
    private void initViews() {
        binding.buttonResult.setOnClickListener(this);
    }

    /**
     * Method that implement actions when a button is clicked
     */
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonResult) {
            sum1 = Float.parseFloat(binding.sumNumber1.getText().toString());
            sum2 = Float.parseFloat(binding.sumNumber2.getText().toString());

            float result = sum1 + sum2;
            binding.resultSumTextView.setText(String.valueOf(result));
        }
    }
}
