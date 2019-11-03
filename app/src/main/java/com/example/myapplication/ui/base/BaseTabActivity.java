package com.example.myapplication.ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;

public  abstract class BaseTabActivity extends BaseActivity {
    @BindView(R.id.main_vp)
   protected ViewPager mainVp;
    @BindView(R.id.main_t1_tab)
   protected TabLayout mainT1Tab;




}
