package com.pgwstr.java14;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/9/14 18:33
 */

public class OtherClassTest {
    @Test
    public void test(){
        String property = System.getProperty("java.version");
        System.out.println(property);
    }
}
