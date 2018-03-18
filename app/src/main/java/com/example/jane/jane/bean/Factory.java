package com.example.jane.jane.bean;

import com.example.jane.jane.R;

import java.util.Random;

/**
 * Created by linmingzi on 2018/3/16.
 */

public class Factory {
    public static final GoodsBean createGoods(int index){
        GoodsBean goodsBean = new GoodsBean();
        goodsBean.setId(System.currentTimeMillis());
        goodsBean.setNum(10);
        goodsBean.setContent("测试商品描述"+index);
        goodsBean.setDes("测试商品详细描述" + index);
        goodsBean.setPrice(new Random().nextDouble());
        goodsBean.setName("测试商品"+ index);
        goodsBean.setIcon(R.mipmap.ic_launcher);

        return goodsBean;
    }

    public static final OrderBean createOrder(long userId, long storeId, long goodsId, int num, String storeName, String goodsName){
        OrderBean orderBean =  new OrderBean(System.currentTimeMillis(), userId,  storeId,  goodsId,  num,  storeName,  goodsName);
        return orderBean;

    }
}
