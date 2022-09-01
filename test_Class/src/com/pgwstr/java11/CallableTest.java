package com.pgwstr.java11;

import java.util.concurrent.Callable;

/**
 * @author pgwstr
 * @date 2022/9/1 22:03
 */


class NumThread implements Callable {


    public Object call() throws Exception{
        int sum = 0;
        for (int i = 0;i <= 100;i++){
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}


public class CallableTest {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();

    }
}
