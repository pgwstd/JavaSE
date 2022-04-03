import java.util.Scanner;
public class test_4_2 {
        public static void main(String[] args) {
            int n=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("请按题目内容进行输入！");

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
