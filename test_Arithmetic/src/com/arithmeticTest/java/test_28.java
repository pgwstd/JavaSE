package com.arithmeticTest.java;

/**
 * @author pgwstr
 * @date 2022/8/4 10:50 PM
 */

public class test_28 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }

}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    //write your code here......
    /**
     * @author pgwstr
     * @date 2022/8/4 10:52 PM
     * 单例模式->饿汉式
     */

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
