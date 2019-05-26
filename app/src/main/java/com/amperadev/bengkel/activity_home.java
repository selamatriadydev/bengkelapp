package com.amperadev.bengkel;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;

public class activity_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViews();
    }

    private void initViews() {
        // setting toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // setting view pager
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        // setting tabLayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }

//    private void setSupportActionBar(Toolbar toolbar) {
//
//
//    }

    private void setupViewPager(ViewPager viewPager) {
        MainFragmentPagerAdapter mainFragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.addFragment(new Home(), getString(R.string.home));
        mainFragmentPagerAdapter.addFragment(new Pesanan(), getString(R.string.pesanan));
        mainFragmentPagerAdapter.addFragment(new Inbox(), getString(R.string.inbox));
        mainFragmentPagerAdapter.addFragment(new Akun(), getString(R.string.akun));
        viewPager.setAdapter(mainFragmentPagerAdapter);
    }

}