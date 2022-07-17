package com.arithmeticTest.java;
import java.util.Scanner;
/**
 * 判断学生成绩等级
 *
 */
public class test_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();

        if (grade.equals("A")){
            System.out.println("优秀");
        }
        else if (grade.equals("B")){
            System.out.println("良好");
        }
        else if (grade.equals("C")){
            System.out.println("及格");
        }
        else if (grade.equals("D")){
            System.out.println("不及格");
        }
        else{
            System.out.println("未知等级");
        }

    }
}
