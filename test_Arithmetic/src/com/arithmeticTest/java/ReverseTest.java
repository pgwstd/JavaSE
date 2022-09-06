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
        String str2 = "qwerty";
        String str3 = s1.recerse(str2, 2, 4);
        System.out.println(str3);
        System.out.println(str);
    }

    @Test
    public void test2() {
        String str = "abcdefg";
        StringTest s1 = new StringTest();
        System.out.println(s1.recerse1(str, 2, 4));
    }

    @Test
    public void test3() {
        String str = "helloworld";
        StringTest s1 = new StringTest();
        System.out.println(s1.recerse2(str, 2, 4));
    }

    /**
     * @author pgwstr
     * @date 2022/9/6 14:29
     * 将一串字符，按指定部分进行反转
     */

    class StringTest {

        public StringTest() {
        }

        /**
         * @author pgwstr
         * @date 2022/9/6 22:23
         * 方式一
         */

        public String recerse(String str, int startIndex, int endIndex) {
            if (str != null) {
                char[] arr = str.toCharArray();
                for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                return new String(arr);
            }
            return null;
        }

        public String recerse1(String str, int startIndex, int endIndex) {
            if (str != null) {      //当字符串为空时，返回null
                String recerseStr = str.substring(0, startIndex);//保存从0到启始位置(左开右闭)
                for (int i = endIndex; i >= startIndex; i--) {     //从最后一个位置把字符一个个放在recerseStr中
                    recerseStr += str.charAt(i);
                }
                recerseStr += str.substring(endIndex + 1);//把后面没放在recerseStr放在其中
                return recerseStr;
            }
            return null;
        }

        /**
         * @author pgwstr
         * @date 2022/9/6 22:48
         * 方式三
         */

        public String recerse2(String str, int startIndex, int endIndex) {
            if (str != null) {//如果字符串为空，返回null
                StringBuilder recerseStr = new StringBuilder(str.length());//新建一个长度为str.length的recerseStr
                recerseStr.append(str.substring(0, startIndex));//使用append调用String中的substring方法进行字符追加
                for (int i = endIndex; i >= startIndex; i--) {
                    recerseStr.append(str.charAt(i));//使用append调用String的charAt方法进行追加字符

                }
                recerseStr.append(str.substring(endIndex + 1));//使用append调用String中的substring方法进行字符追加
                return recerseStr.toString();//调用toString方法进行返回字符串
            }
            return null;
        }

    }

}
