package com.pgwstr.java17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author pgwstr
 * @date 2022/10/4 12:34
 */



public class SetTest {
    public static List dup(List list){
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
    @Test
    public void test(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List dup2 = dup(list);
        for (Object integer: dup2){
            System.out.println(integer);
        }
    }
}
