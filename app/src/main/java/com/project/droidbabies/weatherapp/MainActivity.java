package com.project.droidbabies.weatherapp;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment currentFragment;
    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentFragment=new DashboardFragment();
        manager=getFragmentManager();
        transaction=manager.beginTransaction();
        transaction.add(R.id.myFragment,currentFragment);
        transaction.commit();
    }
}
