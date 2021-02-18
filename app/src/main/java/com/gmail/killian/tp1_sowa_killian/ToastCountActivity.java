package com.gmail.killian.tp1_sowa_killian;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gmail.killian.tp1_sowa_killian.databinding.ActivityToastCountBinding;

public class ToastCountActivity extends AppCompatActivity implements View.OnClickListener {
    int counter = 0;
    ActivityToastCountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityToastCountBinding.inflate(getLayoutInflater());
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
    }

    /**
     * Method that implement actions when a button is clicked
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonToast:
                Toast.makeText(ToastCountActivity.this, String.valueOf(counter), Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCount:
                counter++;
                binding.counterTextView.setText(String.valueOf(counter));
                break;
        }
    }
}
