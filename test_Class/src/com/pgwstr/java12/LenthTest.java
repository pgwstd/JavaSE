package com.pgwstr.java12;

/**
 * @author pgwstr
 * @date 2022/9/4 10:10
 */

public class LenthTest {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.length()); //长度
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));
        System.out.println(str.isEmpty());
        String str2 = str.toLowerCase();
        System.out.println(str);
        System.out.println(str2);
    }
}
