package com.pgwstr.java13;

/**
 * @author pgwstr
 * @date 2022/9/11 23:54
 */

public class Test {
    public static void main(String[] args) {
        Girlfriend girl = new ChineseGirlfriend();
        Boy boy = new Boy();
        boy.setGirlfriend(girl);
        boy.showGirlfriend();
        girl = new AmericanGirlfriend();
        boy.setGirlfriend(girl);
        boy.showGirlfriend();
    }
}
