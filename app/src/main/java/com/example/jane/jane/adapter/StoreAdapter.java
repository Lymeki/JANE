package com.example.jane.jane.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.jane.jane.bean.StoreBean;

import java.util.List;

/**
 * Created by linmingzi on 2018/3/16.
 */

public class StoreAdapter extends BaseQuickAdapter<StoreBean,ViewHodler> {

    public StoreAdapter(int layoutResId, @Nullable List<StoreBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(ViewHodler helper, StoreBean item) {

    }
}
