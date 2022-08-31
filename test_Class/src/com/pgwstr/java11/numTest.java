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

                    /**
                     * @author pgwstr
                     * @date 2022/8/31 20:12
                     * 唤醒该线程
                     */
                    notify();
                    if (number <= 100) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + ":" + number);
                        number++;

                        /**
                         * @author pgwstr
                         * @date 2022/8/31 20:11
                         * 阻塞该线程
                         */
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        break;
                    }
                }
            }


        }


    }
}
