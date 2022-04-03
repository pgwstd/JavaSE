import java.util.Scanner;
public class test_4_2 {
        public static void main(String[] args) {
            int n=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入两个数字第一个数表示执行操作，代表操作类型依次为（0:更改值，1：加，2：减，3：乘，4：除）\n" +
                    "第二个数表示操作对象");

            while (true) {
                int x=sc.nextInt();
                switch (x){
                    case 0:
                        n=sc.nextInt();
                        System.out.print(n+" ");
                        break;
                    case 1:
                        n+=sc.nextInt();
                        System.out.print(n+" ");
                        break;
                    case 2:
                        n-=sc.nextInt();
                        System.out.print(n+" ");
                        break;
                    case 3:
                        n*= sc.nextInt();
                        System.out.print(n+" ") ;
                        break;
                    case 4:
                        n/=sc.nextInt();
                        System.out.print(n+" ");
                        break;
                }
            }
        }
}
