package com.maid.uttarakhandtourismboosterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        t1=findViewById(R.id.explore);
        t2=findViewById(R.id.uk);
        imageView = findViewById(R.id.ropeMan);



        Animation animation = AnimationUtils.loadAnimation(this,R.anim.translation);
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.aplha);
        t1.startAnimation(animation1);
        t2.startAnimation(animation1);
        imageView.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this,Landing_Screen.class));
                finish();
            }
        },3000);



    }
}