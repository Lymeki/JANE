package com.example.jane.jane.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/2/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
        fm.beginTransaction().commitAllowingStateLoss();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mFragments.size() * 100 + position;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Object fragObject = super.instantiateItem(container, position);
        if (fragObject instanceof Fragment) {
            if (mFragments.size() > position) {
                mFragments.set(position, (Fragment) fragObject);
            }
        }
        return fragObject;
    }

    public List<Fragment> getFragments() {
        return mFragments;
    }
}
