package com.wiseyep.tubebaby.baby.activity.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wiseyep.tubebaby.baby.R;

public class ScienceFragment extends Fragment {

    public ScienceFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View sciencefragment = inflater.inflate(R.layout.fragment_science,null);

        return sciencefragment;
    }

    private void init(View view) {

    }
}
