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
        SimpleDateFormat sdf = new SimpleDateFormat();//实例化
        Date date = new Date();//格式化：日期 --> 字符串
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
    }


}
