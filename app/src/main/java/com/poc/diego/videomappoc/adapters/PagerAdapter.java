package com.poc.diego.videomappoc.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.poc.diego.videomappoc.fragments.CameraFragment;
import com.poc.diego.videomappoc.fragments.MapFragment;

import java.util.LinkedList;

/**
 * Created by Diego on 3/22/2017.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private LinkedList<Fragment> fragments;

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        fragments = new LinkedList<>();
        fragments.add(new CameraFragment());
        fragments.add(new MapFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

