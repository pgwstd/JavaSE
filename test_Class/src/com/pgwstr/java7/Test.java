package com.pgwstr.java7;

/**
 * @author pgwstr
 * @date 2022/8/2 10:29 PM
 */

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("000000",3131);
        BankAccount b3 = new BankAccount("666666",6666);
        System.out.println(b1.getId());
        System.out.println(b1.getPwd());
        System.out.println(b1.getDeposit());
        System.out.println("*************");
        System.out.println(b2.getId());
        System.out.println(b2.getPwd());
        System.out.println(b2.getDeposit());
        System.out.println("*************");
        System.out.println(b3.getId());
        System.out.println(b3.getPwd());
        System.out.println(b3.getDeposit());

    }
}
