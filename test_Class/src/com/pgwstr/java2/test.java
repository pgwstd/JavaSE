package com.pgwstr.java2;

public class test {
    public static void main(String[] args) {
        Cylinder b1 = new Cylinder();
        b1.setLenght(2);
        b1.setRadius(2);


        System.out.println(b1.findArea());
        System.out.println(b1.findVolume());

    }
}
