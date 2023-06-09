package com.arithmeticTest.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pgwstr
 * @date 2022/9/8 16:32
 * 时间API的测试
 */

public class DeteTimeTest {
    @Test
    public void test() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期 --> 字符串
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //解析：格式化的逆过来，字符串 --> 日期
        String str = "22-09-08 下午4:44";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        //*****************
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式式
        String format2 = sdf2.format(date);
        System.out.println(format2);
        //解析
        Date parse = sdf2.parse("2022-09-08 04:49:04");
        System.out.println(parse);
    }

    @Test
    /**
     * @author pgwstr
     * @date 2022/9/8 16:54
     * 使用SimpleDateFormat来把字符串中的"2020-09-09"来转换成java.sql.Date
     */

    public void test2() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birth = "2022-09-09";
        Date date = sdf.parse(birth);
        java.sql.Date date2 = new java.sql.Date(date.getTime());//强制转换为java.sql.Date下的时间格式
        System.out.println(date2);
    }

}
