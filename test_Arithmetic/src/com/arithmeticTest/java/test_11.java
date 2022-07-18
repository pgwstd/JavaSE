package com.arithmeticTest.java;
import java.util.Scanner;
/*
求最小公倍数
 */
public class test_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int result = getCM(m, n);
        System.out.println(result);
    }


    public static int  getCM(int x, int y) {
        int valus = 0;
        if (x >= y && x % y == 0) {
                valus = x;
        }
        else if (x < y && y % x == 0) {
                valus = y;
        }
        else {
            valus = x * y;
        }
        return valus;

    }
}