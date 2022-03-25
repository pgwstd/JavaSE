//百鸡问题
public class test_3_24_4 {
    public static void main(String args[]){

    int i=5;
    int j=3;
    int k=1;
           for( i=0; i <= 100; i++ ){
            for( j=0; j <= 100; j++ ) {
                for (k = 0; k <= 100; k++) {
                    if (5 * i + 3 * j + k / 3 == 100 && k % 3 == 0 && i + j + k == 100) {
                        System.out.println("公鸡" + i + "只，母鸡" + j + "只，小鸡" + k + "只");
                    }
                }
            }
           }
    }
}

