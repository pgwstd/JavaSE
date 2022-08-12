package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/10 7:45 PM
 */

public class ThredDemo {
    public static void main(String[] args) {
        odd o1 = new odd();
        even e1 = new even();
        o1.setName("线程一");
        e1.setName("线程二");
        o1.start();
//        e1.start();
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                if (i == 20){
                    try {
                        o1.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        //匿名子类
//        new Thread(){
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println("偶数" + i);
//                    }
//                }
//            }
//        }.start();
//
//
//        new Thread(){
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 != 0) {
//                        System.out.println("奇数" + i);
//                    }
//                }
//            }
//        }.start();
    }



class odd extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            if (i % 20  == 0){
                yield();
            }
        }
    }
}

class even extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}