package com.pgwstr.java;

public class CheckAccount extends Account{
        private double overdraft;
        public CheckAccount(int id,double balance,double getAnnuaIInteresRate,double overdraft){
                super(id, balance, getAnnuaIInteresRate);
                this.overdraft = overdraft;
        }

        public double getOverdraft() {
                return overdraft;
        }

        @Override
        public void Withdraw(double amount) {
                //余额够时
                if (getBalance() >= amount){
                        super.Withdraw(amount);
                }
                //余额不够时
                else if(overdraft >= amount - getBalance()){
//                        super.Withdraw((getBalance() + overdraft) - amount);
                        overdraft -= (amount - getBalance());
                        super.setBalance(0);
                }
                else {
                        System.out.println("起过可透支限额!");
                }
        }
}
