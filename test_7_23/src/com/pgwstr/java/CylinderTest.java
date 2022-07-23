package com.pgwstr.java;
import java.util.Scanner;
//计算圆柱的体积
public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cylinder c1 = new Cylinder();
        System.out.println(c1.findVolume());


        Cylinder c2 = new Cylinder();
        c2.setRadius(2.0);
        c2.setLength(2.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getLength());
        System.out.println(c2.findVolume());
    }
}
