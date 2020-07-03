package edu.yx.day01.demo01;

public class Student extends Person {
    private int age;
    private String name;
    static String room;//教室号，这个变量不属于对象自己，静态成员属于所在的类，所有对象共享
    private int id;//学号
    private static int countId=0;//学号生成器，每当new'了新的对象id++

    public Student() {
       this.id=++countId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id=++countId;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
