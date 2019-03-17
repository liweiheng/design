package com.lwh.adapter;

import com.lwh.adapter.bean.CommunityBean;

public class CommUserInfo extends UserInfo implements IUserInfo {
    private CommunityBean communityBean;

    public CommunityBean getCommunityBean() {
        return communityBean;
    }

    public void setCommunityBean(CommunityBean communityBean) {
        this.communityBean = communityBean;
    }

    @Override
    public CommunityBean communityInfo() {

        return communityBean;
    }

    @Override
    public String toString() {
        return super.toString()+"------CommUserInfo{}"+communityInfo().toString();
    }
}
