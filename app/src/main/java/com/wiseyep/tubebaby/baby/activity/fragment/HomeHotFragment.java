package com.wiseyep.tubebaby.baby.activity.fragment;


import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.wiseyep.tubebaby.baby.R;
import com.wiseyep.tubebaby.baby.activity.adapter.HotPagerAdapter;
import com.wiseyep.tubebaby.baby.activity.bean.HomeHot;
import com.wiseyep.tubebaby.baby.activity.global.AppUrl;
import com.wiseyep.tubebaby.baby.activity.global.MyApplaction;
import com.wiseyep.tubebaby.baby.activity.utils.Xcircleindicator;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by Administrator on 2017/2/23.
 */
public class HomeHotFragment extends Fragment {

    private TextView tvhot;
    private View mRootView;
    private ViewPager vp_hot;
    private ImageView ivhot;
    private Xcircleindicator xcircleindicator;

    private List<ImageView> imageViewList;
    private HomeHot homeHot;
    private HotPagerAdapter hotPagerAdapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return initView(inflater);
    }

    public View initView(LayoutInflater inflater) {
        imageViewList = new ArrayList<>();
        mRootView = inflater.inflate(R.layout.fragment_home_hot,null);
        tvhot = (TextView) mRootView.findViewById(R.id.tv_hot);
        vp_hot = (ViewPager) mRootView.findViewById(R.id.vp_hot);
        ivhot = (ImageView) mRootView.findViewById(R.id.iv_hot);
        hotPagerAdapter = new HotPagerAdapter(imageViewList);
        xcircleindicator = (Xcircleindicator) mRootView.findViewById(R.id.Xcircleindicator);
        vp_hot.setAdapter(hotPagerAdapter);
        //设置总共的页数
        xcircleindicator.initData(imageViewList.size(), 0);
        //设置当前的页面
        xcircleindicator.setCurrentPage(0);
        xcircleindicator.setStrokeColor(Color.BLACK);
        xcircleindicator.setFillColor(Color.BLUE);

        vp_hot.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                xcircleindicator.setCurrentPage(position);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    public void initData() {
        //加载viewpager轮播图
        OkHttpUtils.get()
                .url(AppUrl.HomeHot)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        System.out.print(response);
                        Gson gson = new Gson();

                        response = "{\n" +
                                "    \"pager\":[\n" +
                                "    {\n" +
                                "        \"params\":\"http://i.zeze.com/attachment/forum/201605/06/214815xnd5dz5t58fndt85.jpg\"\n" +
                                "    }\n" +
                                "    ,\n" +
                                "    {\n" +
                                "        \"params\":\"http://pic55.nipic.com/file/20141208/19462408_171130083000_2.jpg\"\n" +
                                "    }\n" +
                                "    ,\n" +
                                "    {\n" +
                                "        \"params\":\"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg\"\n" +
                                "    }\n" +
                                "    ,\n" +
                                "    {\n" +
                                "        \"params\":\"http://pic73.nipic.com/file/20150724/18576408_175304314596_2.jpg\"\n" +
                                "    }\n" +
                                "    ]\n" +
                                "}";

                        homeHot = gson.fromJson(response,HomeHot.class);
                        for (int i = 0; i < 4; i++) {
                            OkHttpUtils.get().url(homeHot.getPager().get(i).getParams()).build().execute(new BitmapCallback() {
                                @Override
                                public void onError(Call call, Exception e, int id) {

                                }

                                @Override
                                public void onResponse(final Bitmap response, int id) {
                                    ImageView iv = new ImageView(MyApplaction.context);
                                    iv.setImageBitmap(response);
                                    imageViewList.add(iv);
                                    hotPagerAdapter.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                });
    };
}
