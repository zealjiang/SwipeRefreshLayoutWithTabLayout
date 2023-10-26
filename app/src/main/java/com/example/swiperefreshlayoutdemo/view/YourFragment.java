package com.example.swiperefreshlayoutdemo.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.swiperefreshlayoutdemo.R;

public class YourFragment extends Fragment {
    private static final String ARG_POSITION = "position";

    public static YourFragment newInstance(int position) {
        YourFragment fragment = new YourFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int pos = 0;
        Bundle bundle = getArguments();
        if (bundle != null) {
            pos = bundle.getInt(ARG_POSITION);
        }
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        TextView tv = view.findViewById(R.id.tv_title);
        tv.setText("tab Item "+pos);
        // 在这里对视图进行初始化和操作
        return view;
    }
}
