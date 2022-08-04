package com.pgwstr.java8;

/**
 * @author pgwstr
 * @date 2022/8/4 7:53 PM
 */

public class Manager extends Employee {
    private double bonus;

    public Manager(double bonus){
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary,double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    //要重写抽象方法不然会报错，也可以在class加入abstract
    public void work() {
        System.out.println("管理员工，好好工作");
    }
}
