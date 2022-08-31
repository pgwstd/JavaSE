package com.pgwstr.java11;

/**
 * @author pgwstr
 * @date 2022/8/31 20:45
 */
//店员
class Clerk {

    private int producCont = 0;

    //生产产品
    public void produceProduct() {
        if (producCont < 20) {
            producCont++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + producCont + "产品");
        } else {
            //等待
//            wait();
        }
    }

    //消费产品
    public void consumeProduct() {
        if (producCont > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + producCont + "产品");
            producCont--;
        } else {
            //等待
//            wait();
        }
    }
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

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始生产");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

/**
 * @author pgwstr
 * @date 2022/8/31 20:48
 */
//消费者
class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始消费");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
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
}