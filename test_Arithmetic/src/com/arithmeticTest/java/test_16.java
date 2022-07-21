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

        System.out.println(max+" "+min);
    }
    }

