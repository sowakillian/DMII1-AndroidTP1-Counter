package com.gmail.killian.tp1_sowa_killian;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
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
        putImageInImageView();
    }

    /**
     * Method that implement actions when a button is clicked
     */
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonResult) {
            String sumNumber1 =  binding.sumNumber1.getText().toString();
            String sumNumber2 =  binding.sumNumber2.getText().toString();

            if (sumNumber1.equals("") || sumNumber2.equals("")) {
                Toast.makeText(ViewBindingActivity.this, "Merci d'entrer un chiffre dans les deux champs", Toast.LENGTH_SHORT).show();
            } else {
                sum1 = Float.parseFloat(sumNumber1);
                sum2 = Float.parseFloat(sumNumber2);

                float result = sum1 + sum2;
                binding.resultSumTextView.setText(String.valueOf(result));
            }

        }
    }

    private void putImageInImageView() {
        Glide.with(this).load("https://lemagdesanimaux.ouest-france.fr/images/dossiers/2020-04/lapin-nain-074045.jpg").into(binding.imageViewBasic);
    }
}
