package edu.yx.day01.demo01.redpacket;

import java.util.ArrayList;
import java.util.Scanner;

public class RedPacket {
    public static void main(String[] args) {
        Manger manger = new Manger("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        ArrayList<Member> list=new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============");
        while (manger.getMoney()>0) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入要发的红包:");
            int sendMoney=sc.nextInt();
            ArrayList<Integer> redList = manger.send(sendMoney, 3);
            manger.show();
            if(redList.size()==0)
                continue;
            for (int i = 0; i < list.size(); i++) {
                list.get(i).receive(redList);
                list.get(i).show();
            }
        }
    }
}
