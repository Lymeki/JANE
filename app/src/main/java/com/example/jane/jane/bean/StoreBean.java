package com.example.jane.jane.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linmingzi on 2018/3/15.
 */

public class StoreBean extends BaseBean {
    private String name;
    private String des;
    private int iconRes;

    public int getIconRes() {
        return iconRes;
    }

    public void setIconRes(int iconRes) {
        this.iconRes = iconRes;
    }

    private ArrayList<GoodsBean> goodsBeans = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    public ArrayList<GoodsBean> getGoodsBeans() {
        return goodsBeans;
    }

    public void setGoodsBeans(ArrayList<GoodsBean> goodsBeans) {
        this.goodsBeans = goodsBeans;
    }

    public void addGoods(GoodsBean goodsBean){
        this.getGoodsBeans().add(goodsBean);
    }
}
