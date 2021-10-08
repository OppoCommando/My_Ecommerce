package com.myself.mymaitypoultry.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.myself.mymaitypoultry.R;

public class SplashActivity extends AppCompatActivity {
    private  static  int SPLASH_SCREEN =5500;

    AppCompatImageView imageView;
    AppCompatTextView txt_maityegg, txt_maityonline;
    Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        instance();
        openScreen();
    }

    private void instance() {
        imageView = findViewById(R.id.imageView);
        txt_maityegg = findViewById(R.id.txt_maityegg);
        txt_maityonline = findViewById(R.id.txt_maityonline);

        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);


        imageView.setAnimation(top);
        txt_maityegg.setAnimation(bottom);
        txt_maityonline.setAnimation(bottom);
    }
    private void openScreen() {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                //getLocation();
            }
        },SPLASH_SCREEN);
    }
}