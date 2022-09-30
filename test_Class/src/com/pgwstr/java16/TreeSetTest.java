package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author pgwstr
 * @date 2022/9/30 23:19
 */

public class TreeSetTest {
    @Test
    public void test(){
        TreeSet treeSet = new TreeSet();
        //失败：不可添加不同类的对象
//        treeSet.add(123);
//        treeSet.add(456);
//        treeSet.add(789);
//        treeSet.add("AA");

        treeSet.add(123);
        treeSet.add(456);
        treeSet.add(789);
        Iterator integer = treeSet.iterator();
        while (integer.hasNext()){
            System.out.println(integer.next());
        }
    }
}
