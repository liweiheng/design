package com.lwh.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 事件分发类
 */
public class SmsDispatch {
    private final static Map<String, SmsStrategy> CACHE = new HashMap<>();
    ;

    static {
        CACHE.put(SmsConfig.SMSA, new SmsA());
        CACHE.put(SmsConfig.SMSB, new SmsB());
        CACHE.put(SmsConfig.DEFAULT, new SmsDefault());

    }

    private String cmd;

    public SmsDispatch(String cmd) {
        this.cmd = cmd;
    }

    private SmsStrategy getSms(String cmd) {
        SmsStrategy smsStrategy = CACHE.get(cmd);
        return smsStrategy == null ? CACHE.get(SmsConfig.DEFAULT) : smsStrategy;
    }

    public void sendMsg() {
        getSms(cmd).senMsg("");
    }

}
