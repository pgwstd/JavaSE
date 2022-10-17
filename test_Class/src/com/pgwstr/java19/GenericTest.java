package com.pgwstr.java19;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author pgwstr
 * @date 2022/10/15 09:41
 */

public class GenericTest {
    @Test
    public void test() {
        ArrayList<Integer> integers = new ArrayList<>();    //泛型用来固定obj类型的输入规则
        integers.add(65);
        integers.add(98);
        integers.add(69);
        integers.add(78);
        integers.add(77);
        for (Integer list : integers) {
            int score = list;
            System.out.println(score);
        }
    }

    @Test
    public void test2() {
        HashMap<String, Integer> entry = new HashMap<>();
        entry.put("tom", 12);
        System.out.println(entry);
    }

    @Test
    public void test3() {
        Order<String> stringOrder = new Order<>(1, "jock", "man");
        stringOrder.setName("tom");
        System.out.println(stringOrder.getName());
        Child<Integer> integerChild = new Child<>();
    }

    @Test
    public void test4() {
        Order<String> order = new Order<>();
        Integer[] integer = new Integer[]{1, 2, 3, 4};
        List<Integer> copy = order.copy(integer);
        System.out.println(copy);
    }
    @Test
    public void test5(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
