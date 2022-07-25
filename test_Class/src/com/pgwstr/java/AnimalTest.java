package com.pgwstr.java;
/*
多态性练习
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal b1 = new Dog();
        b1.func(new Dog());
        b1.func(new Cat());
    }


}
