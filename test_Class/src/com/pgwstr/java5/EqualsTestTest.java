package com.pgwstr.java5;

import org.junit.jupiter.api.Test;

/**
 * @author 潘光伟
 * @date 2022/7/31 9:24 PM
 */

public class EqualsTestTest {
        @Test
        public void tetEqusls(){
            String s1 = "MM";
            String s2 = "MM";
            System.out.println(s1 == s2);
        }

        @Test
    public void Equslst(){
            EqualsTest.Customer t1 = new EqualsTest.Customer("Tom",21);
        EqualsTest.Customer t2 = new EqualsTest.Customer("Tom",21);
        System.out.println(t1 == t2);//false
        System.out.println(t1.equals(t2));//false-->true
        }

        @Test
    public void testtoString(){
            String s1 = new String("213123");
            System.out.println(s1.toString());
        }

}