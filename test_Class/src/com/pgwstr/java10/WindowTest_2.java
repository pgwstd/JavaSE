package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/12 3:11 PM
 */

public class WindowTest_2 {
    public static void main(String[] args) {
        Wind w1 = new Wind();
        Thread thread = new Thread(w1);
        thread.setName("窗口一");

        Thread thread2 = new Thread(w1);
        thread2.setName("窗口二");

        Thread thread3 = new Thread(w1);
        thread3.setName("窗口三");

        thread.start();
        thread2.start();
        thread3.start();
        thread2.stop();
    }
}

class Wind implements Runnable {
    private static int ticket = 100;
//    Object obj = new Object();

    public void run() {
        while (true) {
//            synchronized (this) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "购票成功:" + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }

            show();
        }

    }

    private synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "购票成功:" + ticket);
            ticket--;
        }
    }
}