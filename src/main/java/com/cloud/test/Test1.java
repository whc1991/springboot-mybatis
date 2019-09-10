package com.cloud.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class Test1 {

    public static void main(String[] args) {

        /*List<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        list.add("b");

        change(list);
        System.out.println("qqqqq : " + list.size());*/

        int a = 1;
        change(a);
        System.out.println("qqqqq : " + a);

        /*StringBuilder stringBuilder = new StringBuilder("a");
        change(stringBuilder);
        System.out.println("qqqqq : " + stringBuilder.toString());*/

    }

    public static void change(List<String> list){

        System.out.println("wwwww : " + list.size());

        list.remove(list.size() -1);

        System.out.println("rrrrr : " + list.size());
    }

    public static void change(int a){

        System.out.println("wwwww : " + a);

        a = 2;

        System.out.println("rrrrr : " + a);
    }

    public static void change(StringBuilder stringBuilder){

        System.out.println("wwwww : " + stringBuilder);

        stringBuilder.append(" b");

        System.out.println("rrrrr : " + stringBuilder.toString());
    }
}
