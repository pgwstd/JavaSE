//计算1+1/2+...+1/20的和
public class test_3_20_3 {
    public static void main(String[] args) {

        int i = 0;
        float n = 1.0f;
        float sum = 0;
        int k = 1;
            for (i = 2; i <= 20; i++) {
                sum += n;
                n = n *(n / i);
            }
            System.out.println(sum);
            while (k<=20){
                sum += n;
                n = n *(n / i);
                k++;
            }
        System.out.println(sum);
        }
    }
