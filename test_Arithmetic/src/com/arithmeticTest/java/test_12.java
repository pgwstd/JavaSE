package com.arithmeticTest.java;
import java.util.Scanner;
/*
键盘输入任意多个10000以内正整数（负数代表结束），求出它们的平均数
 */
public class test_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        double num = 0;
        int count = 0;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n < 0){
                break;
            }
            num += n;
            count++;

        }
        avg = num / count;
        System.out.printf("%.2f",avg);
    }

}
