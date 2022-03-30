//求1！+...+20!的和
public class test_3_30_2 {
    public static void main(String[] args) {
        int sum=1;
        int i=0;
        int n=1;
        for (i=1;i<=20;i++){
            n*=i;
            sum+=n;
        }

        System.out.println(sum);
    }
}
