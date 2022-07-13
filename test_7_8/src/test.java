import javax.swing.*;
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
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入年份：");
//        int year = scanner.nextInt();
//        System.out.println("请输入月份：");
//        int month = scanner.nextInt();
//        System.out.println("请输入日期：");
//        int day = scanner.nextInt();
//        int sumDays = 0;
//        if (year > 0 && (month > 0 && month <=12) && (day > 0 && day <= 31)){
//            switch (month){
//                case 12:
//                    sumDays += 31;
//                case 11:
//                    sumDays += 30;
//                case 10:
//                    sumDays += 31;
//                case 9:
//                    sumDays += 30;
//                case 8:
//                    sumDays += 31;
//                case 7:
//                    sumDays += 31;
//                case 6:
//                    sumDays += 30;
//                case 5:
//                    sumDays += 31;
//                case 4:
//                    sumDays += 30;
//                case 3:
//                    sumDays += 31;
//                case 2:
//                    if (year % 100 != 0 && year % 4==0 || year % 400 == 0){
//                        sumDays += 29;
//                    }
//                    else{
//                        sumDays += 28;
//                    }
//                case 1:
//                    sumDays += day;
//            }
//
//
//
//        }
//        else{
//            System.out.println("输入有误！");
//        }
//        System.out.println(year+"年"+month+"月"+day+"号是当年的第"+sumDays);
//        int sum = 0;
//        for (int i = 0;i <= 100; i+=2){
//            System.out.println(i);
//             sum += i;
//
//        }
//        System.out.println(sum);
//        for(int i = 1;i <= 150;i++){
//            System.out.print(i+" ");
//            if (i % 3 == 0){
//                System.out.print("三的倍数 ");
//            }
//            if (i % 5 == 0){
//                System.out.print("五的倍数 ");
//            }
//            if (i % 7 == 0){
//                System.out.print("七的倍数 ");
//            }
//            System.out.println();
//        }
//        Scanner scanner = new Scanner(System.in);
//        int max = 0;
//        int min = 0;
//        System.out.println("请输入第一个数:");
//        int input = scanner.nextInt();
//        System.out.println("请输入第二个数:");
//        int input2 = scanner.nextInt();
//        max = (input >= input2) ? input:input2;
//        min = (input <= input2) ? input:input2;
//        for (int i = min;i >= 0;i--){
//            if (input % i == 0 && input2 % i == 0){
//                System.out.println("最大公约数是:"+i);
//                break;
//            }
//        }
//        for (int j = max;j <= input * input2;j++){
//            if (j % input == 0 && j % input2 == 0){
//                System.out.println("最小公倍数是:"+j);
//                break;
//            }
//        }
        //打印1-100的奇数和
//        int sum = 0;
//        for (int i = 1;i <= 100;i+=2){
//            sum+=i;
//        }
//        System.out.println("1-100的奇数和"+sum);
        //打印1-100之间是7倍数的个数
//        int count = 0;
//        int sum = 0;
//        for (int i = 1;i <= 100;i++){
//            if (i % 7 == 0){
//                count++;
//                sum += i;
//            }
//        }
//        System.out.println("1-100之间是7倍数的个数"+count+"和为"+sum);
        //输入100-1000的水仙数
//        int bai = 0;
//        int shi = 0;
//        int ge = 0;
//        for (int i = 100;i <= 1000;i++){
//            //取出百位
//            bai = i % 100;
//            //取出个位
//            shi = i / 10 % 10;
//            //取出十位
//            ge = i % 10;
//            if (((bai * bai * bai) + (shi * shi * shi) + (ge * ge * ge)) == i){
//                System.out.println(i);
//            }
//        }
        //从键盘输入数字计算输入的正负数的个数
//        Scanner scanner = new Scanner(System.in);
//        int positiveNumber = 0;  //定义正数计数
//        int negativeNumber = 0; //定义负数计数
////        while(true){
//        for (;;){
//            int num = scanner.nextInt();
//             if (num > 0){
//                 positiveNumber++;
//             }
//             else if (num < 0){
//                 negativeNumber++;
//             }
//             else{
//                 break;
//             }
//        }
//        System.out.println("正数个数是:"+positiveNumber);
//        System.out.println("正数个数是:"+negativeNumber);
//        for (int i = 1;i <= 6;i++){
//            for (int j = 1;j <= 6;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1;i <= 6;i++){
//            for (int j = 1;j <= i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1;i <= 6;i++){
//            for (int j = 1;j <= 6-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //9 * 9乘法表
//        for (int i = 1;i <= 9;i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "*" + j + "=" + (i * j) + " ");
//
//            }
//            System.out.println();
//        }
      //找出1-100000的质数
//        long start = System.currentTimeMillis();  //获取运行时间
//        label:for (int i = 1;i <= 100000;i++){
//            boolean isFlag = true;
//            for (int j = 2;j < Math.sqrt(i);j++){  //Math.sqrt(i)取出这个数是开方
//                if (i % j == 0){
//                    isFlag = false;
////                    break;
//                    continue label;
//                }
//            }
//            if (isFlag){
//                System.out.println(i);
//            }
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("运行的时间是:"+(end - start));  //26596  4313 141  113
        //一个数如果恰好等于它因子之和，那么这个数就叫做完数
        //找出1-1000之内的完数
//
//        for (int i = 1;i <= 1000;i++){
//            int factor = 0;
//            for (int j = 1;j < i;j++){
//                if (i % j == 0){
//                    factor += j;
//                }
//            }
//            if (i == factor){
//                System.out.println(i);
//            }
//
//        }
//        int arr[] = {1,23,4,5,2,6};
//        for (int i = 0;i <= arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入学生个数:");
//         int input = scanner.nextInt();
//         int arr[] = new int[input];
//         int max = 0;
//         for (int i = 0;i < arr.length;i++){   //输入学生成绩
//             System.out.print("请输入学生分数:");
//             arr[i] = scanner.nextInt();
//         }
//        for (int i = 0;i < arr.length;i++){  //输出学生成绩里的最高分
//            if (arr[i] > max){
//                max = arr[i];
//            }
//
//        }
//        for (int i = 0;i < arr.length;i++){  //输出学生成绩
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.print("学生成绩里的最高分"+max);
        int arr[][] = new int[][]{{1,23,4},{7,8,9,11},{12,56,7,1}};
        int arr2[][] = new int[3][2];
        System.out.println(arr.length);  //3
        System.out.println(arr[1].length);  //4
        System.out.println(arr2.length);  //3
        System.out.println(arr2[1].length);  //2
//        System.out.println(arr2[1][2]);  //null
        for (int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
