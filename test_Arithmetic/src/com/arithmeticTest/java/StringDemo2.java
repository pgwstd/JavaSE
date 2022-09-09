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
        String str3 = s1.MaxString(str, str2);
        System.out.println(str3);
    }

    class MaxStr {
        public String MaxString(String str, String str2) {
            if (str != null && str2 != null) {//判断两个字符串是否有一个为空，如果有一个为空就返回null
                String Maxstr = str.length() >= str2.length() ? str : str2;
                String Minstr = str.length() < str2.length() ? str : str2;
                int length = Minstr.length();

                for (int i = 0; i < length; i++) {
                    for (int j = 0, z = length - i; z <= length; j++, z++) {
                        String subStr = Minstr.substring(j, z);
                        if (Maxstr.contains(subStr)) {
                            return subStr;
                        }
                    }
                }
            }
            return null;
        }
    }

}
