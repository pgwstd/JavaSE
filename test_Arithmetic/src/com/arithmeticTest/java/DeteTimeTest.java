package com.arithmeticTest.java;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pgwstr
 * @date 2022/9/8 16:32
 * 时间API的测试
 */

public class DeteTimeTest {
    @Test
    public void test(){
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期 --> 字符串
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //解析：格式化的逆过来，字符串 --> 日期
//        String str = "22-09-08 下午4:44";
//        Date date1 = sdf.parse(str);
//        System.out.println(date1);
        //*****************
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format2 = sdf2.format(date);
        System.out.println(format2);

    }


}
