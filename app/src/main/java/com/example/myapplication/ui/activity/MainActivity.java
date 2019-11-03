package com.example.myapplication.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.ui.adapter.MyPageAdapter;
import com.example.myapplication.ui.fragment.BookShelfFragment;
import com.example.myapplication.ui.fragment.CategoryFragment;
import com.example.myapplication.ui.fragment.FindFragment;
import com.example.myapplication.ui.fragment.MineFragment;
import com.example.myapplication.ui.fragment.RecommendFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    //toolBar中的TextView
    private List<Fragment> fragments = new ArrayList<Fragment>();
    private List<String> list;
    @BindView(R.id.main_vp)
    ViewPager mainVp;
    @BindView(R.id.main_t1_tab)
    TabLayout mainT1Tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTab();
        initTooBar();
        mainVp.setAdapter(new MyPageAdapter(getSupportFragmentManager(), MainActivity.this, createTabFragment(), createTabTitle()));
        mainT1Tab.setupWithViewPager(mainVp);
    }

    public void initTooBar() {
        toolbar.setTitle("");
      setSupportActionBar(toolbar);
      toolbar.setLogo(R.mipmap.logo);
    }

    public List<Fragment> createTabFragment() {
        initFragment();
        return fragments;
    }

    public List<String> createTabTitle() {
        String[] list_title = getResources().getStringArray(R.array.nb_fragment_title);
        return Arrays.asList(list_title);
    }

    public void initTab() {
        list = createTabTitle();
        for (int i = 0; i < list.size(); i++) {
            mainT1Tab.addTab(mainT1Tab.newTab().setText(list.get(i)));
        }
    }

    public void initFragment() {
        Fragment bookShelfFragment = new BookShelfFragment();
        Fragment recommendFragment = new RecommendFragment();
        Fragment categoryFragment = new CategoryFragment();
        Fragment findFragment = new FindFragment();
        Fragment mineFragment = new MineFragment();
        fragments.add(bookShelfFragment);
        fragments.add(recommendFragment);
        fragments.add(categoryFragment);
        fragments.add(findFragment);
        fragments.add(mineFragment);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:
                startActivity(new Intent(MainActivity.this,SearchBookActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
