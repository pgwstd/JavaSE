//方法重载练习
package com.workTest.java;
import java.util.Scanner;
public class test_7_16 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          scanner.close();  //扫描两个数
          test_7_16 p = new test_7_16();  //新建一个调用
          System.out.println(p.Sum(a,b));

    }


    //以下都是方法重载
    public int Sum(int x,int y) {
        return x+y;
    }

    public double Sum(double x,int y) {
        return x + y;
    }

    public String Sum(String x,String y){
        return x+y;
    }
}