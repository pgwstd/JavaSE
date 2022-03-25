//通过键盘输入一个数组，遍历输出它的值，再输出数组中最大值的索引号
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test_3_24_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("请定义数组的长度");
        //输入定义长度
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("请输入数组");
        int[] arr = new int[n];
        int tmp=0;
        int max=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        System.out.println("遍历已输入的数组");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++){
            if (arr[i]>max){
                 max=arr[i];
            }

        }
        System.out.println(max);
    }
}