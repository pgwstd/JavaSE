package com.pgwstr.java18;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author pgwstr
 * @date 2022/10/10 23:05
 */

public class CollectionsTest {
    @Test
    public void test(){
        List list = new  ArrayList();
        list.add(123);
        list.add(54);
        list.add(765);
        list.add(-90);
        list.add(0);

        Collections.reverse(list);  //反转输出
        System.out.println(list);

        Collections.shuffle(list);  //随机输出
        System.out.println(list);

        Collections.sort(list); //自然排序输出
        System.out.println(list);
    }
}
