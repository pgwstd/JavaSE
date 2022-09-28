package com.pgwstr.java16;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author pgwstr
 * @date 2022/9/28 21:51
 */

public class ListExer {
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }
    public static void updateList(ArrayList list){
        list.remove(2);
    }
}
