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
    1.无序性:不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值
    2.不可重复性：保证添加的元素按照equals (）判断时，不能返回true.即:相同的元素只能添加一个
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
