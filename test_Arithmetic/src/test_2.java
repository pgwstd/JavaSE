/**
 * 输入两个正整数a和b，输出这两个正整数的和，差，积，商，模
 *（若a>b则输出a-b，a/b，a%b的值反之输出b-a，b/a，b%a的值，
 * 不考虑小数，请使用int类型）
 */
import java.util.Scanner;
public class test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();   //扫描键盘输入的数

        //write your code here......

        if(a > b){
            System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
        }
        else{
            System.out.println((a+b)+" "+(b-a)+" "+(a*b)+" "+(b/a)+" "+(b%a));
        }


    }
}
