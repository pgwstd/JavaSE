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
//        if (x >= y && x % y == 0) {
//                valus = x;
//        }
//        else if (x < y && y % x == 0) {
//                valus = y;
//        }
//        else {
//            valus = x * y;
//        }
        int max = (x > y) ? x : y;
        int min = (x > y) ? y : x;
        for (int i = min;i <= x * y;i++){
            if (i % min == 0 && i % max ==0){
                return i;
            }
        }
        return 0;

    }
}