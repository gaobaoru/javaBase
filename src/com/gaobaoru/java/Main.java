package com.gaobaoru.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Java Random，Math，String类相关成员函数的使用，ArrayList，Set，HashMap等各种容器类的使用。
 */
public class Main {

    public static void print(int index, Object object){
        System.out.println(String.format("[%d], %s", index, object.toString()));
    }
    //Random函数的使用
    public static void demoRandom(){
        Random random = new Random();
        //random.setSeed(1);
        print(1, random.nextInt(1000));
        print(2, random.nextFloat());

        List<Integer> arrays = Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(arrays);
        print(3,arrays);

        Date date = new Date();
        print(4,date);
        print(5,date.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(6,df.format(date));

    }
    //Math函数的使用
    public static void demoMath(){
        print(1,Math.log(10));
        print(2,Math.min(3.5, 3.4));
        print(3,Math.ceil(3.4));//向上取整
        print(4,Math.floor(3.4));
        print(5,Math.sqrt(16));
    }
    //String函数的使用
    public static void demoString(){
        String str = "Hello World";
        print(1,str.indexOf('e'));
        print(2,str.indexOf('x'));
        print(3,str.charAt(1));
        print(4,str.codePointAt(1));//97+4
        print(5,str.compareToIgnoreCase("HELLO WORLD"));
        print(6,str.compareTo("Hello Vorld"));
        print(7,str.compareTo("Hello Xorld"));
        print(8,str.contains("Hello"));
        print(9,str.concat("!!!"));
        print(10,str.toUpperCase());
        print(11,str.endsWith("World"));
        print(12,str.startsWith("Hello"));
        print(13,str.replace('o', 'e'));
        print(14,str.replaceAll("o|l", "a"));
        print(15,str.replaceAll("Hello","Hi"));

        StringBuilder sb = new StringBuilder();//线程非安全
        sb.append("x ");
        sb.append(2.4);
        sb.append("e");
        sb.append(false);
        sb.append(2);
        print(16,sb.toString());

    }
    public static void main(String[] args) {
        //测试函数
        //demoRandom();
        //demoMath();
        demoString();
    }
}
