package com.wiseyep.tubebaby.baby.activity.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wiseyep.tubebaby.baby.R;

public class MyFragment extends Fragment {

    public MyFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myfragment = inflater.inflate(R.layout.fragment_my,null);
        return myfragment;
    }

    private void init(View view) {

    }
}
