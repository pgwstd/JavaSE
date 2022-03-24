//杨辉三角
public class test_3_23_3 {
        public static void main(String[] args) {

            int[][] arr=new int[10][10];
            for(int i=0;i<arr.length; i++) {

                for(int j=0;j<=i;j++) {

                    if(j==0||j==i) {
                        arr[i][j]=1;
                    }else {
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    }

                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
//    public static void main(String[] args) {
//        int[][] arr=new int[10][10];
//        for(int i=0;i<arr.length;i++) {
//            arr[i]=new int[i+1];
//        }
//        for(int i=0;i<arr.length;i++) {
//            for(int j=0;j<arr[i].length;j++) {
//                if(j==0 || i==j) {
//                    arr[i][j]=1;
//                }else {
//                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++) {
//            int num=(arr.length-i)/2;
//            for(int k=0;k<=num;k++) {
//                System.out.print("\t");
//            }
//            for(int j=0;j<arr[i].length;j++) {
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
//}





