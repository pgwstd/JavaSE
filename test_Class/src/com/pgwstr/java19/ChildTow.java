package com.pgwstr.java19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgwstr
 * @date 2022/10/15 23:18
 */

public class ChildTow extends Order<String> {
    private int BankId;
    private String BankName;

    public ChildTow() {
    }

    public ChildTow(int bankId, String bankName) {
        BankId = bankId;
        BankName = bankName;
    }

    public ChildTow(int id, String name, String orderT, int bankId, String bankName) {
        super(id, name, orderT);
        BankId = bankId;
        BankName = bankName;
    }

    public <E> List<E> copy(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
