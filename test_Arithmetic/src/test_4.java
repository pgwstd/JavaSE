/**
 * 在不使用第三个变量的情况下交换两个int类型变量的值
 */
import java.util.Scanner;
public class test_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
