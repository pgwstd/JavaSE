package com.pgwstr.java11;

/**
 * @author pgwstr
 * @date 2022/8/31 20:45
 */
//店员
class Clerk{

}

/**
 * @author pgwstr
 * @date 2022/8/31 20:48
 */
//生产者
class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
}

/**
 * @author pgwstr
 * @date 2022/8/31 20:48
 */
//消费者
class Consumer extends Thread{
    private  Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }
}
public class PordesTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);//生产者
        p1.setName("生产者");

        Consumer c1 = new Consumer(clerk);//消费者
        c1.setName("消费者");


        p1.start();
        c1.start();
    }
}
