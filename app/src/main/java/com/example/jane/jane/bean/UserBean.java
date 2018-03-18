package com.example.jane.jane.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by linmingzi on 2018/3/15.
 */

public class UserBean extends BaseBean {
    private String telphone;//手机号码
    private String userName;//用户名称
    private String password;//密码
    private String address;//收货地址



    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
