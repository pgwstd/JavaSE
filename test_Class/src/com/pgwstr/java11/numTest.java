package com.pgwstr.java11;

/**
 * @author pgwstr
 * @date 2022/8/31 20:00
 */

public class numTest {
    public static void main(String[] args) {
       Number number = new Number();
       Thread t1 = new Thread(number);
       Thread t2 = new Thread(number);


       t1.setName("主线程");
       t2.setName("副线程");

       t1.start();
       t2.start();


    }

   static class Number implements Runnable {
        private int number = 1;
        private Object obj = new Object();

        public void run() {
            while (true) {
                synchronized (obj) {

                    /**
                     * @author pgwstr
                     * @date 2022/8/31 20:12
                     * 唤醒该线程
                     */
                    obj.notify();
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
                            obj.wait();
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
