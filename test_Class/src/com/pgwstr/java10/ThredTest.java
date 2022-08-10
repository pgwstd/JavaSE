package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/10 5:15 PM
 */

class MyThred extends Thread{
    public void run(){
        for (int i = 0;i < 100;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThredTest{
    public static void main(String[] args) {
        MyThred m = new MyThred();
        m.start();
//        System.out.println("hello");
        for (int i = 0;i < 100;i++){
                System.out.println(i+"hello");
            }
    }
}