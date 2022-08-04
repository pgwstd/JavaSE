package com.arithmeticTest.java;

/**
 * @author pgwstr
 * @date 2022/8/4 10:25 PM
 */
import java.util.Scanner;
public class test_26 {

    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }

}

interface Comparator {
    /**
     * 返回两个整数中的最大值
     */
    int max(int x, int y);
}

class ComparatorImpl implements Comparator{

    /**
     * 返回两个整数中的最大值
     *
     * @param x
     * @param y
     */
    @Override
    public int max(int x, int y) {
        return x > y ? x : y;
    }
}