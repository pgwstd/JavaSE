/**
 * Created by 潘光伟 on 2022/6/11 17:16.
 */
//实现多线程
    //编写一个JAVA应用程序，要求有张三、李四、王五3个线程，张三说“我要打游戏”，然后准备睡30分钟再学习；李四说“我要看电影”， 然后准备睡60分钟再学习；王五说“不如跳舞”，然后吵醒休眠的线程张三、李四，说“运动一小时，学习一百分”。

public class test {
    public static void main(String[] args) {
        ClassStudent cs = new ClassStudent();
        cs.name1.start();
        cs.name2.start();
        cs.name3.start();
    }
}
class ClassStudent implements Runnable {

    Thread name1,name2,name3;
    ClassStudent() {
        name1 = new Thread(this);
        name2 = new Thread(this);
        name3 = new Thread(this);
        name1.setName("张三");
        name2.setName("李四");
        name3.setName("王五");
    }
    @Override
    public void run() {
        if (Thread.currentThread() == name1) {
            try {
                System.out.println(name1.getName()+"打完游戏睡30分钟再起来学习");
                Thread.sleep(1000*60*30);
            } catch (InterruptedException e) {
                System.out.println(name1.getName()+"被"+name3.getName()+"吵醒了");
            }
            System.out.println(name1.getName()+"说运动一小时，学习一百分");
        }else if (Thread.currentThread() == name3){
            System.out.println(name3.getName()+"说不如跳舞");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            name1.interrupt();
        }
        if (Thread.currentThread() == name2) {
            try {
                System.out.println(name2.getName()+"看完电影睡60分钟再起来学习");
                Thread.sleep(1000*60*60);
            } catch (InterruptedException e) {
                System.out.println(name2.getName()+"被"+name3.getName()+"吵醒了");
            }
            System.out.println(name2.getName()+"说运动一小时，学习一百分");
        }else if (Thread.currentThread() == name3){
            System.out.println(name3.getName()+"说不如跳舞");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            name2.interrupt();
        }
    }
}

