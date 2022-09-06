package com.arithmeticTest.java;

import org.junit.Test;

/**
 * @author pgwstr
 * @date 2022/9/6 14:19
 */

public class ReverseTest {
    @Test
    public void test() {

        StringTest s1 = new StringTest();
        String str = s1.recerse("abcdf", 2, 4);
        System.out.println(str);
    }
/**
 * @author pgwstr
 * @date 2022/9/6 14:29
 * 将一串字符，按指定部分进行反转
 */

    class StringTest {

        public StringTest() {
        }
        public String recerse(String str,int startIndex,int endIndex){
            if (str != null){
                char[] arr = str.toCharArray();
                for (int i = startIndex, j = endIndex;i < j;i++,j--){
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                return new String(arr);
            }
        return  null;
        }

    }

}
