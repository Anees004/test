package com.example.bicolwallet.ui.customer;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.example.bicolwallet.R;
import com.example.bicolwallet.databinding.ActivityCustomerProfileBinding;

public class CustomerProfileActivity extends AppCompatActivity {
ActivityCustomerProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCustomerProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.customerToolbar.toolbarTitle.setText("Profile");
        binding.customerToolbar.toolbarTop.setTitle("");
        binding.customerToolbar.btnBack.setImageResource(R.drawable.icn_back_white);
        setSupportActionBar(binding.customerToolbar.toolbarTop);
        binding.customerToolbar.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        binding.btnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btnFemale.setBackgroundResource(R.drawable.btn_bcd_selected);
                binding.femaleicn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.lessblue)));
                binding.txtfemale.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.lessblue));

                binding.btnMale.setBackgroundResource(R.drawable.btn_bcd_out);
                binding.maleicn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                binding.txtmale.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

                binding.btnOtherGender.setBackgroundResource(R.drawable.btn_bcd_out);
                binding.icnothergender.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                binding.txtOthergen.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

            }
        });
        binding.btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btnFemale.setBackgroundResource(R.drawable.btn_bcd_out);
                binding.femaleicn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                binding.txtfemale.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

                binding.btnMale.setBackgroundResource(R.drawable.btn_bcd_selected);
                binding.maleicn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.lessblue)));
                binding.txtmale.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.lessblue));

                binding.btnOtherGender.setBackgroundResource(R.drawable.btn_bcd_out);
                binding.icnothergender.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                binding.txtOthergen.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

            }
        });

        binding.btnOtherGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btnFemale.setBackgroundResource(R.drawable.btn_bcd_out);
                binding.femaleicn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                binding.txtfemale.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

                binding.btnMale.setBackgroundResource(R.drawable.btn_bcd_out);
                binding.maleicn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                binding.txtmale.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

                binding.btnOtherGender.setBackgroundResource(R.drawable.btn_bcd_selected);
                binding.icnothergender.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.lessblue)));
                binding.txtOthergen.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.lessblue));

            }
        });
    }



}