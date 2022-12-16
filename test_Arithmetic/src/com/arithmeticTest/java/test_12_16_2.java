package com.arithmeticTest.java;
//7254是一个不寻常的数，因为它可以表示为7254 = 39 x 186，这个式子中1~9每个数字正好出现一次
public class test_12_16_2 {
    public static void main(String[] args) {
        int i = 1000;
        int k = 0;
        int l = 0;
        while (i <= 10000){
            if (i == k * l){
                System.out.println(i);
                continue;
            }
            i++;
            k++;
            l++;
        }
    }
}
