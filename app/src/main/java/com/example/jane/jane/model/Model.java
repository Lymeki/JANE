package com.example.jane.jane.model;

import android.content.Context;

import com.example.jane.jane.R;
import com.example.jane.jane.bean.Factory;
import com.example.jane.jane.bean.GoodsBean;
import com.example.jane.jane.bean.OrderBean;
import com.example.jane.jane.bean.StoreBean;
import com.example.jane.jane.cache.ACache;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by linmingzi on 2018/3/15.
 */

public class Model {
    public static ArrayList<StoreBean> storeBeans;


    static {
        //初始化默认的商家
        storeBeans = new ArrayList<>();
        StoreBean store1 = new StoreBean();
        store1.setId(System.currentTimeMillis());//使用当前时间戳作为ID
        store1.setIconRes(R.mipmap.ic_launcher);
        store1.setDes("测试商家1");
        store1.setName("商家名称1");
        store1.addGoods(Factory.createGoods(1));
        store1.addGoods(Factory.createGoods(2));
        store1.addGoods(Factory.createGoods(3));
        store1.addGoods(Factory.createGoods(1));
        storeBeans.add(store1);

        StoreBean store2 = new StoreBean();
        store2.setId(System.currentTimeMillis());//使用当前时间戳作为ID
        store2.setIconRes(R.mipmap.ic_launcher);
        store2.setDes("测试商家1");
        store2.setName("商家名称1");
        store2.addGoods(Factory.createGoods(1));
        store2.addGoods(Factory.createGoods(2));
        store2.addGoods(Factory.createGoods(3));
        store2.addGoods(Factory.createGoods(1));
        storeBeans.add(store2);


    }


    /**
     * 获取商家
     *
     * @return
     */
    public static final ArrayList<StoreBean> getStores() {
        return storeBeans;
    }


    /**
     * 生成订单并保存在本地
     *
     * @param context
     * @param userId
     * @param storeId
     * @param goodsId
     * @param num
     * @param storeName
     * @param goodsName
     * @throws JSONException
     */
    public static final void createOrder(Context context, long userId, long storeId, long goodsId, int num, String storeName, String goodsName) throws JSONException {
        OrderBean bean = Factory.createOrder(userId, storeId, goodsId, num, storeName, goodsName);
        ACache aCache = ACache.get(context);
        JSONArray array = aCache.getAsJSONArray(OrderBean.class.getSimpleName());
        if (array == null) {
            array = new JSONArray();
        }

        JSONObject order = new JSONObject();
        order.put("userId", userId);
        order.put("storeId", storeId);
        order.put("goodsId", goodsId);
        order.put("num", num);
        order.put("storeName", storeName);
        order.put("goodsName", goodsName);
        array.put(order);

        aCache.put(OrderBean.class.getSimpleName(), array);
    }

    /**
     * 获取收藏商家列表
     *
     * @param context
     * @param userId
     * @return
     */
    public static final JSONArray  getLoveStores(Context context,long userId){
        ACache aCache = ACache.get(context);
        JSONArray array = aCache.getAsJSONArray(String.valueOf(userId));
        return array;
    }

    /**
     *
     * @param context
     * @param userId
     * @param storeId
     */
    public static final void addLoveStore(Context context,long userId,long storeId){
        ACache aCache = ACache.get(context);
        JSONArray array = aCache.getAsJSONArray(String.valueOf(userId));
        if (array ==  null) {
            array.put(storeId);
        }
        aCache.put(String.valueOf(userId),array);
    }

    public static final boolean deleteLoveStore(Context context,long userId,long storeId) throws JSONException {
        ACache aCache = ACache.get(context);
        JSONArray array = aCache.getAsJSONArray(String.valueOf(userId));
        if (array == null || array.length() == 0) {
            return false;
        }
        for (int i = 0; i < array.length(); i++) {
            if (Long.compare(storeId,array.getLong(i)) == 0) {
                array.remove(i);
            }
        }

        aCache.put(String.valueOf(userId),array);
        return true;
    }
}
