package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pgwstr
 * @date 2022/9/21 22:25
 */

public class ListTest {
    @Test
    public void test() {
        System.out.println(123);
        System.out.println(456);
    }

    @Test
    public void test2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("Aa");
        arrayList.add(new Person("Tom",21));
        arrayList.add("Bb");
        System.out.println(arrayList.size());


        List list = Arrays.asList(1, 2, 3);
        arrayList.addAll(list);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
    @Test
    public void test3(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("Aa");
        arrayList.add(new Person("Tom",21));
        arrayList.add("Bb");
        int i = arrayList.indexOf(456);//第一次出现的位置下标，找不到就返回-1
        System.out.println(i);
        Object obj  = arrayList.remove("Aa");
        System.out.println(arrayList);
    }
}
