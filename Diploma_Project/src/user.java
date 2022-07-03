//用户登录
import java.util.Scanner;
public class user {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
