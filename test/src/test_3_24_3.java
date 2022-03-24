//数组排序
import java.util.Scanner;

public class test_3_24_3 {
    

    public static void main(String args[]){
        System.out.println("请输入一个数，以定义二维数组的大小：");
        Scanner sc=new Scanner(System.in);
        int n=0;
        n= sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                int[][] arr = new int[n][n];
                arr[i][j]=++c;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
