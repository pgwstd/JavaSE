package com.pgwstr.java5;

import java.util.Date;

/**
 * @author 潘光伟
 * @date 2022/7/31 9:24 PM
 */

class EqualsTestTest {
    public static void main(String[] args) {
        
        EqualsTest.Customer t1 = new EqualsTest.Customer("Tom", 21);
        EqualsTest.Customer t2 = new EqualsTest.Customer("Tom", 21);
        System.out.println(t1 == t2);//false
        System.out.println(t1.equals(t2));//false-->true
        System.out.println("*************");
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println("************");
        Date d1 = new Date(123323l);
        Date d2 = new Date(123323l);
        System.out.println(d1.equals(d2));//true

    }
}