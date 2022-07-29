package com.pgwstr.java4;
//男人类
public class Man extends Person{
    private String playgame;
    private String work;


    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }


    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setPlaygame(String playgame) {
        this.playgame = playgame;
    }

    public String getPlaygame() {
        return playgame;
    }

    public void eat(){
        System.out.println("男人要吃肉");
    }

    public void sleep(){
        System.out.println("男人少睡觉");
    }

    public void play(){
        System.out.println("男人喜欢打游戏");
    }

    public void work(){
        System.out.println("男人要工作");
    }

}
