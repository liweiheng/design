package com.lwh.observer.guava;

import com.google.common.eventbus.Subscribe;


public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }

    @Subscribe
    public void publishQuestion(Question question) {
        System.out.println("来一个看开开" + question.toString());
    }

}
