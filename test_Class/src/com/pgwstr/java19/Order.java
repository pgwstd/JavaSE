package com.pgwstr.java19;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderT=" + orderT +
                '}';
    }

    public <E> List<E> copy(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }

}
