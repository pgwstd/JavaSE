package com.pgwstr.java6;

import org.junit.jupiter.api.Test;

/**
 * @author 潘光伟
 * @date 2022/8/1 9:52 AM
 */

public class WrapperTest {
    @Test
        public void test_1(){
            int num = 10;
//        System.out.println(num.toString());
        Integer i = new Integer(num);
        System.out.println(i.toString());

        Integer i2 = new Integer("123");
        System.out.println(i2.toString());

//        Integer i3 = new Integer("123abc");
//        System.out.println(i3.toString());
    }

    @Test
    public void test_2(){
        int count = 101;
        Float f = new Float(count);
        System.out.println(f.toString());

        Float f2 = new Float(3.123);
        Float f3 = new Float(4.5);
        System.out.println(f2);
        System.out.println(f3.toString());
    }


}
