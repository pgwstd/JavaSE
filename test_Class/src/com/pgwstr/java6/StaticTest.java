package com.pgwstr.java6;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/8/2 12:01 PM
 */

public class StaticTest {
    @Test
    public void test_2(){

//        Person.age = 21;
        Person p1 = new Person();
        p1.age = 21;
        p1.site = "南宁";
        System.out.println(p1.site);
        p1.site = "玉林";
        System.out.println(p1.site);
        Person p2 = new Person();
        System.out.println(p2.site);
    }


    @Test
    public  void test_1() {
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
