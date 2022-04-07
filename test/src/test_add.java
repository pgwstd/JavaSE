//
// Created by 潘光伟 on 2022/4/7.
//


public class test_add {
    public static void main(String[] args) {
        Addtion addtion=new Addtion();
        int p1= (int) addtion.addition(22,6);
        System.out.println(p1);
        long p2= (long) addtion.addition(22,6);
        System.out.println(p2);
        float p3= (float) addtion.addition(22,6);
        System.out.println(p3);
        double p4= (double) addtion.addition(22,6);
        System.out.println(p4);
        String p5= (String)addtion.addition("22","6");
        System.out.println(p5);
    }
}
