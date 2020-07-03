package edu.yx.day01.demo01;

public class Person {
    private int age;
    private String name;
    public Person(){
        System.out.println("这是无参构造方法，以防有参构造，Java不赠送构造");
    }
    public Person(String name,int age)
    {
        this.age=age;
        this.name=name;
        System.out.printf("全参构造");
    }
}
