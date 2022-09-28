package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author pgwstr
 * @date 2022/9/28 22:22
 */

public class SetTest {
    /*
    set  存储无序的、不可重复的
    1.无序性
    2.不可重复性
     */
    @Test
    public void test(){
        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(456);
        hashSet.add("AA");
        hashSet.add("BB");
        hashSet.add(new Person("Tom",21));
        hashSet.add(789);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
