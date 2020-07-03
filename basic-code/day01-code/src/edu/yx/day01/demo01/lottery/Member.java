package edu.yx.day01.demo01.lottery;

public class Member {
     private String name;
    static int count=20;//初始钱为100
    private String password;
    private int id;
    private int money;
    public Member() {
        this.money=count;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

   /* public Member(String name, String password, String id, int money) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.money = count;
    }*/

    public Member(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
