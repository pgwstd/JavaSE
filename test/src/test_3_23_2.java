//3阶魔方矩阵
public class test_3_23_2 {
        public static void main(String args[]) {
            final int N = 3;
            int arr[][] = new int[N][N];
            int x = 0, y = N / 2;//计划位置，用于试探
            int X = x, Y = y;//实际走位
            for (int n = 1; n <= N * N; n++) {
                arr[X][Y] = n;
                x--;    //保持右上方向走位
                y++;
                if (y > N - 1) {//超出右边界，则返回第一列
                    y = 0;
                }
                if (x < 0) {//超出上边界，则返回最后一行
                    x = N - 1;
                }
                if (arr[x][y] > 0) {//如果右上位置已有值，则转向下一行同列的位置
                    x = X + 1;
                    y = Y;
                }
                X = x;
                Y = y;//继续跟踪
            }
            System.out.println(N + "阶魔方矩阵：");
            for (int[] i : arr) {
                for (int j : i)
                    System.out.printf("%3d", j);
                System.out.println();
            }
        }}
