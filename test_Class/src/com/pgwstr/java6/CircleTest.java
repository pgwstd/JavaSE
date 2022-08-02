package com.pgwstr.java6;

/**
 * @author pgwstr
 * @date 2022/8/2 9:04 PM
 */

public class CircleTest {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle(3.1);
        System.out.println(c1.findR());
        System.out.println(c1.id);
        System.out.println(c2.findR());
        System.out.println(c2.id);
        System.out.println(circle.getCout());
    }
  static   class circle{
        public static int id = 1001;
        private double r;
        private static int cout;

        public  circle(){
            r = 1.0;
            id = id++;
            cout++;

        }
        public circle(double r){
            this();
            this.r = r;
        }

      public double getR() {
          return r;
      }

      public double findR(){
            return 3.14 * r * r;
      }

      public static int getCout() {
          return cout;
      }

      public static int getId() {
          return id;
      }
  }
}
