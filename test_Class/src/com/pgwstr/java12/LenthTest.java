package com.pgwstr.java12;

/**
 * @author pgwstr
 * @date 2022/9/4 10:10R
 */

public class LenthTest {
    public static void main(String[] args) {
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
        System.out.println("-------"+str3+"-------");
        System.out.println("-------"+str4+"-------");

    }
}
