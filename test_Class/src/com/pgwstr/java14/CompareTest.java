package com.pgwstr.java14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author pgwstr
 * @date 2022/9/12 00:14
 */

public class CompareTest {
    @Test
    public void test(){
        String[] arr = new String[]{"AA", "CC", "DD", "BB", "FF", "EE"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    @Test
    public void test2(){

    }
}
