package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/9/3 20:47
 */

public class StringTest {


    @Test
    public void test(){
        String s1 = "abc";
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("*************");
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("*************");

    }
    @Test
    public void test2(){
        String s1 = "javaee";
        String s2 = "javaee";

        String s3 = new String("javaee");
        String s4 = new String("javaee");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        System.out.println("*************");
        Per p1 = new Per("tom",21);
        Per p2 = new Per("tom",21);
        System.out.println(p1 == p2);
        System.out.println(p1.name.equals(p2.name));

    }

    @Test
    public void test3(){
        String s1 = "javaee";
        String s2 = "hhh";

        String s3 = "javaeehhh";
        String s4 = "javaee" + "hhh";
        String s5 = s1 + "hhh";
        String s6 = "javaee" + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);

        String s7 = s5.intern();
        System.out.println(s7 == s3);
    }
}
