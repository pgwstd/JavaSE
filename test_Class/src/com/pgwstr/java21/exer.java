package com.pgwstr.java21;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author pgwstr
 * @date 2022/10/25 17:19
 */

public class exer {
    @Test
    public void  test() throws IOException {
        File file = new File("//Users//panguangwei//Desktop//io//io1//hello.txt");
        File destfile = new File(file.getParent(), "haha.txt");
        boolean newFile = destfile.createNewFile();
        if (newFile){
            System.out.println("创建成功");
        }

        File file1 = new File("//Users//panguangwei//Desktop//io//io2");
        boolean mkdirs = file1.mkdirs();
        if (mkdirs){
            System.out.println("创建成功");
        }

        File file2 = new File("//Users//panguangwei//Desktop//io//io2");
        System.out.println(file2.delete());
    }

    @Test
    public void test2() throws IOException{

    }
}
