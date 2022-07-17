package com.arithmeticTest.java;
import java.util.Scanner;
/**
 * 邮箱验证
 */
public class test_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        if (str.matches(emailMatcher)){
            System.out.println("邮箱合法");
        }
        else {
            System.out.println("邮箱不合法");
        }
    }
}
