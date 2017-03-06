package com.wiseyep.tubebaby.baby.activity.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.wiseyep.tubebaby.baby.R;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;

import okhttp3.Call;

/**
 * Created by Administrator on 2017/2/24.
 */
public class GuideActivity extends AppCompatActivity {

    private SharedPreferences sp;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        sp = getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("isGuideShow", true);
        editor.commit();

        imageView = (ImageView) findViewById(R.id.iv_guide);
        OkHttpUtils.get().url("http://i.zeze.com/attachment/forum/201605/06/214815xnd5dz5t58fndt85.jpg").build().execute(new BitmapCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(Bitmap bitmap, int id) {
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}
