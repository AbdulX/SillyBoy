package com.wiseyep.tubebaby.baby.activity.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.google.gson.Gson;
import com.wiseyep.tubebaby.baby.activity.utils.LogUtil;

/**
 * Created by Administrator on 2017/2/22.
 */
public class MyApplaction extends Application {
    public static Context context;//全局的context
    public static Handler mainHandler;//全局主线程的handler
    //public static HttpLoader httpLoader;//网络访问
    public static int userId = -1;//用户ID
    public static String username ="";
    public static Gson gson;

    public static void setUserId(int userId) {
        MyApplaction.userId = userId;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.e(this, "MyApplication onCreate");
        context = this;
        mainHandler = new Handler();
        gson = new Gson();
    }
}
