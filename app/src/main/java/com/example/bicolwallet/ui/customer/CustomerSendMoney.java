package com.example.bicolwallet.ui.customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bicolwallet.R;
import com.example.bicolwallet.databinding.ActivityCustomerSendMoneyBinding;
import com.hbb20.CountryCodePicker;

public class CustomerSendMoney extends AppCompatActivity {
    private Boolean valid;
    ActivityCustomerSendMoneyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomerSendMoneyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.customerToolbar.toolbarTitle.setText("Send Money");
        binding.customerToolbar.toolbarTitle.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.lessblue));
        binding.customerToolbar.toolbarTop.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        binding.customerToolbar.toolbarTop.setTitle("");
        binding.customerToolbar.btnBack.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

        binding.customerToolbar.btnBack.setImageResource(R.drawable.icn_back);
        binding.customerToolbar.toolbarTop.setElevation(5);

        binding.countryCodePicker.registerCarrierNumberEditText(binding.editTextPhone);
        binding.countryCodePicker.setDialogBackground(R.drawable.bcd_ccp);

        binding.countryCodePicker.setDialogKeyboardAutoPopup(false);
        binding.countryCodePicker.setPhoneNumberValidityChangeListener(new CountryCodePicker.PhoneNumberValidityChangeListener() {
            @Override
            public void onValidityChanged(boolean isValidNumber) {
                if (isValidNumber) {
                    valid = true;
                } else {
                    valid = false;
                }

            }
        });
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valid) {
                    String phone_number = binding.countryCodePicker.getFullNumberWithPlus();
//            Intent intent = new Intent(getApplicationContext(), AuthenticateActivity.class);
//            intent.putExtra("phonenumber", phone_number);
//            startActivity(intent);
                } else {
                    binding.editTextPhone.setError("phone number is not valid");
                    binding.editTextPhone.requestFocus();
                    return;
                }
            }
        });

        binding.customerToolbar.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}