package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    }

}
