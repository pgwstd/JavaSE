//求1！+...+20!的和
public class test_3_30_2 {
    public static void main(String[] args) {
        double sum=0,a=1;
        int i=0;
        int n=1;
//        int sum=1;
//        for (i=2;i<=20;i++){
//            sum+=n;
//            n*=i;
//        }
        while (i<=20){
            sum+=a;
            i++;
            a*=i;
        }

        System.out.println(sum);
    }
}
