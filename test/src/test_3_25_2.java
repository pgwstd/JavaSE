//编程实现7*7旋转数组的自动赋值
public class test_3_25_2 {

    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        int[][] s = new int[7][7];
        int N = 7;
        int k = 0, i = 0, j = 0;
        int a = 1;
        for (k = 0; k < (N + 1) / 2; k++) {
            while (j < N - k) arr[i][j++] = a++;
            i++;
            j--;
            while (i < N - k) arr[i++][j] = a++;
            i--;
            j--;
            while (j > k - 1) arr[i][j--] = a++;
            i--;
            j++;
            while (i > k) arr[i--][j] = a++;
            i++;
            j++;
        }

        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                arr[i][j]=s[N-j-1][i];
            }
        }
        for(i=0;i<N;i++)
            for(j=0;j<N;j++)
            {
                arr[i][j] = s[i][j];
            }
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {

                s[i][j] = N * N + 1 - arr[i][j];
            }
        }
        //输出数组
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }}