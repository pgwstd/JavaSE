package com.arithmeticTest.java;
import java.util.Scanner;
public class test_23 {


        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String className = scanner.next();
                // print就是需要你定义的方法
                print(className);
            }
        }

        //write your code here......
        public static void print(Object obj){

            System.out.println(obj);
        }

    }

    class First {
        public String toString() {
            return "First";
        }
    }

    class Second {
        public String toString() {
            return "Second";
        }
    }

    class Third {
        public String toString() {
            return "Third";
        }
    }

