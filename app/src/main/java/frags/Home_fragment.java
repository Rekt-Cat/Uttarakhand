package com.maid.uttarakhandtourismboosterapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home_fragment extends Fragment {

    int[] images={
            R.drawable.cloudend,
            R.drawable.dalihills,
            R.drawable.george,
            R.drawable.inbetweenmountain


    };
    String[] place={
            "Cloud End",
            "Dali Hills",
            "George Everest",
            "Nanital"
    };
    String[] rating={
            "4.7/5",
            "4.8/5",
            "4.5/5",
            "4.3/5"
    };
    String[] details={
            "",
            "4.8/5",
            "4.5/5",
            "4.3/5"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




        return inflater.inflate(R.layout.fragment_home_fragment, container, false);
    }
}