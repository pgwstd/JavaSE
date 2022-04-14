//
// Created by 潘光伟 on 2022/4/15.
//


class Triangle {
    double sideA,sideB,sideC,area,length;
    boolean boo;
    public Triangle(double a,double b,double c) {
        this.sideA=a;
        this.sideB=b;
        this.sideC=c;
        if(a+b>c && a+c>b && b+c>a) {
            boo=true;
        }
        else
        {
            boo=false;
        }
    }
    double getLength() {
        if(boo) {
            length=sideA+sideB+sideC;
            return length;
        }
        else
        {
            System.out.println("这个不是三角形,不能计算周长!!!");
            return 0;
        }
    }
    public double getArea() {
        if(boo) {
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
            return area;   //36
        }
        else {
            System.out.println("不是三角形,不能计算面积!!!");
            return 0;
        }

    }
    public void setABC(double a,double b,double c) {
        this.sideA=a;
        this.sideB=b;
        this.sideC=c;
        if(a+b>c && a+c>b && b+c>a) {
            boo=true;
        }
        else
        {
            boo=false;
        }
    }
}
class Ladder{
    double above,bottom,height,area;
    Ladder(double a,double b,double h){
        this.above=a;
        this.bottom=b;
        this.height=h;
    }
    double getArea() {
        area=(above+bottom)/2*height;
        return area;
    }
}
class Circle{
    double radius,area;
    Circle(double r){
        radius=r;
    }
    double getArea() {
        area=3.14*radius*radius;
        return area;
    }
    double getLength() {
        //getArea方法体的代码，要求计算出length返回
        return 2*3.14*radius;
    }
    void setRadius(double newRadius) {
        radius=newRadius;
    }
    double getRadius() {
        return radius;
    }
}
public class AreaAndLength{


    public static void main(String args[]) {
        double length,area;
        Circle circle=null;
        Triangle triangle=null;
        Ladder ladder=null;
       //创建circle对象,将其半径设置为10
        circle=new Circle(10);
        triangle = new Triangle(3, 4, 5);
        ladder= new Ladder(3, 4, 10);

        length=circle.getLength();
        System.out.println("圆的周长"+length);

        area=circle.getArea();
        System.out.println("圆的面积"+area);

        length=triangle.getLength();
        System.out.println("三角形周长"+length);

        area=triangle.getArea();
        System.out.println("三角形的面积"+length);

        area=ladder.getArea();
        System.out.println("梯形的面积"+area);
        //taiangle调用setABC方法，设置三个边，要求将三个边修改为12，34，1

        triangle.setABC(12,34,1);
        area=triangle.getArea();
        System.out.println("三角形面积"+area);

        length=triangle.getLength();
        System.out.println("三角形周长"+length);
    }
}
