package com.example.jane.jane.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FragmentUtils;
import com.example.jane.jane.R;
import com.example.jane.jane.fragment.BaseFragment;

/**
 * Created by linmingzi on 2018/3/16.
 */

public class ComponentActivity extends BaseActivity {

    @Override
    protected View getContentView() {
        return View.inflate(this, R.layout.component_activity,null);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String key = getIntent().getStringExtra("data");
        try {
            FragmentUtils.add(getSupportFragmentManager(),ComponentManager.getFragmentCls(key).newInstance(),R.id.container);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
