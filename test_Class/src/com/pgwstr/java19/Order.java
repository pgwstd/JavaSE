package com.pgwstr.java19;

/**
 * @author pgwstr
 * @date 2022/10/15 23:10
 */

public class Order<T> {
   private int id;
   private String name;
    T orderT;

    public Order() {
    }

    public Order(int id, String name, T orderT) {
        this.id = id;
        this.name = name;
        this.orderT = orderT;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public T getOrderT() {
        return orderT;
    }

}
