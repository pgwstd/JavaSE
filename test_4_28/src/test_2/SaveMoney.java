package test_2;

/**
 * Created by 潘光伟 on 2022/4/28 19:59.
 */
public class SaveMoney {
    public static void main(String args[]) {
        int amount=8000;
        ConstructionBank bank1 = new ConstructionBank();
        bank1.savedMoney = amount;
        bank1.year = 8.236;
        bank1.setInterestRate(0.035);
        double interest1 = bank1.computerInterest();
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savedMoney = amount;
        bank2.year = 8.236;
        bank2.setInterestRate(0.035);
        double interest3=bank2.computerInterest();
        ConstructionBank_2 bank3 = new ConstructionBank_2();
        bank3.savedMoney = amount;
        bank3.year = 8.236;
        bank3.setInterestRate(0.035);
        double interest2=bank3.computerInterest();
        System.out.printf("两个银行利息相差%f元\n",interest2-interest1);
        System.out.printf("两个银行利息相差%f元\n",interest2-interest1);
    }
}



