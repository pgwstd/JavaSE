package com.pgwstr.java6;

/**
 * @author pgwstr
 * @date 2022/8/2 12:01 PM
 */

public class StaticTest {
    public static void main(String[] args) {
        Person.site = "北海";
        Person p = new Person();
        p.name = "张三";
        p.age = 21;
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.site);
    }

    static class Person{
        String name;
        int age;
        static String site;
    }
}
