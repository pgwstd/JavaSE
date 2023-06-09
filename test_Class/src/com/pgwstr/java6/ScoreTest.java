package com.pgwstr.java6;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author pgwstr
 * @date 2022/8/1 7:00 PM
 */


public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int max = 0;
        char level;
        System.out.println("请输入成绩（以负数代表输入结束）");
        while (scanner.hasNext()){
//            System.out.println("请输入成绩（以负数代表输入结束）");
            int score = scanner.nextInt();
            if (score < 0){
                break;
            }
            if (score > 100){
                System.out.println("输入有误，请重新输入");
                continue;
            }
            v.addElement(score);
            if (max < score){
                max = score;
            }
        }
        for (int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);
            Integer s = (Integer)obj;
            int sc = s.intValue();
            if (max - sc <= 10){
                level = 'A';
            }
            else if (max -sc <= 20){
                level = 'B';
            }
            else if (max - sc <= 30) {
                level = 'C';
            }
            else {
                level = 'D';
            }
            System.out.println("学生号："+ i + "成绩是" + sc + "等级是" + level);
        }
    }
}
