package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author pgwstr
 * @date 2022/9/4 10:10R
 */

public class LenthTest {
    @Test
    public void test() {
        String str = "HelloWorld";
        System.out.println(str.length()); //长度
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));
        System.out.println(str.isEmpty());

        String str2 = str.toLowerCase();
        System.out.println(str);    //还是原来的字符
        System.out.println(str2);   //在方法区新建的字符

        String str3 = " he llo wor ld ";
        String str4 = str3.trim();    //去除头尾的空格
        System.out.println("-------" + str3 + "-------");
        System.out.println("-------" + str4 + "-------");

    }

    @Test
    public void test2() {
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));  //比较是否一样
        System.out.println(s1.equalsIgnoreCase(s2));    //忽略大小写比较是否一样
        String s3 = "abc";
        String s4 = s3.concat("def");   //追加字符串
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("adc");
        String s7 = "adc";
        System.out.println(s5.compareTo(s7));   //比较两个字符串的大小（第一个减去第二个）
        System.out.println(s5.compareTo(s6));

        String s8 = "abcdefg";
        String s9 = s8.substring(2);    //从哪个位置开始截断字符串
        System.out.println(s8);
        System.out.println(s9);
        String s10 = s8.substring(2, 5);
        System.out.println(s10);
    }

    @Test
    public void test3() {
        String s1 = "helloworld";
        boolean ld = s1.endsWith("ld");  //看是来否是某个字符结尾的
        System.out.println(ld);

        boolean he = s1.startsWith("he");   //看是否是某个字符开始的
        System.out.println(he);

        boolean ll = s1.startsWith("ll", 2);    //看某个字符是不是从指定索引号开始的
        System.out.println(ll);

        int lo = s1.indexOf("lo");
        int lo1 = s1.lastIndexOf("lo");
        System.out.println(lo);
        System.out.println(lo1);

    }

    @Test
    public void test4() {
        String s1 = "abcadef";
        String s2 = s1.replace("a", "b");//替换某个字符(全部替代)
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("**********");
        String s3 = "12hello34world5javaee7889mysql";
        String st = s3.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(st);
    }

    @Test
    public void test5() {
        String s = "123";
        int num = 123;
        int i = Integer.parseInt(s);
        String s1 = String.valueOf(num);
        System.out.println(i);
        System.out.println(s1);

    }

    @Test
    public void test6() {
        //String 与 char  转换
        String s1 = "abc123";
        char[] c1 = s1.toCharArray();
        for (int i = 0;i < c1.length;i++){
            System.out.println(c1[i]);
        }
        char[] arr = new char[]{'h','e','l','l','o'};
        String s2 = new String(arr);
        System.out.println(s2);
    }
    @Test
    public void test7(){
        //string 与 byte的转换
        String s1 = "abcdsafasdasdasd";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        String s = new String(bytes);
        System.out.println(s);


    }
}
