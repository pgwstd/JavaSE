package com.pgwstr.java11;

/**
 * @author pgwstr
 * @date 2022/8/28 9:40 PM
 */

public class test {
    public static void main(String[] args) {

    }

    static class bank {
        private bank() {
        }

        private static bank instance = null;

        public static bank getInstance() {
            synchronized (bank.class) {
                if (instance == null) {
                    instance = new bank();
                }
                return instance;
            }
        }
    }
}
