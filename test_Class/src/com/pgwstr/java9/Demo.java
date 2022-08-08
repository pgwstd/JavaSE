package com.pgwstr.java9;

/**
 * @author pgwstr
 * @date 2022/8/8 1:09 PM
 */

public class Demo {
   public static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }
        finally {
            System.out.println("A的方法finally");
        }
    }

    public static void  methodB(){
        try {
            System.out.println("进入方法B");
            return;
        }
        finally {
            System.out.println("B的方法finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        methodB();
    }
}
