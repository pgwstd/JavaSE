
import java.util.Scanner;
    public class shuru {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            triangle t=new triangle();
            System.out.println("输入三角形边长");
            int a0=sc.nextInt();
            int b0=sc.nextInt();
            int c0=sc.nextInt();
            int x=sc.nextInt();
            for (int i = 0; i < x; i++) {
                int ok=sc.nextInt();
                switch (ok){
                    case 1:
                        t.perimeter(a0,b0,c0);
                        break;
                    case 2:
                        t.Isosceles(a0,b0,c0);
                        break;
                    case 3:
                        t.Longest(a0,b0,c0);
                        break;
                }
            }


        }
    }

