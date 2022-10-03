package com.pgwstr.java17;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author pgwstr
 * @date 2022/10/3 22:55
 */

public class EmployeeTest {
    @Test
    //使用自然排序
    public void test(){
        TreeSet treeSet = new TreeSet();
        Employee e1 = new Employee("xiaoming",23,new MyDate(1992,1,1));
        Employee e2 = new Employee("xiaohong",24,new MyDate(1993,8,12));
        Employee e3 = new Employee("xiaowuan",21,new MyDate(1996,3,15));
        Employee e4 = new Employee("xiaopan",19,new MyDate(1995,4,16));
        Employee e5 = new Employee("xiaolou",22,new MyDate(1999,5,17));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
            TreeSet treeSet = new TreeSet(new Comparator() {
                //自定义排序重写
                @Override
                public int compare(Object o1, Object o2) {
                    if (o1 instanceof Employee && o2 instanceof Employee){
                        Employee e1 = (Employee) o1;
                        Employee e2 = (Employee) o2;

                        MyDate b1 = e1.getBirthday();
                        MyDate b2 = e2.getBirthday();
                        //当年不相同
                        int year = b1.getYear() - b2.getYear();
                        if (year != 0){
                            return year;
                        }
                        //当月不相同
                        int mon = b1.getMonth() - b2.getMonth();
                        if (mon != 0){
                            return mon;
                        }
                        //当日不相同直接返回
                        return b1.getDay() - b2.getDay();

                    }
                    throw new RuntimeException("传入的数据不一致");
                }
            });
            Employee e1 = new Employee("xiaoming",23,new MyDate(1992,1,1));
            Employee e2 = new Employee("xiaohong",24,new MyDate(1993,8,12));
            Employee e3 = new Employee("xiaowuan",21,new MyDate(1996,3,15));
            Employee e4 = new Employee("xiaopan",19,new MyDate(1995,4,16));
            Employee e5 = new Employee("xiaolou",22,new MyDate(1999,5,17));
            treeSet.add(e1);
            treeSet.add(e2);
            treeSet.add(e3);
            treeSet.add(e4);
            treeSet.add(e5);

            Iterator iterator = treeSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
}
