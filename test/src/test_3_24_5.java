import java.util.Scanner;

public class test_3_24_5 {
    public static void main(String args[]){
        System.out.println("请定义数组的长度");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            sc.nextInt(arr[i]);
        }

    }
}
