package com.arithmeticTest.java;

/**
 * @author pgwstr
 * @date 2022/8/4 10:17 PM
 */
import java.util.Scanner;
public class test_25 {


        public static void main(String[] args) {
            // Sub是需要你定义的子类
            Base_25 base = new Sub_25();

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                base.setX(x);
                base.setY(y);
                System.out.println(base.calculate());
            }
        }

    }

    abstract class Base_25 {

        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int calculate() {
            if (avg() == 0) {
                return 0;
            } else {
                return sum() / avg();
            }
        }

        /**
         * 返回x和y的和
         */
        public abstract int sum();

        /**
         * 返回x和y的平均值
         */
        public abstract int avg();

    }

    class Sub_25 extends Base_25 {

        //write your code here......
        public Sub_25(){
            super();
        }
        public  int sum(){
            return super.getX()+super.getY();
        }

        @Override
        public int avg() {
            return (getX() + getY()) / 2;
        }
    }

