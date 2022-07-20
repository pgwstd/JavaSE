package com.arithmeticTest.java;
import java.util.Scanner;
/*
判断质数
 */
public class test_14 {
    public static void main(String[] args) {
        test_14 main = new test_14();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(main.isPrimeNumber(number));
    }

    public Boolean isPrimeNumber(int number) {

        //write your code here......
        for(int i = 2;i < Math.sqrt(number);i++){  //如果是能这个值的中间有能被它整除的就不是质数
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
