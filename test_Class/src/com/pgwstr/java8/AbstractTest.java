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


    //设计模式(单例模式)
    //饿汉式
    static class Count {
        private int age;
        private double weight;
        private double height;

        public Count() {

        }

        private static Count instance = new Count();

        public static Count getInstance(){
            return instance;
        }
    }


    //懒汉式
    static class Num{
        private int age;
        private double weight;
        private double height;

        public Num(){

        }

        private static Num instace = null;
        public static  Num getInstance(){
            if (instace == null){
                instace = new Num();
            }
            return instace;
        }
    }
}
