/**
 * Created by 潘光伟 on 2022/5/19 08:39.
 */
//从键盘输入一个纯数字的字符串，转成整数后，再转成二进制数输出，并输出该二进制数包含1
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = Integer.parseInt(s);
        String s1 = Integer.toBinaryString(num);
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println("一共有"+count+"个"+1);
        while (count > 0) {
            System.out.print(1);
            count--;
        }
    }
}