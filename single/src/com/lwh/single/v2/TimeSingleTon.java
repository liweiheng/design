package com.lwh.single.v2;

import java.util.Date;

/**
 * 单例设计模式 静态内部类
 */
public class TimeSingleTon {

    /**
     * 单例设计模式 懒汉设计模式
     * <p>
     * 应为静态内部类先执行 速度最快 性能最优写法
     * jvm底层执行逻辑，完美的避免了线程调用的问题
     *
     * @return
     */
    public static TimeSingleTon getInstance() {
        return TimeHolder.SINGLETON;

    }

    private TimeSingleTon() {
        if (TimeHolder.SINGLETON != null) {
            throw new RuntimeException("麻蛋，你不可以创建多个实例！！");
        }
    }
    //重写这个方法 只不过是覆盖了反序列化出来的对象 还是创建了两次，
    // 发生在jvm层面，相对来说还是比较安全
    //之前反序列化出来的对象会被GC回收
//    private Object readResolve() {
//        return SINGLETON;
//    }
    public void printTime(){
        System.out.println(new Date().toString());
    }
    private static class TimeHolder {
        private static final TimeSingleTon SINGLETON = new TimeSingleTon();

    }
}
