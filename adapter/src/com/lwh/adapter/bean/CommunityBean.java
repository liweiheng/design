package com.lwh.adapter.bean;

/**
 * 小区信息
 */
public class CommunityBean {
    private String cName;
    private String address;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CommunityBean{" +
                "cName='" + cName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
