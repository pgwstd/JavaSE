package com.pgwstr.java;

public class AccountTest {
    public static void main(String[] args) {
        Account b1 = new Account(1122,20000,0.045);
        b1.Withdraw(30000);
        System.out.println(b1.getBalance());

        b1.Withdraw(2500);
        System.out.println(b1.getBalance());

        b1.deposit(3000);
        System.out.println(b1.getBalance());
    }
}
