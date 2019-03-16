package com.lwh.strategy;

public class SmsA implements SmsStrategy {
    @Override
    public boolean senMsg(String msg) {
        System.out.println("我是平台A 短信发送成功");
        return true;
    }
}
