package com.pgwstr.java11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author pgwstr
 * @date 2022/9/1 22:54
 */
class Num implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new Num());
        service.shutdown();
    }
}
