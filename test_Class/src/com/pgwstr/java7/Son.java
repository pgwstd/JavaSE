package com.pgwstr.java7;

/**
 * @author pgwstr
 * @date 2022/8/3 2:52 PM
 */



class Father{
        //静态代码块
        static {
            System.out.println("111111111");
        }

        //非静态代码块
      {
          System.out.println("2222222222");
      }
      //构造方法
      public Father(){
          System.out.println("333333333");
      }
    }

 public class Son extends Father{
        static {
            System.out.println("444444444");
        }

        {
            System.out.println("5555555555");
        }

        public Son(){
            System.out.println("6666666666");
        }

      public static void main(String[] args) {
          System.out.println("77777777");
          System.out.println("*****************");
          new Son();
          System.out.println("*****************");
          new Son();
          System.out.println("*****************");
          new Father();


      }
    }


