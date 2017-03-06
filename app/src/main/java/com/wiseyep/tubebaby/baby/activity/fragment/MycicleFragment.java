package com.wiseyep.tubebaby.baby.activity.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wiseyep.tubebaby.baby.R;

public class MycicleFragment extends Fragment {

    public MycicleFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mycicleFragment = inflater.inflate(R.layout.fragment_mycicle,null);

        return mycicleFragment;
    }

    private void init(View view) {

    }
}
