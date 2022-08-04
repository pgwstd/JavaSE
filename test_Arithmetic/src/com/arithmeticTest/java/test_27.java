package com.arithmeticTest.java;
import java.util.Scanner;

/**
 * @author pgwstr
 * @date 2022/8/4 10:30 PM
 */

public class test_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub_27 sub = new Sub_27(x, y);
            System.out.println(sub.sum());
        }
    }

}

class Base_27 {

    private int x;
    private int y;

    public Base_27(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    public final int sum() {
        return getX() + getY();
    }

}

class Sub_27 extends Base_27 {

    public Sub_27(int x, int y) {
        super(x, y);
    }

    //write your code here......
    public int getX() {
        return super.getX() * 10;
    }



}
