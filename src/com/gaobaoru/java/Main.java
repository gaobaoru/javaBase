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
    //ArrayList的使用,复杂度O(n)
    public static void demoArrayList(){
        List<String> strList = new ArrayList<String>(10);
        for(int i = 0; i < 4; i++){
            strList.add(String.valueOf(i*i));
        }
        print(1,strList);

        List<String> strListB = new ArrayList<>(10);
        for(int i = 0; i < 4; i++){
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1));
        print(4,strList);
        print(5,strList.get(1));
        Collections.reverse(strList);
        print(6,strList);
        Collections.sort(strList);
        print(7,strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8,strList);

        for(String obj : strList){
            print(9, obj);
        }
    }
    //HashMap的使用，非线程安全；HashTable是线程安全的
    public static void demoHashMap(){
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < 4; i++){
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(1,map);

        for(Map.Entry<String, String> entry : map.entrySet()){
            print(2,entry.getKey() + ":" + entry.getValue());
        }

        print(3,map.keySet());
        print(4,map.values());
        print(5,map.get("3"));
        print(6,map.containsKey("A"));
        map.replace("3", "27");
        print(7,map.get("3"));
    }
    //Set的使用
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for(int i = 0; i < 3; i++){
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        print(2,strSet);
        strSet.remove(String.valueOf(1));
        print(3,strSet);
        print(4, strSet.contains(String.valueOf(1)));
        print(5,strSet.isEmpty());
        print(6,strSet.size());
        strSet.addAll(Arrays.asList(new String[]{"A","M","B"}));
        print(7,strSet);
        for(String val : strSet){
            print(8,val);
        }

    }
    public static void main(String[] args) {
        //测试函数
        //demoRandom();
        //demoMath();
        //demoString();
        //demoArrayList();
        //demoHashMap();
        demoSet();
    }
}
