package com.example.swiperefreshlayoutdemo.swiperefreshlayoutbasic;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.swiperefreshlayoutdemo.R;


public class SwipeRefreshLayoutActivity extends FragmentActivity {

    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            SwipeRefreshLayoutBasicFragment fragment = new SwipeRefreshLayoutBasicFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }
    }
}
