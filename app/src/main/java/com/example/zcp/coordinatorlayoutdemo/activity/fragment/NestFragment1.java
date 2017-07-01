package com.example.zcp.coordinatorlayoutdemo.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zcp.coordinatorlayoutdemo.R;

/**
 * 2017/6/28.
 * <p>
 * github:[https://github.com/jacky1234]
 * qq:[847564732]
 *
 * @author yangjianfei
 * @description:
 */

public class NestFragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_nest1,null);

        return root;
    }
}
