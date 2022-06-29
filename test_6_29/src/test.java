import java.util.Scanner;
public class test {
    //从键盘输入一个整数，输出该整数的二进制表示。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toBinaryString(num);
        System.out.println(str);
    }
}
