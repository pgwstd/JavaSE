//符号倒序
public class test_3_23 {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        System.out.println("原来的样子:");
        for (i = 0; i < 9; i++) {
            for (j = 9; j >i ; j--) {
                   System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println("改变后的样子:");
        for (i = 0; i < 9; i++) {
            for (j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}