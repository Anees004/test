package com.example.bicolwallet.ui.customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bicolwallet.R;
import com.example.bicolwallet.databinding.ActivityAddMoneyBinding;

public class AddMoneyActivity extends AppCompatActivity {

    ActivityAddMoneyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAddMoneyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.customerToolbar.toolbarTitle.setText("Add Money");
        binding.customerToolbar.toolbarTitle.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
        binding.customerToolbar.toolbarTop.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        binding.customerToolbar.toolbarTop.setTitle("");
        binding.customerToolbar.btnBack.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

        binding.customerToolbar.btnBack.setImageResource(R.drawable.icn_back);
        binding.customerToolbar.toolbarTop.setElevation(5);
        binding.customerToolbar.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"I am here",Toast.LENGTH_SHORT).show();
            }
        });
    }
}