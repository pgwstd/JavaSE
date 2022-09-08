package com.arithmeticTest.java;

import org.junit.Test;

/**
 * @author pgwstr
 * @date 2022/9/7 21:54
 * 获取两个字符串中最大相同的子串
 */

public class StringDemo2 {
    @Test
    public void test() {
        MaxStr s1 = new MaxStr();
        String str = "abcsdadadshellodadsadw";
        String str2 = "bfrewhello";

    }

    class MaxStr{
        public String MaxString(String str,String str2){
            String Maxstr = str.length() >= str2.length() ? str : str2;
            String Minstr = str.length() < str2.length() ? str : str2;

            if (str != null || str2 != null){

            }

            return null;
        }
    }

}
