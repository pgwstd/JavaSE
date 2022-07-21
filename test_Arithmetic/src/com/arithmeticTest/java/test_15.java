package com.arithmeticTest.java;
import java.util.Scanner;
/*
计算整数位数
 */
public class test_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int count = 0;
        while (num != 0){
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
