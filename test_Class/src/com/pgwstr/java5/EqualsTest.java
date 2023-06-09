package com.pgwstr.java5;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author 潘光伟
 * @date 2022/7/30 6:43 PM
 */

public class EqualsTest {
    @Test
    public static void main(String[] args) {
//        int i = 10;
//        char c = 10;
//        double d = 10;
//        Scanner scanner = new Scanner(System.in);
//        int a =scanner.nextInt();
//        Map map = new HashMap();
//        System.out.println(i == c);
//        System.out.println(i == d);
//        System.out.println(c == d);

//        Customer t1 = new Customer("Tom",21);
//        Customer t2 = new Customer("Tom",21);
//        System.out.println(t1 == t2);//false
//        System.out.println(t1.equals(t2));//false-->true
//        System.out.println("*************");
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        System.out.println(s1 == s2);//false
//        System.out.println(s1.equals(s2));//true
//        System.out.println("************");
//        Date d1 = new Date(123323l);
//        Date d2 = new Date(123323l);
//        System.out.println(d1.equals(d2));//true
          Customer s1 = new Customer("tom",21);
          System.out.println(s1.toString());//没重写toString时输出的是地址值,重写后就会返回其内容

          Date d3 = new Date(21313233l);
          System.out.println(d3.toString());
    }
    
    /**
     * @author 潘光伟
     * @date 2022/7/30 7:31 PM
     */
    
static class  Customer{
        private String name;
        private int age;
        public Customer(){

        }
        public Customer(String name,int age){
            this.name = name;
            this.age = age;
        }

        /**
         * @author 潘光伟
         * @date 2022/7/31 7:53 PM
         * 重写equals
         */

        public boolean equals(Object o){
            //如果两个地址相对就直接返回true
                if (this == o){
                    return true;
                }
                //如果地址不同就比较他俩的元素是否相同
                //看是0是否Cutomer的父类
                if (o instanceof Customer){
                    Customer c1 = (Customer) o;
                    //比较这两个元素的内容
                    if (this.age == c1.age && this.name.equals(c1.name)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                return false;
        }
        /**
         * @author 潘光伟
         * @date 2022/7/31 7:54 PM
         */
        //重写toString
        public String toString(){
            return "["+ name + " " + age + "]";
        }
}
}
