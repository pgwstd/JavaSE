package com.pgwstr.java4;

public class Test {
    public static void main(String[] args) {
        Person b1 = new Man();
        b1.eat();
        b1.sleep();
        b1.setHeight(185.0);
        b1.setWeight(85.0);
        System.out.println(b1.getWeight());
        System.out.println(b1.getHeight());
        //强制转换调用子类中的方法
        Man m1 = (Man) b1;
        m1.setPlaygame("英雄联盟");
        System.out.println(m1.getPlaygame());
        m1.play();
        m1.work();
        System.out.println("************");
        Person b2 = new Woman();
        b2.setHeight(165.0);
        b2.setWeight(45.0);
        System.out.println(b2.getHeight());
        System.out.println(b2.getWeight());
        b2.eat();
        b2.sleep();
        Woman w2 = (Woman) b2;
        w2.setCook_dinner("做家务");
        w2.setWash_clothes("洗衣服");
        System.out.println(w2.getCook_dinner());
        System.out.println(w2.getWash_clothes());
        System.out.println("***************");
        if (b1 instanceof Woman) {
            Woman w3 = (Woman) b1;
            w3.setWash_clothes("洗衣服");
            System.out.println("女人转换成功");
        }

        if (b1 instanceof Man) {
            Man m2 = (Man) b1;
            m2.play();
            System.out.println("男人转换成功");
        }
    }
}
