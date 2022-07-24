package com.pgwstr.java;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount b2 = new CheckAccount(1122,20000,0.045,5000);
        b2.Withdraw(5000);
        System.out.println("可用余额为:"+b2.getBalance());
        System.out.println("可透支的余额为:"+b2.getOverdraft());
        System.out.println("**********************");

        b2.Withdraw(18000);
        System.out.println("可用余额为:"+b2.getBalance());
        System.out.println("可透支的余额为:"+b2.getOverdraft());
        System.out.println("**********************");

        b2.Withdraw(3000);
        System.out.println("可用余额为:"+b2.getBalance());
        System.out.println("可透支的余额为:"+b2.getOverdraft());
    }
}
