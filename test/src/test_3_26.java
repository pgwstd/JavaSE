import java.util.Scanner;

//计算两个非零整数的最大公约数和最小公倍数
public class test_3_26 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("请输入两个非零的整数：");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==0||b==0){
            System.out.println("你输入有误！");
        }
        if (a > b) {
            if (a % b == 0)
                System.out.println("这两个数的最小公倍速数是：" + a);
            else if(b%a==0)
                System.out.println("这两个数的最小公倍速数是：" + b);
            }

        else {
            if (b%a==0)
            System.out.println("这两个数的最小公倍数是："+b);
            else
                System.out.println("这两个数的最小公倍数是："+a*b);
        }
        if (a>b){
            if (a%b==0)
                System.out.println("这两个数的最大公约数是："+a/b);
            else
                System.out.println("这两个数的最大公约数是："+1);
        }
        else{
            if (b%a==0)
                System.out.println("这两个数的最大公约数是："+b/a);
            else
                System.out.println("这两个数的最大公约数是："+1);
        }
    }
}
