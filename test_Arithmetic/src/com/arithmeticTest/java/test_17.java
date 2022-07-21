package com.arithmeticTest.java;
import java.util.Arrays;
import java.util.Scanner;
/*
数组倒转
 */
public class test_17 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //write your code here......
        int[] tmp = new int[6];
        int k = 0;
        for (int j = arr.length - 1;j >= 0;j--){
                tmp[k++] = arr[j];
        }
        for (int n = 0;n < tmp.length;n++){
            arr[n] = tmp[n];
        }
        System.out.println(Arrays.toString(arr));
    }
    }

