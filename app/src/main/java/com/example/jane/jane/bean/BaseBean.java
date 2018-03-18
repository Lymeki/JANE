package com.example.jane.jane.bean;

import java.io.Serializable;

/**
 * Created by linmingzi on 2018/3/15.
 */

public class BaseBean implements Serializable{

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
