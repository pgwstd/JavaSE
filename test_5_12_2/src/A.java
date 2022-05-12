/**
 * Created by 潘光伟 on 2022/5/12 19:07.
 */


public class A {
    public int f(int a, int b){
        if(b<a) {
            int temp=0;
            temp=a;
            a=b;
            b=temp;
        }//令b大于a
        int r=b % a;//%取除法的余数
        while(r!=0) {
            b=a;
            a=r;
            r=b%a;
        }
        return a;
    }
}
class E extends A {
    public int f(int a, int b) {
        int divisor=super.f(a,b);
        return (a*b)/divisor;
    }
}
class B {
    public static void main (String args[ ]) {

        A a=new A();
        System.out.println("最大公约数 ："+a.f(66,88));
        a = new E();
        System.out.println("最小公倍数 ："+a.f(66,88));

    }
}