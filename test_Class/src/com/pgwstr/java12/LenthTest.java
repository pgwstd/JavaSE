package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/9/4 10:10R
 */

public class LenthTest {
    @Test
    public void test() {
        String str = "HelloWorld";
        System.out.println(str.length()); //长度
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));
        System.out.println(str.isEmpty());

        String str2 = str.toLowerCase();
        System.out.println(str);    //还是原来的字符
        System.out.println(str2);   //在方法区新建的字符

        String str3 = " he llo wor ld ";
        String str4 = str3.trim();    //去除头尾的空格
        System.out.println("-------" + str3 + "-------");
        System.out.println("-------" + str4 + "-------");

    }
    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));  //比较是否一样
        System.out.println(s1.equalsIgnoreCase(s2));    //忽略大小写比较是否一样
        String s3 = "abc";
        String s4 = s3.concat("def");   //追加字符串
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("adc");
        String s7 = "adc";
        System.out.println(s5.compareTo(s7));
        System.out.println(s5.compareTo(s6));
    }
}
