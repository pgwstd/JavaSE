package com.pgwstr.java5;

/**
 * @author 潘光伟
 * @date 2022/7/30 6:43 PM
 */

public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        char c = 10;
        double d = 10;
        System.out.println(i == c);
        System.out.println(i == d);
        System.out.println(c == d);

        Customer t1 = new Customer("Tom",21);
        Customer t2 = new Customer("Tom",21);
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println("*************");
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
static class  Customer{
        private String name;
        private int age;
        public Customer(){

        }
        public Customer(String name,int age){
            this.name = name;
            this.age = age;
        }
}
}
