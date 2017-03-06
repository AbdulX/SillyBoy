package com.wiseyep.tubebaby.baby.activity.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wiseyep.tubebaby.baby.R;
import com.wiseyep.tubebaby.baby.activity.fragment.CourseFragment;
import com.wiseyep.tubebaby.baby.activity.fragment.HomeFragment;
import com.wiseyep.tubebaby.baby.activity.fragment.MyFragment;
import com.wiseyep.tubebaby.baby.activity.fragment.MycicleFragment;
import com.wiseyep.tubebaby.baby.activity.fragment.ScienceFragment;
import com.zhy.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity{


    private RadioGroup RgBottomContainer;
    private RadioButton rbMy,rbScience,rbCourse,rbCircle,rbHome;
    private ImageView imgRedPointCourse;
    private FrameLayout frame;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private HomeFragment homeFragment;
    private CourseFragment courseFragment;
    private MycicleFragment mycicleFragment;
    private MyFragment myFragment;
    private ScienceFragment scienceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化布局
        init();
        //创建fragment管理器
        fragmentManager = getSupportFragmentManager();
        //设置默认显示页面
        setCurrentItem(R.id.rb_home);
    }

    //初始化布局
    private void init() {
        //要替换的framelayout
        frame = (FrameLayout) findViewById(R.id.frame);
        //radiogroup和radiobutton
        RgBottomContainer = (RadioGroup) findViewById(R.id.bottom_container);
        /*rbHome = (RadioButton) findViewById(R.id.rb_home);
        rbScience = (RadioButton) findViewById(R.id.rb_science);
        rbCourse = (RadioButton) findViewById(R.id.rb_course);
        rbCircle = (RadioButton) findViewById(R.id.rb_exchange_circle);
        rbMy = (RadioButton) findViewById(R.id.rb_my);*/
        //红点
        imgRedPointCourse = (ImageView) findViewById(R.id.img_red_point_course);


        RgBottomContainer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                setCurrentItem(checkedId);
            }
        });

    }

    //设置当前页面
    public void setCurrentItem(int checkedId){
        fragmentTransaction = fragmentManager.beginTransaction();
        hideallFragment(fragmentTransaction);
        switch (checkedId) {
            case R.id.rb_home:
                if(homeFragment == null){
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.frame, homeFragment);
                }
                fragmentTransaction.show(homeFragment);
                break;
            case R.id.rb_science:
                if(scienceFragment == null){
                    scienceFragment = new ScienceFragment();
                    fragmentTransaction.add(R.id.frame, scienceFragment);
                }
                fragmentTransaction.show(scienceFragment);
                break;
            case R.id.rb_course:
                if(courseFragment == null){
                    courseFragment = new CourseFragment();
                    fragmentTransaction.add(R.id.frame, courseFragment);
                }
                fragmentTransaction.show(courseFragment);
                break;
            case R.id.rb_exchange_circle:
                if(mycicleFragment == null){
                    mycicleFragment = new MycicleFragment();
                    fragmentTransaction.add(R.id.frame, mycicleFragment);
                }
                fragmentTransaction.show(mycicleFragment);
                break;
            case R.id.rb_my:
                if(myFragment == null){
                    myFragment = new MyFragment();
                    fragmentTransaction.add(R.id.frame, myFragment);
                }
                fragmentTransaction.show(myFragment);
                break;
        }
        fragmentTransaction.commit();
    }

    //隐藏所有的fragment
    private void hideallFragment(FragmentTransaction transaction){
        if(homeFragment != null){
            transaction.hide(homeFragment);
        }
        if(courseFragment != null){
            transaction.hide(courseFragment);
        }
        if(mycicleFragment != null){
            transaction.hide(mycicleFragment);
        }
        if(myFragment != null){
            transaction.hide(myFragment);
        }
        if(scienceFragment != null){
            transaction.hide(scienceFragment);
        }
    }
}
