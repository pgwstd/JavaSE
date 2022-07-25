package com.pgwstr.java;

public class Animal {
    private double height;  //身高
    private double weight;  //体重

    //设置身高

    public void setHeight(double height) {
        this.height = height;
    }
    //设置体重
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //返回身高
    public double getHeight() {
        return height;
    }

    //返回体重
    public double getWeight(){
        return weight;
    }

    public void sleep(){
        System.out.println("动物在叫");
    }


    public void func(Animal animal){
        animal.sleep();
    }
}
