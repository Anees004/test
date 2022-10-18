package com.example.bicolwallet;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.bicolwallet.databinding.ActivityCustomerRequestBinding;
import com.example.bicolwallet.databinding.ActivitySendRequestBinding;
import com.example.bicolwallet.ui.customer.AddMoneyActivity;
import com.example.bicolwallet.ui.customer.ChangePinActivity;
import com.example.bicolwallet.ui.customer.CustomerPayout;
import com.example.bicolwallet.ui.customer.CustomerProfileActivity;
import com.example.bicolwallet.ui.customer.CustomerRequestActivity;
import com.example.bicolwallet.ui.customer.CustomerRequestMoney;
import com.example.bicolwallet.ui.customer.CustomerSendMoney;
import com.example.bicolwallet.ui.customer.SendRequest;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bicolwallet.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private List<SlideModel> slideModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, binding.appBarMain.toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        binding.appBarMain.toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.blue), PorterDuff.Mode.SRC_ATOP);
        binding.appBarMain.toolbar.setTitle("");
        NavigationView navigationView = binding.navView;
        slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", "new home top", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://bit.ly/3fLJf72", "lets rock", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.bcd_home_top, "check bro", ScaleTypes.CENTER_CROP));
        binding.appBarMain.contentMain.imageSlider.setImageList(slideModels);
        navigationView.setNavigationItemSelectedListener(this);

        binding.appBarMain.contentMain.btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerSendMoney.class);
                startActivity(intent);
            }
        });

        binding.appBarMain.contentMain.btnRequestMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerRequestMoney.class);
                startActivity(intent);
            }
        });

        binding.appBarMain.contentMain.btnRequestsHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CustomerRequestActivity.class);
                startActivity(intent);
            }
        });

        binding.appBarMain.contentMain.btnRechargeWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddMoneyActivity.class);
                startActivity(intent);
            }
        });
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.btnhistory)
            Toast.makeText(getApplicationContext(), "Your History", Toast.LENGTH_SHORT).show();

        else if (id == R.id.btnNotification)
            Toast.makeText(getApplicationContext(), "Your Notification", Toast.LENGTH_SHORT).show();
        else if (id == R.id.btnPayout) {
            Intent intent = new Intent(getApplicationContext(), CustomerPayout.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_view);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btnHomeProfile:
                Intent intent = new Intent(this, CustomerProfileActivity.class);
                startActivity(intent);
                break;
            case R.id.btnRequests:
                Intent intent3 = new Intent(this, CustomerRequestActivity.class);
                startActivity(intent3);
                break;
            case R.id.btnSendRequest:
                Intent intent2 = new Intent(this, SendRequest.class);
                startActivity(intent2);
                break;
            case R.id.btnChangePin:
                Intent intent1 = new Intent(this, ChangePinActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnChangeLanguage:
                break;
            case R.id.btnSupport:
                break;
            case R.id.btnFaq:
                break;
            case R.id.btnAbout:
                break;
            case R.id.btnTerms:
                break;
            case R.id.btnPrivacy:
                break;
            case R.id.btnLogOut:
                break;
        }
        return true;
    }
}