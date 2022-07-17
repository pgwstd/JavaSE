package com.arithmeticTest.java;
/*
数列求和
 */
public class test_9 {
    public static void main(String[] args) {
        long sum = 0;
        long i = 9;
        while (i <= 9999999999L){
            sum += i;
            i = (i * 10)+9;
        }

        System.out.println(sum);
    }
}
