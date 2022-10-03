package com.pgwstr.java17;

import org.junit.jupiter.api.Test;

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

}
