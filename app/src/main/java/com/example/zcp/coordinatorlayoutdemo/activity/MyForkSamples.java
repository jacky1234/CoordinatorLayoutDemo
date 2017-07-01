package com.example.zcp.coordinatorlayoutdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.zcp.coordinatorlayoutdemo.R;
import com.example.zcp.coordinatorlayoutdemo.activity.fragment.NestFragment1;
import com.example.zcp.coordinatorlayoutdemo.activity.fragment.SampleFragment1;
import com.example.zcp.coordinatorlayoutdemo.activity.fragment.SampleFragment2;

/**
 * 2017/6/28.
 * <p>
 * github:[https://github.com/jacky1234]
 * qq:[847564732]
 *
 * @author yangjianfei
 * @description:NestedScrolling practise
 */

public class MyForkSamples extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fork);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_samples, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getGroupId()) {
            case R.id.group_behavior:
                //group_behavior
                switch (item.getItemId()) {
                    case R.id.behavior_sample1:
                        replace(new SampleFragment1());
                        break;
                    case R.id.behavior_sample2:
                        replace(new SampleFragment2());
                        break;
                }
            case R.id.group_nest_scrolling:
                switch (item.getItemId()) {
                    case R.id.nest_sample1:
                        replace(new NestFragment1());
                        break;
                }
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    private void replace(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }
}
