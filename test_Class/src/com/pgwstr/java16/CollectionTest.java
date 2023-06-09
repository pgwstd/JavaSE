package com.pgwstr.java16;

import com.sun.prism.shader.Solid_LinearGradient_PAD_AlphaTest_Loader;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author pgwstr
 * @date 2022/9/19 18:09
 */

public class CollectionTest {
    @Test
    public void test() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);
        System.out.println(collection);
        System.out.println(collection.toString());
        System.out.println(collection.isEmpty());

        collection.add(new Person("jeno", 12));
        System.out.println(collection);
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        boolean contains = coll.contains(123);  //判断当前集合是否包含object
        System.out.println(contains);

        System.out.println("*************************");
        System.out.println(coll.contains(new String("mon")));

        System.out.println(coll.contains(new Person("TnT", 23)));

    }

    @Test
    public void test3() {
        Collection coll = Arrays.asList(123, 456, 789);
        System.out.println(coll.containsAll(coll));
    }

    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);
//        collection.remove(123);//删除集合里面的指定元素
//        System.out.println(collection);
//        collection.remove(new String("TOM"));
//        System.out.println(collection);
        Collection coll1 = Arrays.asList(123, 456);
//        collection.removeAll(coll1);//删除集合里面的指定集合里的所有元素
//        System.out.println(collection);
        collection.retainAll(coll1);//拿出这两个集合的共同部分(交集)
        System.out.println(collection);

    }

    @Test
    public void test5() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);

        Collection collection1 = new ArrayList();
        collection1.add(123);
        collection1.add(456);
        collection1.add(new String("TOM"));
        collection1.add(false);

        System.out.println(collection.equals(collection1));
    }

    @Test
    public void test6() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);

        System.out.println(collection.hashCode());//返回当前集合的哈希值


        Object[] arr = collection.toArray();//集合转换成数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        String[] arr2 = new String[]{"abc", "bec", "kkk"};
        Collection coll2 = Arrays.asList(new String[]{"abc", "bec", "kkk"});//数组转换成集合
        System.out.println(coll2);

        List ints = Arrays.asList(11, 22, 33);
        System.out.println(ints);

        List<int[]> ints1 = Arrays.asList(new int[]{11, 22, 33});
        System.out.println(ints1.size());

        List ints2 = Arrays.asList(new Integer[]{11, 22, 33});
        System.out.println(ints2.size());
    }
    @Test
    public void test8(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);
        collection.forEach(System.out::println);
    }
    @Test
    public void test9(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("TOM"));
        collection.add(false);
        Iterator iterator = collection.iterator();
//        iterator.remove();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
