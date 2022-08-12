package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/12 3:05 PM
 */

public class ThredTest_2 {
    public static void main(String[] args) {
        test t = new test();
        Thread thread = new Thread(t);
        thread.setName("线程一");
        thread.start();

        Thread thread2 = new Thread(t);
        thread2.setName("线程二");
        thread2.start();
    }
}

class test extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}