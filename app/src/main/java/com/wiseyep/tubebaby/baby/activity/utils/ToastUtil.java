package com.wiseyep.tubebaby.baby.activity.utils;

import android.widget.Toast;

import com.wiseyep.tubebaby.baby.activity.global.MyApplaction;

/**
 * 土司工具类
 * Created by MR.YANG on 2016/11/15.
 */
public class ToastUtil {
    private static Toast toast;

    public static void toast(String msg) {
        if (toast == null) {
            toast = Toast.makeText(MyApplaction.context, msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }
}
