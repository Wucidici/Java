package edu.yx.day01.demo01.redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public  void  receive(ArrayList<Integer> list){
        int index=new Random().nextInt(list.size());//随机抽取一个红包
        int delta=list.remove(index);
        super.setMoney(super.getMoney()+delta);

    }
}
