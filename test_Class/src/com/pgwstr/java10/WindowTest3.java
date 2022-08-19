package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/13 9:22 PM
 */

public class WindowTest3 {

    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");
        
        w1.start();
        w2.start();
        w3.start();
    }
}


/**
 * @author pgwstr
 * @date 2022/8/18 11:17 PM
 */

class Window2 extends Thread {
    private static int ticket = 100;

    public void run() {
        while (true) {
            
            show();

        }
    }

   private static synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "购票成功:" + ticket);
            ticket--;
        }
    }

}

