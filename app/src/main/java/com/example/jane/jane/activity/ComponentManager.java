package com.example.jane.jane.activity;

import android.app.Activity;
import android.content.Intent;

import com.example.jane.jane.fragment.BaseFragment;
import com.example.jane.jane.fragment.OrderFragment;
import com.example.jane.jane.fragment.StoreDetailFragment;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by linmingzi on 2018/3/16.
 */

public class ComponentManager {


    private static HashMap<String,Class<? extends BaseFragment>> fragmentHashMap = new HashMap<>();

    public static final Class<? extends BaseFragment> getFragmentCls(String key){
        return fragmentHashMap.get(key);
    }


    /**
     *
     * 如果需要新建页面，就先一个fragment,要是列表的就集成RecylerFragment不是的话就集成BaseFragment
     *
     *
     *
     * @param activity
     * @param cls
     */
    public static final void startActvity(Activity activity,Class<? extends BaseFragment> cls){

        Class<? extends BaseFragment> fragmentCls = fragmentHashMap.get(cls.getSimpleName());
        if (fragmentCls == null) {
            fragmentHashMap.put(StoreDetailFragment.class.getSimpleName(),StoreDetailFragment.class);
        }

        Intent intent = new Intent(activity,ComponentActivity.class);
        intent.putExtra("data",StoreDetailFragment.class.getSimpleName());
        activity.startActivity(intent);
    }



}
