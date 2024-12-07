package com.example.smk7.Siswa;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.smk7.BottomNavigationHandler;
import com.example.smk7.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class DashboardSiswa extends AppCompatActivity implements BottomNavigationHandler  {


    ViewPager2 viewPager2;
    ViewPagerAdaptersiswa viewPagerAdaptersiswa;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboardsiswa);


        LayoutInflater inflater = getLayoutInflater();
        bottomNavigationView = findViewById(R.id.bottomnav);
        viewPager2 = findViewById(R.id.Viewpagersiswa);
        viewPagerAdaptersiswa = new ViewPagerAdaptersiswa(this);
        viewPager2.setAdapter(viewPagerAdaptersiswa);
        viewPager2.setUserInputEnabled(true);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.b_homesiswa) {
                    viewPager2.setCurrentItem(0);
                } else if (id == R.id.b_mapelsiswa) {
                    viewPager2.setCurrentItem(1);
                } else if (id == R.id.b_setting) {
                    viewPager2.setCurrentItem(2);
                }


                return true;
            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    bottomNavigationView.getMenu().findItem(R.id.b_homesiswa).setChecked(true);
                } else if (position == 1) {
                    bottomNavigationView.getMenu().findItem(R.id.b_mapelsiswa).setChecked(true);
                } else if (position == 2) {
                    bottomNavigationView.getMenu().findItem(R.id.b_setting).setChecked(true);
                }
                viewPager2.setUserInputEnabled(false);
                super.onPageSelected(position);
            }
        });
    }

    @Override
    public void hideBottomNav() {

        if (bottomNavigationView != null) {
            bottomNavigationView.setVisibility(View.GONE);
        }
    }

    @Override
    public void showBottomNav() {
        if (bottomNavigationView != null) {
            bottomNavigationView.setVisibility(View.VISIBLE);
        }
    }
}