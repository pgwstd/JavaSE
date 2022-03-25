//编程实现7*7旋转数组的自动赋值
public class test_3_25_2 {
    public static void main(String[] args) {
        int [][]arr=new int[7][7];
        int n=1;
        for (int i=1;i<7;i++){
            for (int j=1;j<i;j++){
                   arr[7/2][7/2]=n;
                   n++;

            }
        }
        System.out.println(arr);
    }
}

