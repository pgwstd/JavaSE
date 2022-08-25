package com.pgwstr.java10;

/**
 * @author pgwstr
 * @date 2022/8/21 8:14 PM
 */

public class test_8_21 {
    public static void main(String[] args) {
//        System.out.println("123");

        Book b1 = new Book();
        b1.setId(12);
        b1.setPrc(1.23);
        b1.set();

        System.out.println(b1.getId());
        System.out.println(b1.getPrc());

    }

    /**
     * @author pgwstr
     * @date 2022/8/21 8:24 PM
     */

    static class Book {
        private int id;
        private double prc;


        public void setId(int id) {
            this.id = id;
        }

        public void setPrc(double prc) {
            this.prc = prc;
        }

        public int getId() {
            return id;
        }

        public double getPrc() {
            return prc;
        }

        public void set() {
            System.out.println("你好");
        }

        public void sellp() { System.out.println("睡觉"); }
    }
}
