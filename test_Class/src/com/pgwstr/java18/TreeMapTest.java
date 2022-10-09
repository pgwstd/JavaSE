package com.pgwstr.java18;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

/**
 * @author pgwstr
 * @date 2022/10/9 21:48
 */

public class TreeMapTest {
    @Test
    public void test(){
        TreeMap treeMap = new TreeMap();
        treeMap.put("SS",11);
        treeMap.put("ff",22);
        System.out.println(treeMap);

    }
}
