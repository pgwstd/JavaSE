package com.arithmeticTest.java;
import java.util.Scanner;
/*
数组的遍历
 */
public class test_16 {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }

        //write your code here......
//        int j = 0;
//        int n = 0;
//        while (j < ary.length){
//            if(ary[j] > ary[j+1]){
//                max = ary[j];
//            }
//            j++;
//        }
//
//        while (n < ary.length){
//            if(ary[n] < ary[n+1]){
//                min = ary[n];
//            }
//            n++;
//        }
        max = ary[0];
        min = ary[0];
        for(int j = 0;j < ary.length;j++){
            if(max < ary[j]){
                max = ary[j];
            }
            if(min > ary[j]){
                min = ary[j];
            }
        }

//        for(int j = 0;j < ary.length - 1;j++){
//            if(ary[j] < ary[j+1]){
//                min = ary[j];
//            }
//        }
        System.out.println(max+" "+min);
    }
    }

