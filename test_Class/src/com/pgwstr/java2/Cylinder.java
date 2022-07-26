package com.pgwstr.java2;

public class Cylinder extends Crcle{
    private double lenght;

    public Cylinder(){
        lenght = 1;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public double findVolume(){
        return Math.PI * super.getRadius() * super.getRadius() * lenght;
    }

    //计算圆柱的表面积
    public double findArea(){
        return super.findArea() * 2 + super.getRadius() * 2 * lenght ;
    }
}
