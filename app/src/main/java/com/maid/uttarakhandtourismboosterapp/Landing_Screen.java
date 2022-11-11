    package com.maid.uttarakhandtourismboosterapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.maid.uttarakhandtourismboosterapp.databinding.ActivityLandingScreenBinding;

import frags.Fav_fragment;
import frags.Home_fragment;
import frags.NearYou_Fragment;
import frags.Profile_fragment;

    public class Landing_Screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_screen);
        BottomNavigationView bottomNavigationView=findViewById(R.id.navi);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Home_fragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
           Fragment selecetedFrag=null;
           switch(item.getItemId()){
               case R.id.home:
                   selecetedFrag    = new Home_fragment();
                   break;
               case R.id.fav:
                   selecetedFrag=new Fav_fragment();
                   break;
               case R.id.nearyou:
                   selecetedFrag=new NearYou_Fragment();
                   break;
               case R.id.profile:
                   selecetedFrag=new Profile_fragment();
                   break;
           }

           getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,selecetedFrag).commit();
            return true;
        }
    };


}