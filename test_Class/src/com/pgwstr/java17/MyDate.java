package com.pgwstr.java17;

import java.util.Comparator;

/**
 * @author pgwstr
 * @date 2022/10/3 22:49
 * 自定义的一个时间类
 */

public class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof MyDate) {
            MyDate d1 = (MyDate) o;
            //当年不相同
            int year = this.getYear() - d1.getYear();
            if (year != 0) {
                return year;
            }
            //当月不相同
            int mon = this.getMonth() - d1.getMonth();
            if (mon != 0) {
                return mon;
            }
            //当日不相同直接返回
            return this.getDay() - d1.getDay();
        }
        throw new RuntimeException("传入的数据不一致");
    }
}