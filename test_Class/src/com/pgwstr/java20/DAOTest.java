package com.pgwstr.java20;

import java.util.List;

/**
 * @author pgwstr
 * @date 2022/10/21 20:00
 */

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();
        dao.save("1001",new User(1001,34,"jack"));
        dao.save("1002",new User(1002,20,"Tom"));
        dao.save("1003",new User(1003,33,"Moke"));
        dao.save("1004",new User(1004,21,"Pop"));
        dao.save("1005",new User(1005,14,"Kaili"));
        dao.dalete("1004");
        dao.save("1003",new User(1003,33,"yun"));
        List<User> list = dao.list();
        list.forEach(System.out::println);
    }

}
