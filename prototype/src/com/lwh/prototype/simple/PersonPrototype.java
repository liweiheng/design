package com.lwh.prototype.simple;

public class PersonPrototype implements Prototype {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {

        PersonPrototype clone = new PersonPrototype();
        clone.setAge(this.getAge());
        clone.setName(this.getName());
        return clone;
    }

    @Override
    public String toString() {
        return "PersonPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
