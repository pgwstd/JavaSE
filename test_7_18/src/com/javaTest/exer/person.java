package com.javaTest.exer;

public class person {

    //属性设置
    private int age = 0;  //私有类

    //设置构架方法
    public  person(){
        age = 1;     //设置构架方法，默认值是1
    }
    //方法设置
    //设置年龄
    public void  setAge(int n){
        age = n;
    }
    //获取年龄
    public int getAge(){
        return age;
    }
}
