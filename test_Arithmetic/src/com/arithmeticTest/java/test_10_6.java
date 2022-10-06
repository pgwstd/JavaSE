package com.arithmeticTest.java;

import java.util.Scanner;

/**
 * @author pgwstr
 * @date 2022/10/6 21:48
 * 斐波那契数列实现
 */

public class test_10_6 {

    public int Fibonacci(int x){
        if (x == 1 || x == 2){
            return 1;
        }
        else if (2 < x && x <= 40){
            return Fibonacci(x - 1) + Fibonacci(x - 2);//使用递归
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        test_10_6 t1 = new test_10_6();
        int fibonacci = t1.Fibonacci(in);
        System.out.println(fibonacci);
    }
}
