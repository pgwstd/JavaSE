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
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double input = scanner.nextDouble();

        if(input < 60){
            System.out.println("不及格");
        }
        else if (input >60 && input < 80){
            System.out.println("中等");
        }
        else if (input < 90){
            System.out.println("优秀");
        }else{
            System.out.println("牛逼");
        }
    }
}
