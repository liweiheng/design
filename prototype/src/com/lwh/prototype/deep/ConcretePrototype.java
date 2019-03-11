package com.lwh.prototype.deep;

public class ConcretePrototype extends Prototype {
    private String name;
    private int age;
    private WeelLog weelLog;

    public ConcretePrototype() {
        weelLog = new WeelLog();
        weelLog.setTime("2019-03-11");
        weelLog.setTitle("周工作总结");
    }

    public WeelLog getWeelLog() {
        return weelLog;
    }

    public void setWeelLog(WeelLog weelLog) {
        this.weelLog = weelLog;
    }

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
        ConcretePrototype prototype = null;
        prototype = (ConcretePrototype) super.clone();
        prototype.setWeelLog((WeelLog) prototype.weelLog.clone());
        return prototype;
    }

    @Override
    public void show() {
        System.out.println(String.format("name=%s,age=%d", name, age));
        System.out.println(weelLog.toString());
    }
}
