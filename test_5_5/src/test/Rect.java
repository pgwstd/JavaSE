package test;

/**
 * Created by 潘光伟 on 2022/5/5 18:42.
 */
public  class Rect extends Geometry {
        double a,b;
        Rect(double a,double b) {
            this.a = a;
            this.b = b;
        }

        //重写 getArea()方法
       @Override
        public double getArea() {
            return a*b;
        }
    }

