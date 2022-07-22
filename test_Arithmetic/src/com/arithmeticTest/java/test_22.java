package com.arithmeticTest.java;
import java.util.Scanner;
/*
重写计算逻辑
 */
public class test_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Subb sub = new Subb(x, y);
            sub.calculate();
        }
    }

}

 class Basee {

    private int x;
    private int y;

    public Basee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void calculate() {
        System.out.println(getX() * getY());
    }

}

class Subb extends Base {

    //write your code here......
    public Subb(int x, int y){
        super(x,y);
    }

    //write your code here......
    public void calculate(){
        if(super.getY()==0){
            System.out.println("Error");
        }else {
            System.out.println(super.getX()/super.getY());
        }
    }
}

