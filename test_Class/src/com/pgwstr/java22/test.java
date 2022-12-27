package com.pgwstr.java22;

/**
 * @author pgwstr
 * @date 2022/12/27
 */
public class test {
    public static void main(String[] args) {
        boolean isTrue = true;
        for (int i = 1;i <= 100;i++){
            for (int j = 2;j < i;j++){
                if (i % j == 0){
                    isTrue = false;
                    break;
                }
            }
            System.out.println(isTrue ? i + "是素数" : i + "不是素数");
            isTrue = true;
        }
    }
}
