package edu.yx.day01.demo01.lottery;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LotteryMain {
    public static void main(String[] args) {
        Member member = new Member();
        ArrayList<Member> arrayList = new ArrayList<>();
        Scanner input=new Scanner(System.in);
     while (true) {
         System.out.println("*********幸运抽奖*********");
         System.out.println("1.登录");
         System.out.println("2.注册");
         System.out.println("0.退出系统");

         System.out.println("*********幸运抽奖*********");
         System.out.println("请输入：");
         int num = input.nextInt();
         while (num != 1 && num != 2) {
             System.out.println("你输入的数字有误，请重新输入：");
             num = input.nextInt();
         }
         switch (num) {
             case 1:
                 logIn(arrayList);
                 break;
             case 2:
                 arrayList.add(register());
                 break;
             case 0: break;
         }
     }
    }
    public static void logIn(ArrayList<Member> list){
        Scanner scanner = new Scanner(System.in);
        int flag=0;

        do {
            System.out.println("请输入：用户名");
            String name = scanner.next();
            System.out.println("请输入：密码");
            String password = scanner.next();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name) && list.get(i).getPassword().equals(password)) {
                    System.out.println("***登录成功***");
                    System.out.println("欢迎" + list.get(i).getName()+ "用户   会员编号：" + list.get(i).getId() + "    账户余额：" + list.get(i).getMoney());
                    System.out.println("*********幸运抽奖*********");
                    System.out.println("请输入你的幸运数字开始抽奖");
                    int luckyNum = scanner.nextInt();
                    //抽奖页面
                    flag=luckyLottery(list.get(i));

                }
                if(flag==1)
                {
                    break;
                }
                else {
                    System.out.println("你输入的账户或密码错误，请重新输入");
                    break;
                }

            }
            System.out.println("返回菜单请按0");
        }while (scanner.nextInt()!=0);

    }

    public static Member register(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Member member = new Member();
        System.out.println("请输入：用户名");
        String name = scanner.next();
        System.out.println("请输入：密码");
        String password = scanner.next();
        member.setId(random.nextInt(900)+100);
        member.setName(name);
        member.setPassword(password);
        System.out.println("注册成功：");
        return member;

    }
    public static int luckyLottery(Member member)
    {
        System.out.println("抽奖花费五元");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int grandPrize=500;
        int poolPrize=1;
        int amongPrize=10;
        do {
            member.setMoney(member.getMoney()-5);
            int num = random.nextInt(10000);
            if (num < 9000) {
                if (member.getName().equals("yx")) {
                    System.out.println("恭喜你获得大奖伍百元奖励");
                    member.setMoney(grandPrize + member.getMoney());
                } else {
                    System.out.println("恭喜你获得一元奖励");
                    member.setMoney(poolPrize + member.getMoney());
                }
            } else if (num < 9800) {
                System.out.println("恭喜你获得十元元奖励");
                member.setMoney(amongPrize + member.getMoney());
            } else {
                System.out.println("恭喜你获得伍百元奖励");
                member.setMoney(grandPrize + member.getMoney());
            }
            if(member.getMoney()<5)
            {
                System.out.println("账户余额为："+member.getMoney());
                System.out.println("余额不足请充值");
                break;
            }
            else {
                System.out.println("账户余额为："+member.getMoney());
                System.out.println("输入你的幸运数字,如果退出请输入1");
            }

        }while (member.getMoney()>=5&&scanner.nextInt()!=1) ;
        return 1;
    }
}
