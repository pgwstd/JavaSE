//
// Created by 潘光伟 on 2022/4/7.
//


public class Number {
    private int n1;
    private int n2;
    Number(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    void addition(){
        System.out.println("两数相加"+(n1+n2));
    }
    void subtration(){
        System.out.println("两数相减"+(n1-n2));
    }
    void multiplication(){
        System.out.println("两数相乘"+(n1*n2));
    }
    void division(){
        System.out.println("两数相除"+(n1/n2));
    }

}

