package com.pgwstr.java16;

import com.sun.prism.shader.Solid_LinearGradient_PAD_AlphaTest_Loader;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

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

        collection.add(new Person("jeno",12));
        System.out.println(collection);
    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        boolean contains = coll.contains(123);  //判断当前集合是否包含object
        System.out.println(contains);

        System.out.println("*************************");
        System.out.println(coll.contains(new String("mon")));

        System.out.println(coll.contains(new Person("TnT", 23)));


    }
}
