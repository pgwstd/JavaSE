package com.arithmeticTest.java;
import java.util.Scanner;
public class test_24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base obj = (Base) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }

    public static String getClassName(Base obj) {

        //write your code here......
       return obj.getClass().getName();

    }

}

 class Bases {

}

class Sub1 extends Bases {

}

class Sub2 extends Bases {

}

