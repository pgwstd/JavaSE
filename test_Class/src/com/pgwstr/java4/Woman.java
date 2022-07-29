package com.pgwstr.java4;
//女人类
public class Woman extends Person{
    private String cook_dinner;
    private String Wash_clothes;

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    public String getCook_dinner() {
        return cook_dinner;
    }

    public String getWash_clothes() {
        return Wash_clothes;
    }

    public void setCook_dinner(String cook_dinner) {
        this.cook_dinner = cook_dinner;
    }

    public void setWash_clothes(String wash_clothes) {
        Wash_clothes = wash_clothes;
    }

    public void eat(){
        System.out.println("女人要多吃菜");
    }

    public void sleep(){
        System.out.println("女人要多睡觉");
    }

    public void bady(){
        System.out.println("女人要看小孩");
    }

}
