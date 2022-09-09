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
                String Maxstr = str.length() >= str2.length() ? str : str2;//获取这两个字符串哪个是最长的
                String Minstr = str.length() < str2.length() ? str : str2;//获取这两个字符串哪个是最短的
                int length = Minstr.length();//获取最短字符的长度，来确定要查找的次数，和查找的对象

                for (int i = 0; i < length; i++) {//查找最小长度的字符串的次数，如果查找完最小字符串的长度还没有找到，证明里面没有以之相同的字符串
                    for (int j = 0, z = length - i; z <= length; j++, z++) {//
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
