package com.pgwstr.java11;

/**
 * @author pgwstr
 * @date 2022/8/31 20:45
 */
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

    }
}
