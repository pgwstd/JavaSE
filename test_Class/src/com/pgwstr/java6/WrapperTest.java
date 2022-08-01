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

        //自动装箱(不用new一个对象)
        int o = 20;
        Integer o1 = o;
        System.out.println(o1.toString());

        //自动拆箱(不用用floatVale来转换)
        Float g = new Float(24.1);
        float po = g;
        System.out.println(po);
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
@Test
    public void test_3(){
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("true");
        Boolean b4 = new Boolean("true123");
        Boolean b5 = new Boolean("TRUE");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5);
    }

    @Test
    public void test_4(){
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(13);
//        System.out.println(i1 + i2);
        int a = i1.intValue();
        int b = i2.intValue();
        System.out.println(a + b);


        Float f1 = new Float(12.4);
        Float f2 = new Float(22.1);
        float x = f1.floatValue();
        float y = f2.floatValue();
        System.out.println(f1 + f2);
    }

    @Test
    public void test_5(){
        int i = 10;
        //第一种通过连接运算来转换
        String s = i + "";
        System.out.println(s.toString());
        //第二种通过valueOf来转换
        float f = 12.3f;
        String s2 =  String.valueOf(f);
        System.out.println(s2);

        Double d = new Double(12.33);
        String s3 = String.valueOf(d);
        System.out.println(s3);
    }

    @Test
    public void test_6(){
        String i = "123";
        int n = Integer.parseInt(i);
        System.out.println(i);

        String b = "true";
        boolean b2 = Boolean.parseBoolean(b);
        System.out.println(b2);
    }
}
