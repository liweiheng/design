package com.lwh.observer.guava;

import com.google.common.eventbus.EventBus;


public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
//        GuavaEvent guavaEvent = new GuavaEvent();
//        eventBus.register(guavaEvent);
//        eventBus.post("Tom");
        GTeacher gTeacher=new GTeacher("tom");
        GTeacher mic=new GTeacher("mic");
        eventBus.register(gTeacher);
        eventBus.register(mic);
        Question question = new Question();
        question.setUserName("小红");
        question.setContent("观察者设计模式适用于哪些场景？");
        question.setGperName("gper生态圈");
        eventBus.post(question);


        //从Struts到SpringMVC的升级
        //因为Struts面向的类，而SpringMVC面向的是方法

        //前面两者面向的是类，Guava面向是方法

        //能够轻松落地观察模式的一种解决方案
        //MQ
    }
}
