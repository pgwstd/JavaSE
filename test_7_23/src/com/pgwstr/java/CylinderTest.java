package com.pgwstr.java;
//计算圆柱的体积
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1.findVolume());


        Cylinder c2 = new Cylinder();
        c2.setRadius(2.0);
        c2.setLength(2.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getLength());
        System.out.println(c2.findVolume());


        Circle c3 = new Circle();
        c3.sleep();

        System.out.println("************");
        //子类重写后验证

        Cylinder c4 = new Cylinder();
        c4.seelp();
        c4.seelpp();
//        c4.findArea();
        System.out.println(c4.findArea());
    }
}
