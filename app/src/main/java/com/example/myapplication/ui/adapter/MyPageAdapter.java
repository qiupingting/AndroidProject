package com.example.myapplication.ui.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyPageAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragmentList;
    //tab名称
    private  List<String> list_title;
    //将fragment存储为list中
    public MyPageAdapter(@NonNull FragmentManager fm, Context context, List<Fragment> fragmentList, List<String> list_title) {
        super(fm);
         this.context = context;
        this.fragmentList=fragmentList;
        this.list_title=list_title;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    //此方法用来显示tab上的文字

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list_title.get(position);
    }
}
