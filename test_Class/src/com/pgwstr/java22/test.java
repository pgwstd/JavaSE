package com.pgwstr.java22;

/**
 * @author pgwstr
 * @date 2022/12/27
 */
public class test {
    public static void main(String[] args) {
        boolean isTrue = true;
        int num = 0;
        for (int i = 2; i <= 100; i++) {
            isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }

            }
            if (isTrue) {
                num++;
                System.out.println(i);
            }
//            System.out.println(isTrue ? i + "是素数" : i + "不是素数");

        }
        System.out.println("1-100一共有" + num + "个素数");
    }
}
