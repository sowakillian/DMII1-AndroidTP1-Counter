package com.gmail.killian.tp1_sowa_killian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gmail.killian.tp1_sowa_killian.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
        binding.buttonCounterAndToast.setOnClickListener(this);
        binding.buttonCalc.setOnClickListener(this);
        binding.buttonSendEmail.setOnClickListener(this);
    }

    /**
     * Method that implement actions when a button is clicked
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonCounterAndToast:
                startActivity(new Intent(MainActivity.this, ToastCountActivity.class));
                break;
            case R.id.buttonCalc:
                startActivity(new Intent(MainActivity.this, ViewBindingActivity.class));
                break;
            case R.id.buttonSendEmail:
                composeEmail(new String[]{"ksowa@outlook.fr"}, "FakeSubject");
        }
    }

    public void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
