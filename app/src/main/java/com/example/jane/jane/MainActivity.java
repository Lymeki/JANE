package com.example.jane.jane;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.jane.jane.activity.BaseActivity;
import com.example.jane.jane.adapter.ViewPagerAdapter;
import com.example.jane.jane.fragment.HomeFragment;
import com.example.jane.jane.fragment.MyFragment;
import com.example.jane.jane.fragment.OrderFragment;
import com.example.jane.jane.fragment.ShopCarFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private ViewPager mViewPager;
    private BottomNavigationView mBottomNavigationView;
    private List<Fragment> baseFragments = new ArrayList<>();

    private int mCurrentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewPager = findViewById(R.id.viewpgaer);
        mBottomNavigationView = findViewById(R.id.design_bottom_nav);

        //给底部的导航设置个阴影效果
        ViewCompat.setElevation(mBottomNavigationView,12);

        baseFragments.add(new HomeFragment());
        baseFragments.add(new ShopCarFragment());
        baseFragments.add(new OrderFragment());
        baseFragments.add(new MyFragment());

        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),baseFragments));
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        mBottomNavigationView.setSelectedItemId(R.id.nav_home);
                        break;
                    case 1:
                        mBottomNavigationView.setSelectedItemId(R.id.nav_shopcart);
                        break;
                    case 2:
                        mBottomNavigationView.setSelectedItemId(R.id.nav_order);
                        break;
                    case 3:
                        mBottomNavigationView.setSelectedItemId(R.id.nav_my);
                        break;

                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    protected View getContentView() {
        View view = View.inflate(this,R.layout.activity_main,null);
        return view;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_home) {
            mViewPager.setCurrentItem(0);
            setTitle(R.string.home);
            return true;
        }
        if (item.getItemId() == R.id.nav_shopcart) {
            mViewPager.setCurrentItem(1);
            setTitle(R.string.shopcart);
            return true;
        }
        if (item.getItemId() == R.id.nav_order) {
            mViewPager.setCurrentItem(2);
            setTitle(R.string.order);
            return true;
        }
        if (item.getItemId() == R.id.nav_my) {
            mViewPager.setCurrentItem(3);
            setTitle(R.string.my);
            return true;
        }
        return false;
    }
}
