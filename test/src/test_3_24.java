import java.util.*;
public class test_3_24 {
        public int[][] rotateMatrix(int[][] mat, int n) {
            // write code here
            int length=mat.length;
            for(int i=0;i<length/2;i++){
                int temp[]=mat[i];
                mat[i]=mat[length-i-1];
                mat[length-i-1]=temp;
            }
            for(int i=0;i<length;i++){
                for(int j=1;j<length;j++){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
            return mat;
        }
    }



