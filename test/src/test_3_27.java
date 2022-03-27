public class test_3_27 {
    //旋转矩阵
        public static void main(String args[]){
            final int N=7;
            int cx=N/2,cy=N/2;
            int x=cx,y=cy;
            int dir=0;	//0：左 	 1：上 	2：右 	3：下
            int size=1;	//矩阵缩放
            int arr[][]=new int[N][N];
            for(int i=1;i<=9;i++)
                for(int j=1;j<=i;j++){
                    arr[x][y]=i;
                    switch(dir){
                        case 0:
                            y--;
                            if(y<=cx-size)	//到达左边界
                                dir++;
                            break;
                        case 1:x--;
                            if(x<=cy-size)	//到达上边界
                                dir++;
                            break;
                        case 2:y++;
                            if(y>=cx+size)	//到达右边界
                                dir++;
                            break;
                        case 3:x++;		//到达下边界
                            if(x>=cx+size){
                                dir=0;
                                size++;//再一次回到左方向时，扩展矩阵
                            }
                            break;
                        default:;
                    }

                }
            System.out.println("旋转矩阵：");
            for(int[] i:arr){//输出二维数组的值
                for(int j:i)
                    System.out.printf("%-3d",j);
                System.out.println();
            }
        }
    }

