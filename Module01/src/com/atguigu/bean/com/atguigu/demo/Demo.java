package com.atguigu.bean.com.atguigu.demo;

import java.util.ArrayList;

/**
 * @author zhangjun
 * @create 2020/9/4 - 20:08
 */
public class Demo {

    public static final String name="zhangjun";

    public static void main(String[] args) {
        System.out.println("zhangjun");

        String[] arr = new String[]{"zhangjun", "zhangxiyuan"};
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("aaaa");
        list.add(1,"aaaa");
        list.add("abc");
        list.add(1,"zhangj");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void method(){
        System.out.println("Demo.method");


    }
}
