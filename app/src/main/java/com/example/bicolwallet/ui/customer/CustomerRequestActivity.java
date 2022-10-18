package com.example.bicolwallet.ui.customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.bicolwallet.R;
import com.example.bicolwallet.databinding.ActivityCustomerRequestBinding;
import com.example.bicolwallet.ui.customer.adapter.FragmentAdapterRequest;
import com.example.bicolwallet.ui.customer.adapter.FragmentAdapterSendRequest;
import com.google.android.material.tabs.TabLayout;

public class CustomerRequestActivity extends AppCompatActivity {
    private ActivityCustomerRequestBinding binding;
    private FragmentAdapterRequest adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomerRequestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FragmentAdapterRequest(fragmentManager, getLifecycle());
        binding.viewPager2.setAdapter(adapter);
        binding.customerToolbar.toolbarTitle.setText("Request");
        binding.customerToolbar.toolbarTitle.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.lessblue));
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

        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        binding.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position));
            }
        });
    }
}