package com.lwh.prototype.deep;

public class Client {

    public void show(ConcretePrototype prototypeA, ConcretePrototype prototypeB) {
        prototypeA.show();
        prototypeB.show();
        System.out.println("PrototypeA==PrototypeB? " + (prototypeA == prototypeB ? "true" : "false"));
        System.out.println("PrototypeA.WeelLog==PrototypeB.WeelLog? " + (prototypeA.getWeelLog() == prototypeB.getWeelLog() ? "true" : "false"));

    }
}
