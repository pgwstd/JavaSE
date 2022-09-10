package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author pgwstr
 * @date 2022/9/10 10:13
 */

public class DateTest {
    @Test
    public void test(){
        /*
        localTime loclaData localDateTime测试
         */
        LocalDate localDate = LocalDate.now();//获取当前日期
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);//获取当前时间

        LocalDateTime localDateTime = LocalDateTime.now();//获取当前日期与时间
        System.out.println(localDateTime);
    }
}
