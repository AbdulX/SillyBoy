package com.wiseyep.tubebaby.baby.activity.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wiseyep.tubebaby.baby.R;
import com.wiseyep.tubebaby.baby.activity.global.MyApplaction;

/**
 * Created by Administrator on 2017/2/22.
 */
public class SplashActivity extends AppCompatActivity{

    private boolean isGuide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        MyApplaction.mainHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadMainActivity();
            }
        },3000);
    }

    private void loadMainActivity() {
        SharedPreferences sp = getSharedPreferences("config", Context.MODE_PRIVATE);
        isGuide = sp.getBoolean("isGuideShow",false);
        if(!isGuide){
            Intent intent = new Intent(SplashActivity.this, GuideActivity.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }
        finish();
    }
}
