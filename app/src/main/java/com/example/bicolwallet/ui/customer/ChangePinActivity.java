package com.example.bicolwallet.ui.customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.bicolwallet.R;
import com.example.bicolwallet.databinding.ChangePinBinding;

public class ChangePinActivity extends AppCompatActivity {
    ChangePinBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ChangePinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.customerToolbar.toolbarTitle.setText("Pin Change");
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

        binding.btnOldenable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Enabled", Toast.LENGTH_SHORT).show();
            }
        });

        binding.oldPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                binding.oldPassword.setBackgroundResource(R.drawable.bcd_password_box);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.oldPassword.setBackgroundResource(R.drawable.bcd_password_box);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.newPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                binding.newPassword.setBackgroundResource(R.drawable.bcd_password_box);

                if (binding.oldPassword.getText().length() < 4) {
                    binding.oldPassword.setBackgroundResource(R.drawable.erboxshape);
                    binding.oldPassword.setError("Password must be 4 digits");
                } else
                    binding.oldPassword.setBackgroundResource(R.drawable.bcd_password_box);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.newPassword.setBackgroundResource(R.drawable.bcd_password_box);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.confirmPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                binding.confirmPassword.setBackgroundResource(R.drawable.bcd_password_box);
                if (binding.newPassword.getText().length() < 4) {
                    binding.newPassword.setBackgroundResource(R.drawable.erboxshape);
                    binding.newPassword.setError("Password must be 4 digits");
                } else
                    binding.newPassword.setBackgroundResource(R.drawable.bcd_password_box);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count == 4 && binding.confirmPassword.getText() != binding.newPassword.getText()) {
                    binding.confirmPassword.setBackgroundResource(R.drawable.erboxshape);
                    binding.confirmPassword.setError("Password must be matched");
                    binding.confirmPassword.requestFocus();
                } else
                    binding.confirmPassword.setBackgroundResource(R.drawable.bcd_password_box);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}