package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
        Object obj  = arrayList.remove("Aa"); //删除某个元素
        System.out.println(arrayList);
        arrayList.set(1, "AA");//更改某个位置的元素
        System.out.println(arrayList);
        List list = arrayList.subList(2, 3);//返回指定区间的内容（左闭右开）
        System.out.println(list);
        System.out.println("*******************");


        //遍历的方式一(迭代器遍历)
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //遍历方式二(增加for循环)
        System.out.println("*********************");
        for (Object ob : arrayList){
            System.out.println(ob);
        }

        //遍历方式三(使用get方法)
        System.out.println("***********************");
        for (i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
