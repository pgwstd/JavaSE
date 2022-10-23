package com.pgwstr.java21;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author pgwstr
 * @date 2022/10/21 23:57
 */

public class FileTest {
    @Test
    public void test(){
        File file = new File("hello.txt");
        System.out.println(file);
    }
}
