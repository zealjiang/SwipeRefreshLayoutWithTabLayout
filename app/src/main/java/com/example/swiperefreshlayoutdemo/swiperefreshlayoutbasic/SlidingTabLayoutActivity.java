package com.example.swiperefreshlayoutdemo.swiperefreshlayoutbasic;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.swiperefreshlayoutdemo.R;
import com.example.swiperefreshlayoutdemo.view.MyPagerAdapter;
import com.example.swiperefreshlayoutdemo.view.SlidingTabLayout;


public class SlidingTabLayoutActivity extends FragmentActivity {

    public static final String TAG = "MainActivity";
    private SlidingTabLayout mTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tab);

        mTabLayout = findViewById(R.id.slidingtab);
        //1像素高的ViewPager 意图适配SlidingTabLayout
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        mTabLayout.setDividerColors(Color.RED, Color.GREEN, Color.BLACK);
        mTabLayout.setSelectedIndicatorColors(Color.BLACK, Color.YELLOW);
        mTabLayout.setViewPager(viewPager);
    }
}
