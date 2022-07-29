package com.pgwstr.java4;
//人类
public class Person {
    private double weight;
    private double height;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }


    public void eat(){
        System.out.println("人要吃饭");
    }

    public void sleep(){
        System.out.println("人要睡觉");
    }
}
