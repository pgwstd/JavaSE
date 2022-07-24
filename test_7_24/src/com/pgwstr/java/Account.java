package com.pgwstr.java;

public class Account {
    private int id;     //帐户
    private double balance;     //余额
    private double annuaIInteresRate;       //年利率

    //构造方法
    public Account(int id,double balance,double getAnnuaIInteresRate){
        this.id = id;
        this.balance = balance;
        this.annuaIInteresRate = getAnnuaIInteresRate;
    }

    //设置帐户
    public void setId(int id) {
        this.id = id;
    }

    //设置余额
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //设置年利率
    public void setAnnuaIInteresRate(double annuaIInteresRate) {
        this.annuaIInteresRate = annuaIInteresRate;
    }

    //返回帐户
    public int getId() {
        return id;
    }

    //返回余额
    public double getBalance() {
        return balance;
    }

    //返回年利率
    public double getAnnuaIInteresRate() {
        return annuaIInteresRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return annuaIInteresRate / 12;
    }

    //取款方法
    public void Withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("余额不足！");
        }
    }

    //存款方法
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
        else{
            System.out.println("输入有误！");
        }
    }
}
