package com.pgwstr.java14;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author pgwstr
 * @date 2022/9/14 18:33
 */

public class OtherClassTest {
    @Test
    public void test(){
        String property = System.getProperty("java.version");
        System.out.println(property);

    }

    @Test
    public void test3() throws ParseException {
        //方式一：java8之前
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parse = sdf.parse("2017-08-16");
        System.out.println(parse.toString());
        //方式二：java8之后
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TemporalAccessor parse1 = dateTimeFormatter.parse("2017-08-16");
        System.out.println(parse1);



    }
}
