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
    }

    @Test
    public void test_2(){
        int count = 101;
        Float f = new Float(count);
        System.out.println(f.toString());
    }


}
