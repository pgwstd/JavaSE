package com.pgwstr.java9;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/8/7 5:41 PM
 */

public class test {

    @Test
    public void test_2(){
        int num = method();
        System.out.println(num);
    }
    public int method(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }
        finally {
            System.out.println("一定会执行");
            return 3;
        }
    }

    @Test
    public void test_1(){
        String str = "123";
        str = "abc";
        try {
            int n = Integer.parseInt(str);
            System.out.println("不会出现了，因为上面已经是报错不会再向下执行");
        }
        catch (NullPointerException e){
            System.out.println("空指针了");
        }
        catch (NumberFormatException e){
//            System.out.println("转换失败");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("出现异常了，请解决");
        }
    }
}
