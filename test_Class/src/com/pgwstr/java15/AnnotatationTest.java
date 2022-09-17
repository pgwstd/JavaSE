package com.pgwstr.java15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author pgwstr
 * @date 2022/9/17 13:18
 * 注解的使用
 */

public class AnnotatationTest {
        @Test
    public void test(){
            Collection coll = new ArrayList();
            coll.add("aa");
            coll.add("bb");
            coll.add(123);
            coll.add(new Date());
            System.out.println(coll.size());

            Collection coll1 = new ArrayList();
            coll1.add("cc");
            coll1.add(456);
            coll.add(coll1);
            System.out.println(coll1.size());

            System.out.println(coll.isEmpty());
            coll.clear();
            System.out.println(coll.isEmpty());
        }
}
