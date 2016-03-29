package com.project.droidbabies.weatherapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class DashboardFragment extends android.app.Fragment {
    LinearLayout myLocationLayout;

    public DashboardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        myLocationLayout= (LinearLayout) view.findViewById(R.id.myLocationLayout);
        myLocationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationIntent=new Intent(getActivity(),MyLocationActivity.class);
                startActivity(locationIntent);
            }
        });
        return view;
    }


}
