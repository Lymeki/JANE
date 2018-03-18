package com.example.jane.jane.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.jane.jane.R;
import com.example.jane.jane.activity.ComponentManager;
import com.example.jane.jane.adapter.StoreAdapter;
import com.example.jane.jane.model.Model;

/**
 * Created by linmingzi on 2018/3/16.
 */

public class HomeFragment extends RecylerFragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        StoreAdapter storeAdapter = new StoreAdapter(R.layout.store_recycler_item, Model.getStores());
        setAdapter(storeAdapter);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        super.onItemClick(adapter, view, position);

        ComponentManager.startActvity(getActivity(),StoreDetailFragment.class);
    }
}
