package com.pgwstr.java8;

/**
 * @author pgwstr
 * @date 2022/8/4 7:41 PM
 */

public abstract class Employee {


    private String name;
    private int id;
    private double salary;

    //构造器
    public Employee(){

    }
    //构造器
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //抽象方法
    public abstract void work();


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


}
