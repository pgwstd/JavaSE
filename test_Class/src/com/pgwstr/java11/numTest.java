package com.pgwstr.java11;

/**
 * @author pgwstr
 * @date 2022/8/31 20:00
 */

public class numTest {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
    }

    class Number implements Runnable {
        private int number = 1;


        public void run() {
            while (true) {
                synchronized (this) {
                    if (number <= 100) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + ":" + number);
                        number++;
                    } else {
                        break;
                    }
                }
            }


        }


    }
}
