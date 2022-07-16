import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
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
//        int arr[][] = new int[][]{{1,23,4},{7,8,9,11},{12,56,7,1}};
//        int arr2[][] = new int[3][2];
//        System.out.println(arr.length);  //3
//        System.out.println(arr[1].length);  //4
//        System.out.println(arr2.length);  //3
//        System.out.println(arr2[1].length);  //2
////        System.out.println(arr2[1]);  //地址值
////        System.out.println(arr2[1][1]);  //null
//        for (int i = 0;i < arr.length;i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int arr[] = new int[10];
//        int sum = 0;
//
//        //赋值
//         for (int i = 0;i < arr.length;i++){
//             arr[i] = (int)(Math.random() * (99 - 10 +1) + 10);  //赋随机值10-99
//         }
//         //遍历
//        for (int j = 0;j < arr.length;j++){
//            System.out.print(arr[j] +" ");
//        }
//        System.out.println();
//        //找出最大值
//        int max = arr[0];
//        for (int m = 0;m < arr.length;m++){
//            if (arr[m] > max)
//                max = arr[m];
//        }
//        System.out.println("最大值是:"+max);
//        //找出最小值
//        int min = arr[0];
//        for (int n = 0;n < arr.length;n++){
//            if (arr[n] < min)
//                min = arr[n];
//        }
//        System.out.println("最小值是:"+min);
//        //总和
//        for (int k = 0;k < arr.length;k++){
//            sum += arr[k];
//        }
//        System.out.println("和是:"+sum);
//        //平均值
//        System.out.println("平均值是:"+sum / arr.length);
//        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
//        int arr2[] = new int[10];
//        int key = 5;
//        boolean isFull = false;
////        arr2 = arr;
//        for (int i = 0;i < arr.length;i++){
//            arr2[i] = arr[i];
//        }
//        for (int i = 0;i < arr2.length;i++){
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0;i < arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0;i < arr2.length;i++){
//            if (i % 2 == 0)
//                arr2[i] = i;
//        }
//        for (int i = 0;i < arr2.length;i++){
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.print("\n");
//        //反转
//        for (int i = arr2.length-1;i >= 0;i--){
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
//        //查找
//        for (int i = 0;i < arr.length;i++){
//            if (arr[i] == key){
//                isFull = true;
//                break;
//            }
//        }
//        if (isFull){
//            System.out.println("找到了");
//        }
//        else {
//            System.out.println("没找到");
//        }
//        String arr[] = new String[]{"AA","BB","CC","DD","EE","FF"};
//        //数组复制
//        String arr2[] = new String[arr.length];
//        String key = "DD";
//        boolean isFull = false;
//        for (int i = 0;i < arr.length;i++){
//            arr2[i] = arr[i];
//        }
//        //遍历arr2数组
//        for (int i = 0;i < arr2.length;i++){
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
//        //查找
//        for (int i = 0;i < arr.length;i++){
//            if (key.equals(arr[i])){
//                isFull = true;
//                break;
//            }
//        }
//        if (isFull){
//            System.out.println("找到了");
//        }
//        else{
//            System.out.println("没找到");
//        }
        //二分查找
//       int arr[] = new int[]{12,14,15,23,54,67,78,88,99};
//       int key = 14;
//       int start = 0;
//       int end = arr.length-1;
//       int mid = 0;
//       while (start <= end){
//           mid = (start + end) / 2;
//           if(arr[mid] > key){
//
//               end = mid-1;
//           }
//           else if (arr[mid] < key){
//               start = mid+1;
//           }
//           else if (arr[mid] == key){
//               System.out.println("找到了");
//           }
//           else {
//               System.out.println("不存在");
//           }
//           start++;
//           end--;
//       }
        //冒泡排序
//        int arr[] = new int[]{12,24,1,22,66,11,23,55,33};
//        int tmp = 0;
//        for (int i = 0;i < arr.length-1;i++){
//            for (int j = 0;j < arr.length - i -1 ;j++){
//                if (arr[j] > arr[j+1]){
//                    tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
//        for (int n = 0;n < arr.length;n++){
//            System.out.print(arr[n]+"\t");
//        }
//        int arr[] = new int[]{12,34,56,23,63,11,55};
//        int arr2[] = new int[]{12,23,112,441,22,45};
//        boolean isFull = Arrays.equals(arr,arr2);  //比较两个数组
//        System.out.println(isFull);
//        System.out.println(Arrays.toString(arr));  //输出数组
//        System.out.println(Arrays.toString(arr2));
//        Arrays.fill(arr,10);                        //将指定元素增加到数组
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr2);                         //从小往大排序
//        System.out.println(Arrays.toString(arr2));
//        int arr3[] = new int[]{1,2,3,4,5,6,7,8,9};
//        System.out.println(arr3.toString());
//        int index = Arrays.binarySearch(arr3,2);  //二分查找
//        if (index >= 0){
//            System.out.println("找到了,位置是:"+(index+1));
//        }
//        else {
//            System.out.println("没找到");
//        }


//        c1.rabir = 1;
//        System.out.println(c1.manzi());
//        //求圆的面积
//         class Crire{
//            double rabir = 0;  //定义属性
//            public double manzi(){
//
//                return Math.PI * rabir * rabir;
//            }
//        }
//        Student s1 = new Student();
//        s1.name = "张三";
//        s1.age = 18;
//        s1.sex = "男";
//        System.out.println(s1.name+s1.age+s1.sex);
//        s1.eat();
//        System.out.println("学生在跑步跑了"+s1.run(3.2)+"米");
//        Student[] s2 = new Student[5];
//        for (int i = 0;i < s2.length;i++){
//            s2[i] = new Student();
//            s2[i].age = i + 1;
//
//        }
//
////        System.out.println(Arrays.toString(s2));
//        for (int i = 0;i < s2.length;i++){
//            System.out.println(s2[i].age+" ");
//        }
//    }
//}
//    class Student{
//        String name;
//        int age;
//        String sex;
//        double k;
//        public void  eat(){
//            System.out.println("学生在吃饭");
//        }
//        public double run(double m){
//            k = m * 1000;
//            return k;
        //可变个数开参  类型  ... 变量名
//        test k = new test();
//        k.show("hello");
//        k.show("qwe","24","fsf");
//        }
//        public void show(String str){
//            System.out.println(1);
//        }
//        public void show(String ... str){
//            System.out.println(2);
//            for (int i = 0;i < str.length;i++){
//                System.out.println(str[i]);
//            }
        int m = 10;
        int n = 20;
        test y = new test();
        System.out.println(m+" "+n);
        y.Swap(m,n);
        System.out.println(m+" "+n);
        }
        public void Swap(int m,int n){
        int tmp = m;
        m = n;
        n = tmp;
        }
    }

