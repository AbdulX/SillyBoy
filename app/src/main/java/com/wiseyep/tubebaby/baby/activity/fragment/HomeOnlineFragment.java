package com.wiseyep.tubebaby.baby.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wiseyep.tubebaby.baby.R;

/**
 * Created by Administrator on 2017/2/23.
 */
public class HomeOnlineFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View homeonlinefragment = inflater.inflate(R.layout.fragment_home_online,null);
        return homeonlinefragment;
    }
}
