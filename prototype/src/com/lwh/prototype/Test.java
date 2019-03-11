package com.lwh.prototype;

import com.lwh.prototype.deep.Client;
import com.lwh.prototype.deep.ConcretePrototype;
import com.lwh.prototype.simple.PersonPrototype;

public class Test {
    public static void main(String[] args) {
        //简单克隆
        PersonPrototype personPrototype = new PersonPrototype();
        personPrototype.setName("李四");
        personPrototype.setAge(65);
        System.out.println(personPrototype.toString());
        PersonPrototype personPrototype2 = (PersonPrototype) personPrototype.clone();
        System.out.println(personPrototype2.toString());

        System.out.println(personPrototype2 == personPrototype);


        //深度克隆=====================================
        Client client = new Client();
        ConcretePrototype concretePrototypeA = new ConcretePrototype();
        concretePrototypeA.setName("李四");
        concretePrototypeA.setAge(25);
        ConcretePrototype concretePrototypeB = (ConcretePrototype) concretePrototypeA.clone();
        client.show(concretePrototypeA, concretePrototypeB);
    }
}
