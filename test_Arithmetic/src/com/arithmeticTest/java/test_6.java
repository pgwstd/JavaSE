package com.arithmeticTest.java;
import java.util.Scanner;
/**
 * 判断体重指数
 */
public class test_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        scanner.close();  //扫描键盘输入的内容
        double value = weight / (height * height);
        if (value < 18.5){
            System.out.println("偏瘦");
        }
        else if (value >= 18.5 && value < 20.9){
            System.out.println("苗条");
        }
        else if (value >= 20.9 && value <= 24.9) {
            System.out.println("适中");
        }
        else {
            System.out.println("偏胖");
        }
    }
}
