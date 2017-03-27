package com.poc.diego.videomappoc.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.poc.diego.videomappoc.R;
import com.poc.diego.videomappoc.adapters.PagerAdapter;

public class BaseActivity extends AppCompatActivity {
    public static final boolean DEBUG = true;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }
}
