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
//        hashtable.put(null,null); 不可以为空
        map.put(11,45);
        System.out.println(map);
        map.put(11,22);
        System.out.println(map);
    }
    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA",1);    //添加
        map.put("AA",2);    //修改
        map.put("BB",3);
        System.out.println(map);

        Map map2 = new HashMap();
        map2.put("CC",2);    //修改
        map2.put("DD",3);
        map.putAll(map2);   //添加到map里
        System.out.println(map2);
        System.out.println(map);

        Object remove = map.remove("DD");   //删除（要用key来找）
        System.out.println(remove);         //打印出所删除"CC"的value值
        System.out.println(map);
    }
}
