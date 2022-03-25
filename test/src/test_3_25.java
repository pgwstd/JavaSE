//编程计算并输出1-3+5-7+…-99的结果
public class test_3_25 {
    public static void main(String[] args) {
        int sum=0;
        int k = 1;
        for (int i=1;i<100;i=i+2){
            sum+=k*i;
            k=-k;
        }
        System.out.println(sum);
    }
}
