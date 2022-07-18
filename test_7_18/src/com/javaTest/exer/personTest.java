package com.javaTest.exer;

public class personTest {
    public static void main(String[] args) {
        person p = new person();
        p.setAge(12);
        System.out.println(p.getAge());
        System.out.println();
        person l = new person();
        System.out.println(l.getAge());
    }
}
