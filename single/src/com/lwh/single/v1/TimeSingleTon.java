package com.lwh.single.v1;

import java.util.Date;

public class TimeSingleTon {
    public static volatile TimeSingleTon instance = null;

    private TimeSingleTon() {
    }

    /**
     * 单例设计模式 双重锁
     * CPU执行时会装换成JVM指令执行
     *
     * @return
     */
    public static TimeSingleTon getInstance() {
        if (instance == null) {
            synchronized (TimeSingleTon.class) {
                if (instance == null) {
                    instance = new TimeSingleTon();
                }
            }
        }
        return instance;
    }

    public void printTime() {
        System.out.println(new Date().toString());
    }
}
