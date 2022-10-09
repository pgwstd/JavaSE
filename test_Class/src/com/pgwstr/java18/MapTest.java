package com.pgwstr.java18;

import org.junit.jupiter.api.Test;

import java.util.*;

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

        map.clear();    //删除所有的键值对(会删掉空间，只会删掉元素)
        System.out.println(map.size());
        System.out.println(map);
    }

    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA",1);
        map.put("BB",2);
        map.put("CC",3);

        System.out.println(map.get("BB"));  //get是要用来获取这个key的value值
        boolean aa = map.containsKey("AA"); //containsKey是通过键值对的key来判断集合中是否存在该键值对（布尔）
        System.out.println(aa);
        boolean b = map.containsValue(1);   //containsValue是通过键值对的value来判断集合中是否存在该键值对（布尔）
        System.out.println(b);
        System.out.println(map.containsKey("CC"));

        System.out.println("______________________");
        System.out.println(map.size()); //size是获取集合中键值对的对数
        System.out.println(map.isEmpty());  //isEmpty是用来判断集合里面是否没有存在键值对
        map.clear();
        System.out.println(map.isEmpty());

        Map map2 = new HashMap();
        map2.put("PP",11);
        Map map3 = new HashMap();
        map3.put("PP",11);
        Map map4 = new HashMap();
        map4.put("HH",666);

        System.out.println(map2.equals(map3));  //equals是用来判断两个集合中的键值对是否相同（布尔）
        System.out.println(map2.equals(map4));
    }
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("AA",1);
        map.put("BB",2);
        map.put("CC",3);
        Set set = map.keySet();
        System.out.println(map.keySet());   //遍历map集合中的键值对的key值
        Iterator iterator = set.iterator(); //使用迭代器来遍历
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");
        Collection values = map.values();
        System.out.println(map.values());   //遍历map集合中的键值对的value值
        for (Object obj : values){          //使用增加for循环来遍历
            System.out.println(obj);
        }
        System.out.println("-------------------");
        Set entrySet = map.entrySet();  //获取map集合中所有的key value的值
        Iterator iterator1 = entrySet.iterator();   //使用迭代器来遍历map集合中的key和value值
        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        //方式二：
        Set Set2 = map.keySet();
        Iterator iterator2 = Set2.iterator();
        while (iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "==" + value);

        }
    }
}
