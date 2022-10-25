package com.pgwstr.java21;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author pgwstr
 * @date 2022/10/21 23:57
 */

public class FileTest {
    @Test
    public void test(){
        File file = new File("hello.txt");
        System.out.println(file);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

    }
    @Test
    public void test2(){
        File file = new File("hello.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
    }

    @Test
    public void test3() throws IOException {
        File file = new File("hell0.txt");
        if (!file.exists()){
            file.createNewFile();
            System.out.println("创建成功");
        }
        else {
            file.delete();
            System.out.println("删除成功");
        }
    }
    @Test
    public void test4(){
        File file = new File("/Users/panguangwei/Desktop//io//io1");
        boolean mkdir = file.mkdir();   //没有目录就不会创建
        if (mkdir){
            System.out.println("创建成功1");
        }

        File file1 = new File("/Users/panguangwei/Desktop//io//io2");
        boolean mkdirs = file1.mkdirs();    //没有目录直接创建
        if (mkdirs){
            System.out.println("创建成功2");
        }

    }
}
