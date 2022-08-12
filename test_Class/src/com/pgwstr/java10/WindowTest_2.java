package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/12 3:11 PM
 */

public class WindowTest_2 {
    public static void main(String[] args) {
        Wind w1 = new Wind();
        Thread thread = new Thread(w1);
        thread.setName("线程一");

        Thread thread2 = new Thread(w1);
        thread2.setName("线程二");

        Thread thread3 = new Thread(w1);
        thread3.setName("线程三");

        thread.start();
        thread2.start();
        thread3.start();
    }
}
class Wind implements Runnable{
    private static  int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "购票成功:" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}