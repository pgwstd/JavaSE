package com.pgwstr.java2;

public class Crcle {
    private double radius;

    //构造器，将radius的属性初始化为1
    public Crcle(){
        radius = 1;
    }

    //设置圆的半径
    public void setRadius(double radius){
        this.radius = radius;
    }

    //返回圆的半径
    public double getRadius() {
        return radius;
    }

    //计算圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
