//通过键盘输入一个数组，遍历输出它的值，再输出数组中最大值的索引号

import java.util.Scanner;

public class test_3_24_5 {
    public static void main(String[] args)  {
        System.out.println("请定义数组的长度:");
        //输入定义长度
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("请输入数组:");
        int[] arr = new int[n];
        int max=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("遍历已输入的数组:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++){
            if (arr[i]>max){
                 max=arr[i];
            }

        }
        for(int i=0;i<n;i++){
            if (arr[i]==max){
                count=i;
            }

        }
        System.out.println("最大值的索引号是:");
        System.out.println(count);
    }
}