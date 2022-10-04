package com.pgwstr.java18;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author pgwstr
 * @date 2022/10/4 13:18
 */

public class MapTest {
    @Test
    public void test(){
        Map map = new HashMap();
        Hashtable hashtable = new Hashtable();
//        hashtable.put(null,null);
        map.put(11,45);
        System.out.println(map);
        map.put(11,22);
        System.out.println(map);
    }
}
