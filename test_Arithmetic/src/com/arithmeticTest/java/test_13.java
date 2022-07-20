package com.arithmeticTest.java;
import java.util.Scanner;
/*
一球从h米高度自由落下，
每次落地后反弹回原高度的一半再落下，
求它在第n次落地时共经过了多少米？
第n次反弹多高？
 */
public class test_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float h = scanner.nextFloat();  //下落的高度
        int n = scanner.nextInt();  //回弹的次数

        double dis = 0;
        for(int i=1;i<=n;i++){
            //高度减半
            h/=2;
            //记录距离相应的变化
            dis += h*3;
        }

        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", dis-h));
    }
}
