package com.pgwstr.java18;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * @author pgwstr
 * @date 2022/10/4 12:46
 */

public class test {
    @Test
    public void test2() {
        HashSet hashSet = new HashSet();
        Person person = new Person(1001, "AA");
        Person person2 = new Person(1002, "BB");
        hashSet.add(person);
        hashSet.add(person2);
        System.out.println(hashSet);

        person.name = "CC";
        hashSet.remove(person);
        System.out.println(hashSet);
        hashSet.add(new Person(1001, "CC"));
        System.out.println(hashSet);
        hashSet.add(new Person(1001, "AA"));
        System.out.println(hashSet);

    }
}
