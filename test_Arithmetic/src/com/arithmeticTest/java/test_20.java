package com.arithmeticTest.java;
import java.util.Scanner;
/*
验证年龄
 */
public class test_20 {

        public static void main(String[] args) {
            Person p = new Person();
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                p.setAge(age);
                System.out.println(p.getAge());
            }
        }

    }

    class Person {

        private int age;

        //write your code here......
        public void setAge(int age){
            this.age = age;

        }

        public int getAge(){
            if(age > 0 && age  <= 200){
                return age;
            } else if (age > 200) {
                return 200;
            }
            else {
                return 0;
            }
        }
    }

