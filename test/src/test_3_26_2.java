//满足1！+2！+3！+...+n!<=9999的最大整数n
public class test_3_26_2 {
    public static void main(String[] args) {
        int n=1;
        int m=0;
        int sum=0;
         for (int i=1;i<=10;i++){
                 m = n *= i;
                 sum += m;
                 if (sum>9999) {
                     i=i-1;
                     System.out.println("最大的n是："+i);
                     break;
             }

         }

    }
}
