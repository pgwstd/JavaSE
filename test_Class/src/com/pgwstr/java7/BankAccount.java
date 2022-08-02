package com.pgwstr.java7;

/**
 * @author pgwstr
 * @date 2022/8/2 10:18 PM
 */

public class BankAccount {


    private int id;  //帐号
    private String pwd = "123456";  //密码
    private double deposit;  //存款余额
    private static double rate = 0.45;  //利率
    private static double minmoney = 1.0;  //最小金额
    private static int inint = 10001;   //用于自动生成帐号

    public BankAccount() {
        id = inint++;
    }
    public BankAccount(String pwd, double deposit) {
        this();
        this.pwd = pwd;
        this.deposit = deposit;
    }
    public  int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public double getDeposit() {
        return deposit;
    }

    public static double getRate() {
        return rate;
    }

    public static double getMinmoney() {
        return minmoney;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
