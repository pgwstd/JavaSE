import java.util.Scanner;
public class book {
    //输入一个书本的页数，输出该书本的页码。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int page = 1;
        while (num > 0) {
            num = num - 1;
            page = page * 2;
        }
        System.out.println(page);
    }
}
