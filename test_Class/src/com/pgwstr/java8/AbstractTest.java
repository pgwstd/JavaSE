package com.pgwstr.java8;

/**
 * @author pgwstr
 * @date 2022/8/4 3:50 PM
 */

public class AbstractTest {
    public static void main(String[] args) {
//                Student s1 = new Student();   //被abstract修饰过后不能实例化

    }

    abstract class Student {
        int age;
        double weight;
        double height;

        public abstract void sleep();

        public void eat() {
            System.out.println("学生在吃饭");
        }

    }

    // 也可以用abstract来修饰类
    abstract class pople extends Student {
        public void sleep() {
            System.out.println("睡觉");      //父类的方法如果是抽象类的话要重写，

        }
    }
}
