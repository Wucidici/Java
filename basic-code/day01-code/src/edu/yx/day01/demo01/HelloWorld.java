package edu.yx.day01.demo01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        /*int[] a=new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
           a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }*/

        System.out.println("Hello,World!df");
        System.out.println("Hello,World!daf");
        System.out.println("Hello,World!dfag");
        int[] arryA = new int[50];
        String variables[] = new String[50000];
        /*for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
            System.out.println(variables[i]);
        }*/

//        method1();
//        guessGame();
//        arrayListDemo();
//        arrayListDemo01();

        /*ArrayList<Integer> bigList = new ArrayList<>();
        Random bigr = new Random();
        System.out.printf("随机20个数：");
        for (int i = 0; i < 20; i++) {
            bigList.add(bigr.nextInt(100) + 1);
        }
        System.out.println(bigList);
        System.out.printf("其中偶数有：");
        System.out.println(getSmallList(bigList));*/
        char[] chars = "Hello".toCharArray();
        char[] chars1 = "HelloWorld".toCharArray();//拆分为字节数组并作为返回值
        byte[] bytes = "abc".getBytes();//转化为底层的字节数组
        //字符串替换
        String replace = "I Love You".replace("o", "x");
        //字符串切分,是正则表达式 “.”得用“\\.”
        String[] split = "a,b,v,d,e,d".split(",");
        System.out.println(split[1]);

        stringCount();


    }

    public static void method1() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("nihao" + i);

        }
    }

    public static void guessGame() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int ran = r.nextInt(10000);
        boolean f = false;
        int guessNum = 0;
        int i;
        for (i = 0; i < 10000; i++) {

            guessNum = r.nextInt(10000);
            System.out.println("请输入你猜测的数字：" + guessNum);
            if (ran == guessNum) {
                f = true;
                break;
            } else if (ran > guessNum)
                System.out.println("小了");
            else
                System.out.println("大了");
        }
        if (f)
            System.out.println("猜测正确使用次数;" + i);
        else
            System.out.println("次数用完失败");
    }

    public static void arrayListDemo() {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        System.out.println(list.size());/*长度*/
        System.out.printf(list.get(0));//获取值
        list.remove(0);
        System.out.println(list.size());

    }

    public static void arrayListDemo01() {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student(32, "tombulibu");
        Student two = new Student(32, "wucidici");
        Student three = new Student(32, "makabaka");
        Student four = new Student(32, "yigubigu");
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("年龄" + stu.getAge() + "名字" + stu.getName());

        }

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                list1.add(list.get(i));
        }
        return list1;
    }

    public static void stringCount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String input=sc.next();
        char [] array=input.toCharArray();//拆分成字节数组
        char ch;
        int countUper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        for (int i = 0; i < array.length; i++) {
            ch=array[i];
            if(ch>='A'&&ch<='Z')
                countUper++;
            else if(ch>='a'&&ch<='z')
                countLower++;
            else if(ch>='0'&&ch<='9')
                countNumber++;
            else
                countOther++;

        }
        System.out.println("大写字母："+countUper+"小写字母："+countLower+"数字："+countNumber+"其他字符："+countOther);
        Arrays.sort(array);//排序
        System.out.println(Arrays.toString(array));//转化为字符串
    }
    //作死调用
    /*public static void get1(){
        System.out.println("我要调用2");
        get2();
    }
    public static void get2(){
        System.out.println("我要调用3");
        get3();
    }public static void get3(){
        System.out.println("我要调用1");
        get1();
    }*/

}
