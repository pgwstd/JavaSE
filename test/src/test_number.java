//
// Created by 潘光伟 on 2022/4/7.
//

import java.util.Scanner;
public class test_number {
    public static void main(String[] args) {
        int n1;
        int n2;
        System.out.println("请输入两个数:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        Number number=new Number(n1,n2);
        number.addition();
        number.subtration();
        number.multiplication();
        number.division();
    }

}
