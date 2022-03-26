//满足1！+2！+3！+...+n!<=9999的最大整数n
public class test_3_26_2 {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
         for (int i=1;i<3;i++){
             sum=1;
             sum+=i;
         }
         System.out.println(sum);
    }
}
