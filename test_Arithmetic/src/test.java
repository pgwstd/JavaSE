/**
 * 设计一个方法，将一个小于2147483647的double类型变量以截断取整方式转化为int类型
 *
 */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //从键盘输入
        double num = scanner.nextDouble();
        System.out.println(typeConversion(num));
    }
    public static int typeConversion(double d) {
        //write your code here......
        return (int) d;
    }
}