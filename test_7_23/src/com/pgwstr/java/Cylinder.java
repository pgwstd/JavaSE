package com.pgwstr.java;

public class Cylinder extends Circle{
    private double length;      //圆柱的长度属性

    public Cylinder(){      //将length属性初始化为1的构造方法
        length = 1;
    }

    public void setLength(double length){       //设置length长度的方法
        this.length = length;
    }

    public double getLength(){      //返回length长度的方法
        return length;
    }

    public double findVolume(){
        return length * findArea();
    }
}
