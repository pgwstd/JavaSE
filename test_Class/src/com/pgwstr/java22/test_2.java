package com.pgwstr.java22;

/**
 * @author pgwstr
 * @date 2022/12/27
 */
public class test_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10000; i++) {
            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }

            }
            if (isTrue) {
                System.out.println(i);
            }
        }
    }
}
