package com.arithmeticTest.java;
import java.util.Scanner;
/*
统计输入正数个数
 */
public class test_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.nextInt() != 0){
            count++;
        }
        System.out.println(count);
    }
}
