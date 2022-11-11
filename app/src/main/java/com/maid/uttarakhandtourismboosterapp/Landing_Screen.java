    package com.maid.uttarakhandtourismboosterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.maid.uttarakhandtourismboosterapp.databinding.ActivityLandingScreenBinding;

    public class Landing_Screen extends AppCompatActivity {

    ActivityLandingScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding= ActivityLandingScreenBinding.inflate(getLayoutInflater());
        replaceScreen(new Home_fragment());

        binding.navi.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.home:
                    replaceScreen(new Home_fragment());
                    break;
                case R.id.fav:
                    replaceScreen(new Fav_fragment());
                    break;
                case R.id.profile:
                    replaceScreen(new Profile_fragment());
                    break;
                case R.id.nearyou:
                    replaceScreen(new NearYou_Fragment());
                    break;

            }
            return true;
        });



    }
        private void replaceScreen(Fragment fragment){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.framelayout,fragment);
            fragmentTransaction.commit();
        }
}