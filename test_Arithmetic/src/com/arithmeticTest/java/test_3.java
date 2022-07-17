package com.arithmeticTest.java;
/*
 * 定义一个int类型变量i,
 * i为由浮点数变量d四舍五入后的整数类型，
 * 请将转换后的i进行输出
 */

import java.util.Scanner;
public class test_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();
        //write your code here......
        int i = 0;
        i = (int)d;
        if((d - (double)i) >= 0.5 ){   //如果相差大于或等于0.5就加上1
            i += 1;
        }
        System.out.println(i);
    }
}
