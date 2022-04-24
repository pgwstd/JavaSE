//
// Created by 潘光伟 on 2022/4/24.
//


import java.util.Scanner;

public class test {
    public static  void main(String []args){
            System.out.println("请输入数字，输入完成以#结束:");
            double sum=0;
            int m=0;
            Scanner sc=new Scanner(System.in);
            while (sc.hasNextDouble()){
                  double x= sc.nextDouble();
                  m++;
                  sum+=x;
            }
          System.out.printf("%d个数的和为%10.2f\n",m,sum);
          System.out.println(m+"个数的平均数为"+sum/m);
    }
}
