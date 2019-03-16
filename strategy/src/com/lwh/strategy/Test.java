package com.lwh.strategy;

public class Test {
    public static void main(String[] args) {
        SmsDispatch dispatch = new SmsDispatch(SmsConfig.SMSA);
        dispatch.sendMsg();
    }
}
