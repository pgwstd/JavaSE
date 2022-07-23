package com.pgwstr.java;

public class Circle {
    private double radius;  //圆的半径

    public Circle(){        //构造方法，圆的半径默认设为1
        radius = 1.0;
    }

    public void setRadius(double radius){       //设置圆的半径方法
        this.radius = radius;
    }

    public double getRadius(){      //返回圆的半径方法
        return radius;
    }

    public double findArea(){       //计算圆的面积方法
        return Math.PI * radius * radius;
    }

    public void sleep(){
        System.out.println("学生在睡觉");
    }
}
