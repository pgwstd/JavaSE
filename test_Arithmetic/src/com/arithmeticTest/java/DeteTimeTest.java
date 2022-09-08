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
    }


}
