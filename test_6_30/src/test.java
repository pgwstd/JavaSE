public class test {

    public static void main(String[] args) {

        int i, j, sum = 0;
        int a[][] = new int[3][3];

        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                a[i][j] = i + j;

            }

        } //输出 3×3 矩阵

        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        } //显示对角线之和

        for (i = 0; i < 3; i++) {

            sum = sum + a[i][i];


        } System.out.println("对角线之和：" + sum);

    }

}

