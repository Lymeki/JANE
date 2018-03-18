package com.example.jane.jane.bean;

/**
 * Created by linmingzi on 2018/3/15.
 */

public class OrderBean extends BaseBean {
    private long userId;
    private long storeId;
    private long goodsId;

    private int num;
    private String storeName;
    private String goodsName;

    public OrderBean() {
    }

    public OrderBean(long id, long userId, long storeId, long goodsId, int num, String storeName, String goodsName) {
        setId(id);
        this.userId = userId;
        this.storeId = storeId;
        this.goodsId = goodsId;
        this.num = num;
        this.storeName = storeName;
        this.goodsName = goodsName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
