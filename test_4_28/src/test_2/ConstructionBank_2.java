package test_2;

/**
 * Created by 潘光伟 on 2022/4/28 20:07.
 */

    public class ConstructionBank_2 extends Bank {
        double year;
        public double computerInterest() {
            super.year=(int)year;
            double r = year-(int)year;
            int day=(int)(r*1000);
            double yearInterest = super.computerInterest();//super调用隐藏的computerInterest()方法
            double dayInterest = day*0.0002*savedMoney;
            interest= yearInterest+dayInterest;
            System.out.printf("%d元存在商业银行%d年零%d天的利息:%f元\n",
                    savedMoney,super.year,day,interest);
            return interest;
        }
    }
