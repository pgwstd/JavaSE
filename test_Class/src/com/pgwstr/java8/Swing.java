package com.pgwstr.java8;

/**
 * @author pgwstr
 * @date 2022/8/5 8:09 PM
 */
public class Swing {
    public static void main(String[] args) {
//        Man m1 = new Man();
//        m1.help();
        System.out.println("************");
        Man2 m2 = new Man2();
        m2.help();
    }
}
interface Filial {
    default void help(){
        System.out.println("老妈,我来救你了");
    }
}
interface Spoony{
    default void help(){
        System.out.println("媳妇，别怕,我来救你了");
    }
}

class Father{
    public void help(){
        System.out.println("儿子，救我媳妇");
    }
}

//class Man implements Filial,Spoony{
//    @Override
//    public void help() {
//        System.out.println("我该怎么办");
//        Filial.super.help();
//        Spoony.super.help();
//    }

    class Man2 extends Father implements Filial,Spoony {
        @Override
        public void help() {
            System.out.println("我该怎么办");
            Filial.super.help();
            Spoony.super.help();
        }
    }
