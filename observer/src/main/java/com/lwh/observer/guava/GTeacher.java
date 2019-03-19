package com.lwh.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 观察者
 */
public class GTeacher {
    private String name;

    public GTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void sucessMsg(Question question ) {
         System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + question.getGperName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
    @Subscribe()
    public void sucessMsg2(Question question ) {
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + question.getGperName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
