package com.example.jane.jane.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jane.jane.R;


/**
 * Created by linmingzi on 2018/3/15.
 */

public class BaseActivity extends AppCompatActivity {

    private LinearLayout mRootView;
    private Toolbar mToolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRootView = new LinearLayout(this);
        mRootView.setOrientation(LinearLayout.VERTICAL);

        mToolbar = new Toolbar(this);
        mToolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mRootView.addView(mToolbar,lp);

        mRootView.addView(getContentView());


        setContentView(mRootView);

        //顶部导航的一个阴影效果
        ViewCompat.setElevation(mToolbar,12);
    }


    /**
     * 重写这个方法来设置actvity的布局，一般不用在activity中来写，一般这些操作都在fragment中来实现
     * @return
     */
    protected View getContentView(){
        TextView t = new TextView(this);
        t.setText("JANE");
        return t;
    }


    @Override
    public void setTitle(int titleId) {
//        super.setTitle(titleId);
        mToolbar.setTitle(titleId);
    }

    @Override
    public void setTitle(CharSequence title) {
//        super.setTitle(title);
        mToolbar.setTitle(title);
    }
}
