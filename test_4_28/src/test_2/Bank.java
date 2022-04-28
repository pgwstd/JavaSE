package test_2;

/**
 * Created by 潘光伟 on 2022/4/28 19:57.
 */
public class Bank {
    int savedMoney;
    int year;
    double interest;
    double interestRate = 0.29;

    public double computerInterest() {
        interest = year * interestRate * savedMoney;
        return interest;

    }
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
}
