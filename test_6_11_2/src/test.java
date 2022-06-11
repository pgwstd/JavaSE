/**
 * Created by 潘光伟 on 2022/6/11 17:16.
 */
//实现多线程
    //编写一个JAVA应用程序，要求有张三、李四、王五3个线程，张三说“我要打游戏”，然后准备睡30分钟再学习；李四说“我要看电影”， 然后准备睡60分钟再学习；王五说“不如跳舞”，然后吵醒休眠的线程张三、李四，说“运动一小时，学习一百分”。
public class test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我要打游戏");
                try {
                    Thread.sleep(30 * 60 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我要学习");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我要看电影");
                try {
                    Thread.sleep(60 * 60 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我要学习");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("不如跳舞");
                try {
                    Thread.sleep(30 * 60 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我要学习");
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
