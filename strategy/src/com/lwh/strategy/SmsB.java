package com.lwh.strategy;

public class SmsB implements SmsStrategy {
    @Override
    public boolean senMsg(String msg) {
        System.out.println("我是平台B 短信发送成功");
        return true;
    }
}
