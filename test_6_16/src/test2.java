/**
 * Created by 潘光伟 on 2022/6/16 19:13.
 */

public class test2 {
    public static void main(String[] args) {
        int a[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        for (int i = 0; i < 9; i++) {
            if (a[i] % 33 == 0)
                System.out.println(a[i]);
        }
    }
}
