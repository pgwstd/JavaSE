package com.pgwstr.java3;

//多态方法练习
public class test {
    public static void main(String[] args) {
            test b1 = new test();
            b1.func(new Dog());
            b1.func(new Cat());

    }
    //多态调用的方法
    public void func(Animal animal){
            animal.eat();
            animal.shout();
    }
    //动物类
   public static class Animal{
        //动物进食方法
        public void eat(){
            System.out.println("动物：进食");
        }
        //动物叫方法
        public void shout(){
            System.out.println("动物：叫");
        }
    }
    //父类重写（小狗）
   public static class Dog extends Animal{
        //动物进食方法
        public void eat(){
            System.out.println("小狗吃骨头");
        }
        //动物叫方法
        public void shout(){
            System.out.println("小狗汪汪叫");
        }
    }

    //父类重写方法（小猫）
    public static class Cat extends Animal{
        //动物进食方法
        public void eat(){
            System.out.println("小猫吃鱼");
        }
        //动物叫方法
        public void shout(){
            System.out.println("小猫喵喵叫");
        }
    }
}
