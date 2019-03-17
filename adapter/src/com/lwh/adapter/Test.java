package com.lwh.adapter;

import com.lwh.adapter.bean.CommunityBean;

public class Test {
    public static void main(String[] args) {
        UserInfo userInfo=new CommUserInfo();
        userInfo.setAge(15);
        userInfo.setName("李四");
        CommunityBean communityBean = new CommunityBean();
        communityBean.setAddress("福建省静安区");
        communityBean.setcName("安平小区");
        ((CommUserInfo) userInfo).setCommunityBean(communityBean);
        System.out.println(userInfo.toString());
    }
}
