package com.pgwstr.java9;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/8/7 5:41 PM
 */

public class test {
    @Test
    public void test_1(){
        String str = "123";
        str = "abc";
        try {
            int n = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.println("转换失败");
        }
    }
}
