package com.lwh.strategy;

public class SmsDefault implements SmsStrategy {
    @Override
    public boolean senMsg(String msg) {
        System.out.println("我是默认平台 短信发送成功");
        return false;
    }
}
