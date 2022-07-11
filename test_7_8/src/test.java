import java.awt.*;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
//        System.out.println("姓名：张三");
//        System.out.println();
//        System.out.println("性别：男");
//        System.out.println("地址：北流");
//        float f1 = 12.3f;
//        double b1 = 123.4;
//        long l1=1222354345345343l;
//        int n = 12;
//        int n2 = 5;
//        double d1 =(double) n / n2;
//        int m2 = 12;
//        int n3 = -5;
//        int num = 10;
//        int num2 = 20;
//        num = num ^ num2;
//        num2 = num ^ num2;
//        num = num ^ num2;
//        System.out.println(num);
//        System.out.println(num2);
//        System.out .println(m2 % n3);
//        System.out .println(f1);
//        System.out.println(b1);
//        System.out.println(l1);
//        System.out.println(d1);
//          int n1 = 12;
//          int n2 = 30;
//          int n3 = -43;
//          int max = (n1>n2) ? n1:((n2>n3)?n2:n3);
//          System.out.println(max);
//          if (n1 > n2 && n1 > n3){
//              System.out.println("最大值是"+n1);
//          } else if (n2 > n1 && n2 > n3) {
//              System.out.println("最大值是"+n2);
//          }
//          else{
//              System.out.println("最大值是"+n3);
//          }
//          Scanner scanner = new Scanner(System.in);
//          int input = scanner.nextInt();
//          System.out.println("请输入你的姓名:");
//          String name = scanner.nextLine();
//          System.out.println(name);
//
//        System.out.println("请输入你的年龄:");
//        int age = scanner.nextInt();
//        System.out.println(age);

//        System.out.println("请输入你的体重:");
//        double weight = scanner.nextDouble();
//        System.out.println(weight);

//        System.out.println("你是不是成年人:");
//        boolean keil = scanner.nextBoolean();
//        System.out.println(name+"\t"+age+"\t"+weight+"\t"+keil);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入成绩");
//        double input = scanner.nextDouble();
//
//        if(input < 60){
//            System.out.println("不及格");
//        }
//        else if (input >60 && input < 80){
//            System.out.println("中等");
//        }
//        else if (input < 90){
//            System.out.println("优秀");
//        }else{
//            System.out.println("牛逼");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入日期：");
        int day = scanner.nextInt();
        int sumDays = 0;
        if (year > 0 && (month > 0 && month <=12) && (day > 0 && day <= 31)){
            switch (month){
                case 12:
                    sumDays += 31;
                case 11:
                    sumDays += 30;
                case 10:
                    sumDays += 31;
                case 9:
                    sumDays += 30;
                case 8:
                    sumDays += 31;
                case 7:
                    sumDays += 31;
                case 6:
                    sumDays += 30;
                case 5:
                    sumDays += 31;
                case 4:
                    sumDays += 30;
                case 3:
                    sumDays += 31;
                case 2:
                    if (year % 100 != 0 && year % 4==0 || year % 400 == 0){
                        sumDays += 29;
                    }
                    else{
                        sumDays += 28;
                    }
                case 1:
                    sumDays += day;
            }



        }
        else{
            System.out.println("输入有误！");
        }
        System.out.println(year+"年"+month+"月"+day+"号是当年的第"+sumDays);
    }

}
