package test;

/**
 * Created by 潘光伟 on 2022/5/5 18:44.
 */

public class Circle extends Geometry {
    double r;
    Circle(double r) {
        this.r = r;
    }
    //重写 getArea()方法
    @Override
    public double getArea(){
        return 3.14*r*r;
    }
}

