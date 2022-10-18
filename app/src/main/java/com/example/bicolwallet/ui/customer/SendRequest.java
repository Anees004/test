package com.example.bicolwallet.ui.customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.bicolwallet.R;
import com.example.bicolwallet.databinding.ActivitySendRequestBinding;
import com.example.bicolwallet.ui.customer.adapter.FragmentAdapterSendRequest;
import com.google.android.material.tabs.TabLayout;

public class SendRequest extends AppCompatActivity {
    ActivitySendRequestBinding binding;
    private FragmentAdapterSendRequest adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySendRequestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, SendRequestFragment.newInstance())
//                    .commitNow();
//        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FragmentAdapterSendRequest(fragmentManager, getLifecycle());
        binding.viewPager.setAdapter(adapter);
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Pending(0)"));
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Approved(0)"));
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Denied(0)"));
//        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("All(0)"));

        binding.customerToolbar.toolbarTitle.setText("Send Request");
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
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        binding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position));
            }
        });
    }
}