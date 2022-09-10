package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

import java.time.*;

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

        /*
        of():设置指定的年、月、日、时、分、秒。没有偏移量
         */
        LocalDate localDate1 = LocalDate.of(1998, 2, 14);
        System.out.println(localDate1);
        LocalTime localTime1 = LocalTime.of(18, 18);
        System.out.println(localTime1);

        LocalDateTime localDateTime1 = LocalDateTime.of(1998, 2, 14, 15, 30, 50);
        System.out.println(localDateTime1);


        /*
        getXxx(）获取当前日期的第几天
         */

        System.out.println(localDateTime1.getDayOfMonth());
        System.out.println(localDateTime1.getHour());
        System.out.println(localDateTime1.getDayOfWeek());
        System.out.println(localDateTime1.getDayOfYear());
        System.out.println(localDateTime1.getMinute());

        LocalDate localDate2 = localDate1.withDayOfMonth(11);
        System.out.println(localDate2);
        LocalDate localDate3 = localDate1.plusMonths(2);
        System.out.println(localDate3);

        LocalDate localDate4 = localDate1.minusDays(1);
        System.out.println(localDate4);
    }
    @Test
    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);//2022-09-10T02:45:35.823Z

        /*
        添加时间偏移量
         */
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2022-09-10T10:45:35.823+08:00

        /*
        获取从1980-1-1-0-0-0到当前时间的毫秒时
         */
        long l = instant.toEpochMilli();
        System.out.println(l);//1662778092679

        //给定毫秒时转换成当前的时间
        Instant instant1 = Instant.ofEpochMilli(1662778092679L);
        System.out.println(instant1);
    }
}
