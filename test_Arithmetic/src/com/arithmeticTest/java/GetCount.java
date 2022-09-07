package com.arithmeticTest.java;

import org.junit.Test;

/**
 * @author pgwstr
 * @date 2022/9/7 18:51
 * 获取一个字符串在另外一个字符串中出现的次数
 */

public class GetCount {
    @Test
    public void test() {
        StrDemo s1 = new StrDemo();
        String str = "abdffdfdfdgqabfdfab";
        String find = "ab";
        int cont = s1.getCont(str, find);
        System.out.println(cont);
    }

    class StrDemo {
        public int getCont(String str, String find) {
            int strLength = str.length();//获取str的长度
            int findLength = find.length();//获取find的长度
            int count = 0;//新建计数器
            int index = 0;//新建开始找的位置
            if (strLength >= findLength) {//判断原字符的长度是否大于等于被查找的字符的长度，如果不是则返回0
                while ((index = str.indexOf(find)) != -1) {//循环，如果查找到了,就把查找到的位置号给index，如果没有查找到就等于-1
                    count++;//计算器每次增加1
                    str = str.substring(index + findLength);//如果查找到了,就把查找到的位置号给str并且加上这个查找字符的长度，让它下次查找从这个新的str开始
                }
                return count;//返回出现的次数
            } else {
                return 0;
            }
        }
    }
}
