package com.example.jane.jane.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.jane.jane.bean.OrderBean;

import java.util.List;

/**
 * Created by linmingzi on 2018/3/16.
 */

public class OrderAdapter extends BaseQuickAdapter<OrderBean,ViewHodler> {

    public OrderAdapter(int layoutResId, @Nullable List<OrderBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(ViewHodler helper, OrderBean item) {

    }
}
