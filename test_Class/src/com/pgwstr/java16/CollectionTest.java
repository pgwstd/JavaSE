package com.pgwstr.java16;

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
        System.out.println(collection.toString());
    }
}
