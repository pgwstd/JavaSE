package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pgwstr
 * @date 2022/9/9 23:12
 * 三天打渔两天晒网
 */

public class testExer {
    @Test
    public void test() throws ParseException {
        String birth = "2020-09-09";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
        System.out.println(date);
    }
}
