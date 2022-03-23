import java.lang.reflect.Array;
import java.util.Arrays;

//蛇形矩阵
public class test_3_23_4 {
    public static void main(String args[]){
        int[][] i;
               i= snakeMatrix(5);
               for(int[] w:i)
                   System.out.println(Arrays.toString(w));
    }
    public static int[][] snakeMatrix(int n) {
        int[][] storage = new int[n][n];
        int direction = 0;//代表转的方向 0-东,1-南,2-西,3-北
        int number = 1;
        /*这里curY设置为-1方便第一行与其他行统一处理*/
        int curX = 0, curY = -1;
        while (number <= n * n) {
            switch (direction) {
                case 0: //东方向,x不变,y递增
                    curY++; //每一行第一个数在前一个方向时已经设置了,因此本方向跳过,矩阵起始第一行我们把curY设为了-1，因此跳过一个后恰好是第一个元素
                    while (curY < n && storage[curX][curY] == 0) { //利用矩阵数组初始值全为0判断本方向是否已经到了还没有设置值的边界
                        storage[curX][curY] = number;
                        curY++;
                        number++;
                    }
                    curY--;
                    direction = 1;//改变方向
                    break;
                case 1:
                    curX++;
                    while (curX < n && storage[curX][curY] == 0) {
                        storage[curX][curY] = number;
                        curX++;
                        number++;
                    }
                    curX--;
                    direction = 2;
                    break;
                case 2:
                    curX--;
                    while (curY >= 0 && storage[curX][curY] == 0) {
                        storage[curX][curY] = number;
                        curX--;
                        number++;
                    }
                    curX++;
                    direction = 3;
                    break;
                case 3:
                    curY--;
                    while (curY >= 0 && storage[curX][curY] == 0) {
                        storage[curX][curY] = number;
                        curY--;
                        number++;
                    }
                    curY++;
                    direction = 0;
                    break;
            }
        }
        return storage;
    }
}
