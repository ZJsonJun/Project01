package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    public HelloWorld() {
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(0,"string");
        method();

    }

    public static void method() {
        Date date = new Date();
    }
}
