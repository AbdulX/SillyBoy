package com.wiseyep.tubebaby.baby.activity.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.wiseyep.tubebaby.baby.R;

public class HomeFragment extends Fragment {

    private Context context;
    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private HomeHotFragment homeHotFragment;
    private HomeOnlineFragment homeOnlineFragment;
    public HomeFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentManager = getChildFragmentManager();
        final View homefragment = inflater.inflate(R.layout.fragment_home,null);
        radioGroup = (RadioGroup) homefragment.findViewById(R.id.radio_group);

        //初始化显示的fragment
        setCurrentItem(R.id.rb_hot);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                setCurrentItem(checkedId);
            }
        });
        return homefragment;
    }


    //设置嵌套的fragment显示
    private void setCurrentItem(int checkedId) {
        fragmentTransaction = fragmentManager.beginTransaction();
        hideallfragment(fragmentTransaction);
        if(checkedId == R.id.rb_hot){
            if(homeHotFragment == null){
                homeHotFragment = new HomeHotFragment();
                fragmentTransaction.add(R.id.home_frame, homeHotFragment);
            }
            fragmentTransaction.show(homeHotFragment);
        }else if(checkedId == R.id.rb_online_consulting) {
            if(homeOnlineFragment == null){
                homeOnlineFragment = new HomeOnlineFragment();
                fragmentTransaction.add(R.id.home_frame, homeOnlineFragment);
            }
            fragmentTransaction.show(homeOnlineFragment);
        }
        fragmentTransaction.commit();
    }

    //隐藏嵌套的所有fragment
    private void hideallfragment(FragmentTransaction fragmentTransaction){
        if(homeHotFragment != null){
            fragmentTransaction.hide(homeHotFragment);
        }
        if(homeOnlineFragment != null){
            fragmentTransaction.hide(homeOnlineFragment);
        }
    }
}
