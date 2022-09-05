package com.pgwstr.java12;

import org.junit.jupiter.api.Test;

/**
 * @author pgwstr
 * @date 2022/9/5 17:11
 */

public class BufferBuilder {
    @Test
    public void test(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);   //追加字符
        s1.append('1');
        s1.append("def");
        System.out.println(s1);

        s1.delete(2,4); //从哪到哪删除字符
        System.out.println(s1);
        s1.replace(2,4,"hello");    //从哪到哪替换字符
        System.out.println(s1);
        s1.insert(2,false); //从哪插入字符
        System.out.println(s1);
        s1.replace(2,4,"hw");   //从哪到哪替换字符
        System.out.println(s1);
        s1.delete(0,1);
        System.out.println(s1); //从哪到哪删除字符
        System.out.println(s1.length());
    }
    @Test
    public void test2(){

    }
}
