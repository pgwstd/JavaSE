package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author pgwstr
 * @date 2022/9/9 23:27
 */

public class CalenderTest {
    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        //get--->获取日历中的时间天数
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println("************************");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //set-->设置日历
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add-->增加日历的时间
        calendar.add(Calendar.DAY_OF_MONTH, 12);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime--> 日历类转换成Date类
        Date time = calendar.getTime();
        System.out.println(time);

        //setTime--> Date类转换为日历类
        Date time2 = new Date();
        calendar.setTime(time);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);


    }
}
