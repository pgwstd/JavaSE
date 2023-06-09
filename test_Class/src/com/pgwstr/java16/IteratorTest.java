package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author pgwstr
 * @date 2022/9/20 19:24
 */

public class IteratorTest {
    @Test
    public void test() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);

        Iterator iterator = collection.iterator();//迭代器
        //方式一,直接调用next()方式进行迭代
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());//出错，迭代器越界
        //方式二：使用hasNext()方法进行循环迭代
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);
        System.out.println(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();//把迭代器的值一个一个的给obj
            if ("TOM".equals(obj)) {  //比较是不是TOM，是就删掉(obj写在后面是为了避免空指针会出错)
                iterator.remove();
            }
        }

        iterator = collection.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

    }

    @Test
    public void test3() {

        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);
        for (Object i : collection) {  //调用的方法里面有迭代器，所以可以这样遍历
            System.out.println(i);
        }

    }

    @Test
    public void test4() {
        String[] arr = new String[]{"123", "456", "789"};

//        for (int i = 0; i < arr.length; i++){
//            arr[i] = "MM";
//        }
        for (String i:arr){
            i = "MM";//不会被改，因为是i相当于是new出来的一个String,所以它有String的不可变性
        }
        for (String i:arr){
            System.out.println(i);
        }
    }
}
