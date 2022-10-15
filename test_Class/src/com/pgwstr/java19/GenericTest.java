package com.pgwstr.java19;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author pgwstr
 * @date 2022/10/15 09:41
 */

public class GenericTest {
    @Test
    public void test(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(65);
        integers.add(98);
        integers.add(69);
        integers.add(78);
        integers.add(77);
        for (Integer list: integers){
            int score = list;
            System.out.println(score);
        }
    }
}
